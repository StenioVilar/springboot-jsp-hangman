<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hangman Game</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
    <h2 align="center" class="collor-title">Welcome to Hangman!</h2>
    <script src="/js/main.js"></script>

    </br></br></br></br></br>
    <div align="center">
        Letter:
        <input type="text" name="letter" size="1" maxlength="1" onkeypress="return onlyAlphabets(event,this);">
        <br/>
        <p>
            <input type="submit" value="Play">
        </p>
    </div>
</body>
</html>