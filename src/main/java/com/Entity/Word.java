package com.Entity;

import java.sql.Date;

public class Word {

	private int wordid;
	private String word;
	private String meaning;
	private String sentence;
	private java.sql.Date date;
	private int userid ;
	
	
	
	
	
	public Word(String word, String meaning, String sentence, Date date) {
		super();
		this.word = word;
		this.meaning = meaning;
		this.sentence = sentence;
		this.date = date;
	}
	public Word(String word, String meaning, String sentence,  int userid) {
		super();
		this.word = word;
		this.meaning = meaning;
		this.sentence = sentence;
		this.userid = userid;
	}
	public Word(String word, String meaning, String sentence, Date date, int userid) {
		super();
		this.word = word;
		this.meaning = meaning;
		this.sentence = sentence;
		this.date = date;
		this.userid = userid;
	}
	public Word(int wordid, String word, String meaning, String sentence, Date date, int userid) {
		super();
		this.wordid = wordid;
		this.word = word;
		this.meaning = meaning;
		this.sentence = sentence;
		this.date = date;
		this.userid = userid;
	}
	public int getWordid() {
		return wordid;
	}
	public void setWordid(int wordid) {
		this.wordid = wordid;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	public java.sql.Date getDate() {
		return date;
	}
	public void setDate(java.sql.Date date) {
		this.date = date;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Word [wordid=" + wordid + ", word=" + word + ", meaning=" + meaning + ", sentence=" + sentence
				+ ", date=" + date + ", userid=" + userid + "]";
	}
	
}
