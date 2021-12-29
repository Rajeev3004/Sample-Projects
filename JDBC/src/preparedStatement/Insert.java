package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insert 
{
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			PreparedStatement pstmt=con.prepareStatement("insert into employees values(?,?,?)");	
			pstmt.setInt(1, Integer.parseInt("5"));
			pstmt.setString(2, "yuvi");
			pstmt.setString(3, "amritsar");
			pstmt.executeUpdate();
			System.out.println("one record inserted");
			pstmt=con.prepareStatement("select name from employees where empid=? ");
			pstmt.setInt(1,Integer.parseInt("5"));
			ResultSet rs=pstmt.executeQuery();
			rs.next();
			System.out.println("name is "+rs.getString(1));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
