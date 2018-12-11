import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customers {
	public static void create() throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate(
				"CREATE TABLE IF NOT EXISTS customers (ID INT(8) NOT NULL AUTO_INCREMENT ,FIRST_NAME VARCHAR(8) NOT NULL,lAST_NAME VARCHAR(12) DEFAULT NULL,EMAIL VARCHAR(30) DEFAULT NULL,PASSWORD VARCHAR(8) NOT NULL,PRIMARY KEY(ID))");
		System.out.println("Customers table has been created");
	}

	public static void showAll() throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		ResultSet re = Stream.createStatement().executeQuery("SELECT * FROM customers");
		while (re.next())
			System.out.println("ID: " + re.getInt("ID") + " ,FIRST_NAME: " + re.getString("FIRST_NAME")
					+ " ,lAST_NAME: " + re.getString("lAST_NAME") + " ,EMAIL: " + re.getString("EMAIL") + " ,PASSWORD:"
					+ re.getString("PASSWORD"));
	}

	public static void update(String firstName, String lastName, String email, String passWord, int index)
			throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate("UPDATE customers SET FIRST_NAME='" + firstName + "',lAST_NAME='"
				+ lastName + "', EMAIL='" + email + "', PASSWORD='" + passWord + "' WHERE ID=" + index);
		System.out.println("Customers table has been updated");
	}

	public static void insert(String firstName, String lastName, String email, String password) throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate("insert into customers (FIRST_NAME,lAST_NAME,EMAIL,PASSWORD) values ('"
				+ firstName + "','" + lastName + "','" + email + "','" + password + "')");
		System.out.println("Customers insertion succeeded");
	}

	public static void drop() throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate("DROP TABLE customers");
		System.out.println("Customers table has been dropped");
	}

	public static void delete(int indexToDelete) throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate("DELETE FROM customers WHERE ID=" + indexToDelete);
		System.out.println("Deletion from customers table has been completed");
	}

}
