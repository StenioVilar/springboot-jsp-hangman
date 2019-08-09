<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hangman Game</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body bgcolor="#e6f2ff">
    <h2 align="center" class="collor-title">Welcome to Hangman!</h2>
    <script src="/js/main.js"></script>
    <hidden name="${chosenWord}" id="chosenWord"/>

    </br></br></br></br></br>
    <div align="center">
        Guess a Letter:
        <input type="text" name="letter" size="1" maxlength="1" onkeypress="return onlyAlphabets(event,this);">
        <br/>
        <p>
            <input type="submit" value="Play" class="button">
        </p>
    </div>
</body>
</html>