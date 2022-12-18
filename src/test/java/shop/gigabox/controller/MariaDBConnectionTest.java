package shop.gigabox.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import org.junit.Test;


public class MariaDBConnectionTest {
	
	private static final Logger log = Logger.getLogger(MariaDBConnectionTest.class);
    	String url ="jdbc:mariadb://34.127.85.31:3306/user=Root&password=password";
	
	@Test
	public void connectionTest() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			log.info("### connection : " +  connection + " - 연결 성공 ####");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}