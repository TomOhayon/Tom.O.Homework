package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	// מחרוזת המתארת היכן מסד הנתונים נמצא:
	

	private static String connectionString = "jdbc:derby://localhost:1000/JBDB;create=true";
	
	
	//-------------------------יצירת טבלה-----------------------------
	public static void buildDB() {
		try {
			
			// Create a connection to the database: 
			Connection connection = DriverManager.getConnection(connectionString);
			
		
			
			//הגדרת השאילתא בתור מחרוזת פשוטה
			String sql = "create table Students (" +
				"id integer not null primary key generated always as identity, " +
				"name varchar(50) not null, " +
				"age integer not null)";
			
			
			// אובייקט המתאר פקודה לביצוע על מסד הנתונים
			Statement statement = connection.createStatement();
			
			// בצע את השאילתה הנ"ל
			statement.executeUpdate(sql);
			
			System.out.println("Students table has been created.");			
		}
		catch(Exception ex) {
			 System.out.println(ex.getMessage());
		}
	}
	
	
	//-------------------------הכנסת נתונים לטבלה-----------------------------
	public static void insert(int id,String name, int age) throws SQLException {
		
		// Create a connection: 
		Connection connection = DriverManager.getConnection(connectionString);
		
		// Create sql statement: 
		String sql = String.format("insert into Students(name, age) values('%s', %d)",name, age);
		
		// Create object which can execute the above sql and return the new id:
		PreparedStatement preparedStatement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
		
		// Execute (the insert command):
		preparedStatement.executeUpdate();
		
		// Retrieves any auto-generated keys created as a result of executing this Statement object (returns ResultSet)
		ResultSet resultSet = preparedStatement.getGeneratedKeys();
		
		resultSet.next();
		
		System.out.println("Insert succeeded. New create id: " + id);
	}
		
	
	
	//-------------------------קריאת נתונים מהטבלה-----------------------------
	public static void readAll() throws SQLException {
		
		// Create a connection: 
		Connection connection = DriverManager.getConnection(connectionString);
		
		// Create a statement object which can read data: 
		Statement statement = connection.createStatement();
		
		// Create sql statement for reading data: 
		String sql = "select * from Students";
		
		// Execute the query and return an object which contains the data (the table):
		ResultSet resultSet = statement.executeQuery(sql);
		
		
		
		//loop over the rows in the ResultSet
		// next() - Moves the cursor forward one row from its current position - returns true if the new current row is valid; false if there are no more rows
		while(resultSet.next()) {
			
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			int age = resultSet.getInt("age");
			
			System.out.println("id: " + id + ", name: " + name + ", age: " + age);	
		}
	}
	
	
	
	//-------------------------עידכון נתונים בטבלה-----------------------------
	public static void update(int id, String name, int age) throws SQLException {
		
		// Create a connection: 
		Connection connection = DriverManager.getConnection(connectionString);
		
		// Create an update sql statement: 
		String sql = String.format("update Students set name='%s', age=%d where id=%d", name, age, id);
		
		// Create an object for executing the above sql: 
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.executeUpdate();
		
		System.out.println("Update succeeded.");
	}
	
	
	
	//-------------------------מחיקת נתונים מהטבלה-----------------------------
	public static void delete(int id) throws SQLException {
		
		// Create a connection: 
		Connection connection = DriverManager.getConnection(connectionString);
		
		// Create sql command for delete one record: 
		String sql = String.format("delete from Students where id=%d", id);
		
		// Create an object for executing the above command: 
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		// Execute: 
		preparedStatement.executeUpdate();
		
		System.out.println("Delete succeeded.");
	}
	
	
	
	public static void main(String[] args) {
		
		try {
			
			// הוראה לג'אווה להכיר את הדרייבר של דרבי
			// דרייבר הוא מנגנון ההתחברות למסד הנתונים
			Class.forName("org.apache.derby.jdbc.ClientDriver");
	
			//buildDB();
			

			insert(301872537,"TOM",30);
			insert(375647465,"BAR",25);
			insert(275644846,"DAVID",48);
			insert(564746594,"LIAT",35);
			insert(236459534,"YANIV",33);
			
			
			readAll();
		}
		catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		

	}

}
