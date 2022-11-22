package practice_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Non_Select_Query_2 {

	public static void main(String[] args) throws Throwable {
        Driver driver = new Driver();
		
		//step1: register the database----->it is optional for the mysql version greater than 4.0
		DriverManager.registerDriver(driver);
		
		//step2: get connection for the database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
		
		//step3:issue create statement
		Statement stat = con.createStatement();
		
		//step4:execute the query
		int result = stat.executeUpdate("insert into alpha values(40,'shivamma'),(50,'ramaiah');");

		if (result==2) {
			System.out.println("data updated passed");
		} else {
			System.out.println("data updated failed");
		}
		
		//step5:close the database
		con.close();
	}
}
