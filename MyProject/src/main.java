import java.sql.*;

public class main {
	
	private static final String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
	
	private static final String username = "root";
	
	private static final String password = "kiran123";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
