package com.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.Entity.Word;

public class WordDao {

	private Connection connection;
	
	public WordDao(Connection connection) {
		this.connection = connection;
	}
	
	
	public boolean saveword(Word word) {
		boolean flag = false;
		try {
			PreparedStatement ps = connection.prepareStatement("insert into tbl_word(word, meaning, sentence, userid) values (?, ?, ?, ?);");
			ps.setString(1, word.getWord());
			ps.setString(2, word.getMeaning());
			ps.setString(3, word.getSentence());
			ps.setInt(4, word.getUserid());
			
			ps.execute();
			flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
	public ArrayList<Word> getWordByUser(int userid){
		
		ArrayList<Word> list = new ArrayList<Word>();
		try {
			PreparedStatement pd = connection.prepareStatement("select * from tbl_word where userid = ?;");
			pd.setInt(1, userid);
			ResultSet rs = pd.executeQuery();
			
			while(rs.next()) {
				String word = rs.getString("word");
				String meaning = rs.getString("meaning");
				String sentence = rs.getString("sentence");
				java.sql.Date date = rs.getDate("registerdate");
				
				Word w = new Word(word, meaning, sentence, date, userid);
				list.add(w);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
