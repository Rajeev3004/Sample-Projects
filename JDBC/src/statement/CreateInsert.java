package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateInsert {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("drop table if exists sal");
		stmt.execute("create table sal(sal int, hra int)");
		System.out.println("Table created");
		stmt.executeUpdate("insert into sal values(20000,5000)");
		stmt.executeUpdate("insert into sal values(25000,8000)");
		ResultSet rs = stmt.executeQuery("select * from sal");
		ResultSetMetaData mt = rs.getMetaData();
		for (int i = 1; i <= mt.getColumnCount(); i++) {
			System.out.print(mt.getColumnName(i) + "\t");
		}
		System.out.println();
		while (rs.next()) {
			for (int i = 1; i <= mt.getColumnCount(); i++) {
				System.out.print(rs.getString(i) + "\t");
			}
			System.out.println();
		}

	}

}
