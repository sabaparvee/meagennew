package com.maegen.generic.databaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtility {
		Connection conn;
		public void getConn(String url,String username,String password) {
			try{
				Driver mySqldriver=new Driver();
			DriverManager.registerDriver(mySqldriver);
			conn = DriverManager.getConnection(url, username, password);
			}catch(Exception e) {
				System.out.println("exception handles");
			}
		}
		public void getConn() {
			try{
				Driver mySqldriver=new Driver();
			DriverManager.registerDriver(mySqldriver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "root");
			}catch(Exception e) {
				System.out.println("exception handles");
			}
		}
		public int executeNonSelectQuery(String query) throws SQLException {
			Statement stat=conn.createStatement();
			int result = stat.executeUpdate(query);
			return result;
			
		}
		public ResultSet executeSelectQuery(String query) throws SQLException {
			Statement stat=conn.createStatement();
			ResultSet result = stat.executeQuery(query);
			return result;

		}
		public void closedbConnection() {
			try {
				conn.close();
			} catch (SQLException e) {
				
			}
		}
		
		
	

}
