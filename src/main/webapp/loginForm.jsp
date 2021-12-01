<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styleLoginForm.css">
    <title>Document</title>
</head>

<body>

<%@ include file = "nav.jsp" %>
    <div class = "form-div">

        
    <form action = "Login" method = "GET">
<div class="login">
            Login Form

        </div>
        

        <div class = "form-fields form-field-1">
            <label for="username">Enter your username</label>
            <input type="text" name = "username" id="username" >
        </div>

        <div class = "form-fields form-field-2">
            <label for="password">Enter password</label>
            <input type="password" name="password" id="password">
        </div>

        <div class = "form-buttons">

            <button class="submit-btn" type="submit">Login</button>
            <button class = "reset-btn" type="reset">Reset</button>
        </div>

        <a class = "fg-ps" href="ForgotPassword">Forgot password ?</a>

    </form>
        
</div>

</body>

</html>