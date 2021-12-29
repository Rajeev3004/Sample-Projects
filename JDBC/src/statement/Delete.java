package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete 
{
	public static void main(String[] args) throws ClassNotFoundException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("delete from employees where empid=3");
		System.out.println("one row deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
