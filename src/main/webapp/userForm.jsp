<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styleUserForm.css">
    <title>Document</title>
</head>

<body>

<%@ include file = "nav.jsp" %>
    <div class = "form-div">

        
    <form action = "RegisterUser" method = "POST">
<div class="register">
            Register Form

        </div>
        <div class = "form-fields form-field-1">
            <label for="name">Enter your name</label>
            <input type="text" id="name" name = "name">
        </div>

        <div class = "form-fields form-field-2">
            <label for="username">Enter your username</label>
            <input type="text" name = "username" id="username" placeholder="example : rik.me" >
        </div>

        <div class = "form-fields form-field-3">
            <label for="password">Enter password</label>
            <input type="password" name="password" id="password">
        </div>

        <div class = "form-fields form-field-4">
            <label for="gender">Gender : </label>

            <div class = "gender-option">
                <label for="male">Male</label>
                <input type="radio" name="gender" id="male" value = "male">
            </div>

            <div class = "gender-option">
                <label for="female">Female</label>
                <input type="radio" name="gender" id="female" value = "female">
            </div>
        </div>

        <div class = "form-buttons">

            <button type="submit">Submit</button>
            <button type="reset">Reset</button>
        </div>

    </form>
        
</div>

</body>

</html>