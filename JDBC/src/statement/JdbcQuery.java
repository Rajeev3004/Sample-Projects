package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcQuery 
{
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			Statement stmt=con.createStatement();
		    ResultSet rs=stmt.executeQuery("select * from employees");
		    ResultSetMetaData mt=rs.getMetaData();
		    for(int i=1;i<=mt.getColumnCount();i++) {
		    	System.out.print(mt.getColumnName(i)+"\t");
		    }
		    System.out.println();
			while(rs.next()) {
				for(int i=1;i<=mt.getColumnCount();i++) 
				{
				System.out.print(rs.getString(i)+"\t");
				}
				System.out.println();
			}
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		}
	}

}
