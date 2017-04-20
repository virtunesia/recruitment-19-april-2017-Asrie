<?php

$user_name = "root";
$password = "";
$database = "test";
$host_name = "localhost"; 
 
mysql_connect($host_name, $user_name, $password);
mysql_select_db($database);
?>
<html>
    <head>
        <title>Formulir</title>
    </head>
    <body>
        <form action="proses.php" method="post">
        <label>Masukkan String</label>
        <br><input type="text" name="string" required>
        <input type="submit" value="submit">
        </form>
    </body>
</html>

