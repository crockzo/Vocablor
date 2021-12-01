<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styleWordForm.css">
    <title>Document</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>

<body>

<%@ include file = "nav.jsp" %>
    <div class = "form-div">

        
    <form class = "form-box" action = "WordStorage" method = "POST">
<div class="word-form">
            Word Register

        </div>
        <div class = "form-fields form-field-1">
            <label for="word">Enter the word</label>
            <input type="text" id="word" name = "word">
        </div>

        <div class = "form-fields form-field-2">
            <label for="meaning">Enter the meaning</label>
            <input type="text" name = "meaning" id="meaning">
        </div>
        <div class = "form-fields form-field-3 sentence sentence1">
            <label for="sentence1">Use it in a sentence</label>
            <input type="text" name = "sentence1" id="sentence1" value = " ">
        </div>
        <div class = "form-fields form-field-4 sentence sentence2">
            <label for="sentence2">Sentence 2</label>
            <input type="text" name = "sentence2" id="sentence2" value = " ">
        </div>
        <div class = "form-fields form-field-5 sentence sentence3">
            <label for="sentence3">Sentence 3</label>
            <input type="text" name = "sentence3" id="sentence3" value = " ">
        </div>

       <p class="add-sentence">+ NEW</p>
        <div class = "form-buttons">

            <button type="submit">Submit</button>
            <button class = "reset" type="reset">Reset</button>
        </div>

    </form>
        
</div>
<script>

$(document).ready(function(){

    var count = 1;
    
    $(".form-box").attr("height", "500");
    $(".sentence2").hide();
    $(".sentence3").hide();

    $(".add-sentence").on("click",function(){
        count = count + 1;
        if(count == 2){
            $(".sentence2").show();
            $(".form-box").attr("height", "550");
        }
        if(count == 3){
            $(".sentence3").show();
            $(".add-sentence").hide();
            $(".form-box").attr("height", "600");
        }
    });


    $(".reset").on("click", function(){

        count = 1;
        $(".form-box").attr("height", "500");
        $(".sentence2").hide();
        $(".sentence3").hide();
        $(".add-sentence").show();
    });
});

</script>
</body>

</html>