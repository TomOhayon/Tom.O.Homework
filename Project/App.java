import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	private static String connectionString = "jdbc:derby://localhost:1004/JBDB;create=true";
	String url = "jdbc:mysql://localhost:1004/testdb?useSSL=false";
	public static String USERNAME = "root";
	public static String PASSWORD = null;
	public final static String URL = "jdbc:mysql://localhost:1004/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection(connectionString);
			Companies.create();
			Customers.create();
			Categories.create();
			Coupons.create();
			CustomersVsCoupons.create();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
