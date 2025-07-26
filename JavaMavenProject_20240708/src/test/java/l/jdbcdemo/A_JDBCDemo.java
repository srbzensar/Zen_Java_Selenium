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
				
				//2. Establish the connection
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
//				college is the db name
//				System.out.println("Connected");
//				System.out.println(con.getClass().getName());
				
//				students table 
				String query = "select ROLL_NO, NAME, CITY from students";
				Statement statement = con.createStatement();
				
//				A ResultSet object maintains a cursor that points to the current row in the result set.
//				The term "result set" refers to the row and column data contained in a ResultSet object.
		
				ResultSet resultSet = statement.executeQuery(query);
				while(resultSet.next())
				{
					System.out.print(resultSet.getInt(1) + " ");
					System.out.print(resultSet.getString(2) + " ");
					System.out.print(resultSet.getString(3));
					System.out.println("\n************************\n");
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

	
	

