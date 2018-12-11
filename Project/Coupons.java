import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Coupons {
	public static void create() throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement()
				.executeUpdate("CREATE TABLE IF NOT EXISTS coupons (ID INT(200) NOT NULL AUTO_INCREMENT ,"
						+ " COMPANY_ID int(10) NOT NULL REFERENCES companies(ID),"
						+ " CATEGORY_ID int(10) NOT NULL REFERENCES categories(ID),"
						+ " TITLE  VARCHAR(25) NOT NULL, DESCRIPTION TEXT DEFAULT NULL, START_DATE DATETIME,"
						+ " END_DATE DATETIME, AMOUNT INTEGER(200), PRICE FLOAT(30),IMAGE VARCHAR(20) ,PRIMARY KEY(ID) )");
		System.out.println("Coupons table has been created");
	}

	public static void showAll() throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		ResultSet re = Stream.createStatement().executeQuery("SELECT * FROM coupons");
		while (re.next())
			System.out.println("ID: " + re.getInt("ID") + " ,COMPANY_ID: " + re.getInt("COMPANY_ID") + " ,CATEGORY_ID: "
					+ re.getInt("CATEGORY_ID") + "TITLE: " + re.getInt("TITLE") + " ,DESCRIPTION: "
					+ re.getString("DESCRIPTION") + " ,START_DATE: " + re.getDate("START_DATE") + " ,END_DATE: "
					+ re.getDate("END_DATE") + " ,AMOUNT: " + re.getInt("AMOUNT") + " ,PRICE: " + re.getFloat("PRICE")
					+ " ,IMAGE: " + re.getString("IMAGE"));
	}

	public static void update(int companyId, int categoryId, String title, String text, Date startDate, Date endDate,
			Integer amount, float price, String image, int index) throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement()
				.executeUpdate("UPDATE coupons SET TITLE='" + title + "',DESCRIPTION='" + text + "', START_DATE="
						+ startDate + ", END_DATE=" + endDate + ", AMOUNT=" + amount + ", PRICE=" + price + ", IMAGE='"
						+ image + "' WHERE ID=" + index);
		System.out.println("Coupons table has been updated");
	}

	public static void insert(String title, String text, Date startDate, Date endDate, Integer amount, float price,
			String image) throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate(
				"insert into coupons (TITLE,DESCRIPTION,START_DATE,END_DATE,AMOUNT,PRICE,IMAGE) values ('" + title
						+ "','" + text + "'," + startDate + "," + endDate + ",'" + amount + "'," + price + ",'" + image
						+ "')");
		System.out.println("Coupons insertion succeeded");
	}

	public static void drop() throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate("DROP TABLE coupons");
		System.out.println("Coupons table has been dropped");
	}

	public static void delete(int indexToDelete) throws SQLException {
		Connection Stream = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
		Stream.createStatement().executeUpdate("DELETE FROM coupons WHERE ID=" + indexToDelete);
		System.out.println("Deletion from coupons table has been completed");
	}

}
