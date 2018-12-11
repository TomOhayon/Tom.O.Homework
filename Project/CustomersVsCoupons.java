import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomersVsCoupons {
	public static void create() throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate(
				"CREATE TABLE IF NOT EXISTS customersVsCoupons (CUSTOMER_ID INT(8) NOT NULL REFERENCES customers(ID),"
						+ "COUPON_ID INT(8) NOT NULL REFERENCES coupons(ID)," + "PRIMARY KEY(CUSTOMER_ID,COUPON_ID))");
		System.out.println("CustomersVsCoupons table has been created");
	}

	public static void showAll() throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		ResultSet re = Stream.createStatement().executeQuery("SELECT * FROM customersVsCoupons");
		while (re.next())
			System.out
					.println("CUSTOMER_ID: " + re.getInt("CUSTOMER_ID") + " ,COUPON_ID: " + re.getString("COUPON_ID"));
	}

	public static void update(int customerId, int couponId) throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement()
				.executeUpdate("UPDATE customersVsCoupons SET CUSTOMER_ID=" + customerId + " COUPON_ID=" + couponId);
		System.out.println("CustomersVsCoupons table has been updated");
	}

	public static void insert(int customerId, int couponId) throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate(
				"insert into customersVsCoupons (CUSTOMER_ID,COUPON_ID) values (" + customerId + "," + couponId + ")");
		System.out.println("CustomersVsCoupons insertion succeeded");
	}

	public static void drop() throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate("DROP TABLE customersVsCoupons");
		System.out.println("CustomersVsCoupons table has been dropped");
	}

	public static void delete(int customerId, int couponId) throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate(
				"DELETE FROM customersVsCoupons WHERE ID=CUSTOMER_ID" + customerId + ", COUPON_ID=" + couponId);
		System.out.println("Deletion from customersVsCoupons table has been completed");
	}

}
