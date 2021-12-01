package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.WordDao;
import com.Entity.User;
import com.Entity.Word;
import com.Helper.ConnectionProvider;

public class WordStorage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public WordStorage() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

		String word = req.getParameter("word");
		String meaning = req.getParameter("meaning");
		String sen1 = req.getParameter("sentence1");
		String sen2 = req.getParameter("sentence2");
		String sen3 = req.getParameter("sentence3");
		
		StringBuilder sentence = new StringBuilder();
		
		if(!sen1.equals(" ")) {
			sentence.append(sen1);
		}
		if(!sen2.equals(" ")) {
			sentence.append(",").append(sen2);
		}
		if(!sen3.equals(" ")) {
			sentence.append(",").append(sen3);
		}
		
		String usedSentences = sentence.toString();
		
		User user = (User) req.getSession().getAttribute("user");
		Word wordObj = new Word(word, meaning, usedSentences, user.getUserid());
		
		WordDao wd = new WordDao(ConnectionProvider.getConnection());
		boolean isSuccess = wd.saveword(wordObj);
		
		if(isSuccess) {
			response.sendRedirect("DisplayWords.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
