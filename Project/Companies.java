import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Companies {

	public static void create() throws SQLException {
		Connection stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		stream.createStatement().executeUpdate(
				"CREATE TABLE IF NOT EXISTS companies (ID INT(9) NOT NULL AUTO_INCREMENT ,NAME VARCHAR(12) NOT NULL,"
						+ "EMAIL VARCHAR(30) NOT NULL,PASSWORD VARCHAR(8) NOT NULL,PRIMARY KEY(ID))");
		System.out.println("Companies table has been created");
	}

	public static void showAll() throws SQLException {
		Connection stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		ResultSet result = stream.createStatement().executeQuery("SELECT * FROM companies");
		while (result.next())
			System.out.println("ID: " + result.getInt("ID") + " ,NAME: " + result.getString("NAME") + " ,EMAIL: "
					+ result.getString("EMAIL") + " ,PASSWORD:" + result.getString("PASSWORD"));
	}

	public static void update(String name, String email, String passWord, int index) throws SQLException {
		Connection stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		stream.createStatement().executeUpdate("UPDATE companies SET NAME='" + name + "', EMAIL='" + email
				+ "', PASSWORD='" + passWord + "' WHERE ID=" + index);
		System.out.println("Companies table has been updated");
	}

	public static void insert(String name, String email, String password) throws SQLException {
		Connection stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		stream.createStatement().executeUpdate("INSERT INTO companies (NAME,EMAIL,PASSWORD) VALUES('" + name + "','"
				+ email + "','" + password + "')");
		System.out.println("Companies insertion succeeded");
	}

	public static void drop() throws SQLException {
		Connection stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		stream.createStatement().executeUpdate("DROP TABLE companies");
		System.out.println("Companies table has been dropped");
	}

	public static void delete(int indexToDelete) throws SQLException {
		Connection stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		stream.createStatement().executeUpdate("DELETE FROM companies WHERE ID=" + indexToDelete);
		System.out.println("Deletion from companies table has been completed");
	}

}
