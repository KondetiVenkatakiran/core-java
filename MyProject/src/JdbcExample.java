import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		step-1 register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		step-2 Establish the connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root","root","kiran123");
		System.out.println("connection created");
		
	}

}
