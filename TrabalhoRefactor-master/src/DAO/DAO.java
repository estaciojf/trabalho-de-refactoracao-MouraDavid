package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Enum.EDataBase;

public abstract class DAO {

	private static Connection myConn;
	
	public DAO() throws SQLException {
		
		myConn = DriverManager.getConnection(EDataBase.DB_URL, EDataBase.DB_USER, EDataBase.DB_PASS);
		System.out.print("Conectado!");
	}
	
	public static Connection getConnection() {
		return myConn;
	}
}
