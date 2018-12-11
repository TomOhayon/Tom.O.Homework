import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Categories {
	public static void create() throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate(
				"CREATE TABLE IF NOT EXISTS categories (ID INT(8) NOT NULL AUTO_INCREMENT ,NAME VARCHAR(12) NOT NULL,PRIMARY KEY(ID))");
		System.out.println("Categories table has been created");
	}

	public static void showAll() throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		ResultSet re = Stream.createStatement().executeQuery("SELECT * FROM categories");
		while (re.next())
			System.out.println("ID: " + re.getInt("ID") + " ,NAME: " + re.getString("NAME"));
	}

	public static void update(String Name, int index) throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate("UPDATE categories SET NAME='" + Name + "' WHERE ID=" + index);
		System.out.println("Categories table has been updated");
	}

	public static void insert(String Name) throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate("insert into categories (NAME) values ('" + Name + "')");
		System.out.println("Categories insertion succeeded");
	}

	public static void drop() throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate("DROP TABLE categories");
		System.out.println("Categories table has been dropped");
	}

	public static void delete(int indexToDelete) throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate("DELETE FROM categories WHERE ID=" + indexToDelete);
		System.out.println("Deletion from categories table has been completed");
	}

}
