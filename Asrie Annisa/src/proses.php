<?php

$user_name = "root";
$password = "";
$database = "test";
$host_name = "localhost"; 
 
$koneksi = mysql_connect($host_name, $user_name, $password);
mysql_select_db($database);

$string = $_POST['string'];
$sql="INSERT INTO `request` (`timestamp`, `string`) VALUES (CURRENT_TIMESTAMP, '$string')";

$tambahdata = mysql_query( $sql, $koneksi );
if(! $tambahdata )
{
  die('Gagal Tambah Data: ' . mysql_error());
}else{
    echo "Berhasil tambah data\n";
}

mysql_close($koneksi);

?>
