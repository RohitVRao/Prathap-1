package practice_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Read_Data_From_Database_2 {

	public static void main(String[] args) throws Throwable {
		Driver driver = new Driver();
		
		//step1: register the database----->it is optional for the mysql version greater than 4.0
		DriverManager.registerDriver(driver);
		
		
		//step2: get connection for the database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
		
		
		//step3:issue create statement
		Statement stat = con.createStatement();
		
		
		//step4:execute the query
		ResultSet result = stat.executeQuery("select * from sdet43;");
		while (result.next()) {
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
		}
		
		//step5:close the database
		con.close();
	}
}
