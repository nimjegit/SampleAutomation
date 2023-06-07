package writesampletestcase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		
		//Class.forName("com.oracle.jdbc.Driver");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Step1
		Connection con = DriverManager.getConnection(
		"jdbc:oracle:thin://localhost:1521/Oracle_SQLDB","system","system");
		
		//system@//localhost:1521/xe
		//jdbc:< dbtype>://ipaddress:portnumber/db_name” <dbtype>-
		
		Statement stmt =con.createStatement();
		
		
		ResultSet rs=stmt.executeQuery("Select ProductName,Price from ProductsDetails");
		
		System.out.println("Print the result" +rs);
		
		con.close();
		
		System.out.println("Program is executed");
	}

}
