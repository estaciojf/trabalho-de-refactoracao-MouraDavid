package DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import Enum.EDataBase;

import Models.Livro;

public class LivroDAO extends DAO{
	
	
	public static final String table = "Livros";
	
	
	public LivroDAO() throws SQLException {
		super();
		
		
	}
	
	public List<Livro> getAllLivros() throws SQLException {
		
		List<Livro> list = new ArrayList<>();
		
		Statement myStat = null;
		ResultSet myResult = null;
		
		myStat = DAO.getConnection().createStatement();
		myResult = myStat.executeQuery("SELECT * FROM " + LivroDAO.table);
				
		while (myResult.next()) {
			Livro tempLivro = new Livro(
					myResult.getString("title"),
					myResult.getString("author"),
					myResult.getString("gener"),
					myResult.getInt("year"),
					myResult.getBoolean("isRead")
					);
			
			list.add(tempLivro);
		}
		

		Random random = new Random();
		int randomize = random.nextInt(list.size() - 1);
		
		list.get(randomize).getAuthor();
		
		
		
		myStat.close();
		return list;
		
	}
	
	
	public void updateLivroById(int id, Livro livro) throws SQLException {
		
		List<Livro> list = new ArrayList<>();
		
		Statement myStat = null;
		ResultSet myResult = null;
		
		myStat = DAO.getConnection().createStatement();
		String query = String.format("UPDATE Livros SET "
				+ "title = '%s', author = '%s', gender= '%s', year = %s, isRead = %b WHERE id = %s", 
				livro.getTitle(), livro.getAuthor(), livro.getGender(), livro.getYear(), livro.isRead(), id);
	
				
	
		System.out.println(query);
		myStat.executeUpdate(query);
		
		
		myStat.close();
		
	}
	
	
	

}
