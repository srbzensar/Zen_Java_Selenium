package l.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A_JDBCDemo {	

		public static void main(String[] args) {
			Connection con = null;
			try {
				//1. Load driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//DriverManager.getDriver("com.mysql.jdbc.Driver");
				
				//2. Establish the connection
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "123456");
//				basicjavapractice is the db name
				System.out.println("Connected");
				System.out.println(con.getClass().getName());
				
//				student_info table 
				String query = "select * from students";
				Statement statement = con.createStatement();
				
//				A ResultSet object maintains a cursor that points to the current row in the result set.
//				The term "result set" refers to the row and column data contained in a ResultSet object.
		
				ResultSet resultSet = statement.executeQuery(query);
				while(resultSet.next()){
					System.out.println(resultSet.getInt(1));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getString(3));
					System.out.println("************************");
					
					//System.out.println(resultSet.getString(1)+ " \t " + resultSet.getString(2)+ "\t " +resultSet.getString(3));
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	
	

