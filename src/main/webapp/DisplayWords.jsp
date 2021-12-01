<%@page import = "com.Entity.*" %>
<%@page import = "com.Dao.*" %>
<%@page import = "java.util.*" %>
<%@page import = "com.Helper.*" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/word.css">
    <title>Document</title>
</head>
<body>

<%@ include file = "nav.jsp" %>
    <div class = "word-container">

<%

User newuser = (User)session.getAttribute("user");
if(newuser != null){
	
	WordDao wd = new WordDao(ConnectionProvider.getConnection());
	ArrayList<Word> res = wd.getWordByUser(newuser.getUserid());
	
	for(Word w : res){
		
	System.out.println(w);

%>

        <div class = "word-card">
        <div class="word-details">
            <h2><%= w.getWord() %></h2>
        <p class ="meaning-text" ><%= w.getMeaning() %> </p>
        <p class="time"><%= w.getDate() %></p>
        </div>
        <div class="word-control">
            <a class = "word-delete" href="#">Delete</a>
            <a class = "word-update" href="#">Update</a>
        </div>   
        </div>

 <%
 
	}
}
 %>
    </div>
</body>
</html>