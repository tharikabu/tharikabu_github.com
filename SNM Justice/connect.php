<?php

$Name = $_POST['name'];
$Email = $_POST['email'];
$MobileNumber = $_POST['number'];
$Message = $_POST['message'];

// Database Connection  

$connection = new mysqli('localhost','root','','snmdonation');

if($connection->connect_error)
{
    die('Connection Failed : '. $connection->connect_error);
}
else
{
    $stmt = $connection->prepare("insert into donors(Name, Email, MobileNumber, Message) values(?,?,?,?)");
    $stmt -> bind_param("ssis",$Name, $Email, $MobileNumber, $Message);
    $stmt -> execute();
    echo "Message Sent..." ;
    $stmt -> close();
    $connection -> close();
}


?>