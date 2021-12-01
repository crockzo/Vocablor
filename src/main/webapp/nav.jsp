
<%@page isELIgnored = "false" %>
<%@page import = "com.Entity.User" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/navcss.css">
</head>
<body>



  <% User user = (User) session.getAttribute("user");
 		if(user == null){
 			
 		
  %>
    <nav class="nav-bar">
        <ul class="list">
            <li class="list-ele1"><a href = "userForm.jsp">Register</a></li>
            <li class="list-ele2"><a href="loginForm.jsp">Login</a></li>
            <li class="list-ele3">Word Dictonary</li>
        </ul>

    </nav>
    
  <%  
  
 		}else{  %>
  
  <nav class="nav-bar">
        <ul class="list">
            <li class="list-ele1"><a href = "#">Profile</a></li>
            <li class="list-ele5"><a href = "WordForm.jsp">Add Word</a></li>
            <li class="list-ele2"><a href="DisplayWords.jsp">${user.username.toUpperCase()} Dictonary </a></li>
            <li class="list-ele4"><a href = "Logout">Logout</a></li>
            <li class="list-ele3">Word Dictonary</li>
        </ul>

    </nav>
    
    
    
    <% } %>
</body>
</html>