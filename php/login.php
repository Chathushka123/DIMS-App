<?php

	require "conn.php";

	$user_name = "";
	$user_pass = $_POST["user_pass"];

	$mysql_query = "select * from tblUser where password like '$user_pass';";
	$result = mysqli_query($conn , $mysql_query);

	if(mysqli_num_rows($result) > 0){
		echo "Login success";
	}
	else{
		echo "Login fail";
	}
	mysqli_close($conn);


?>