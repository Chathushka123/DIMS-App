<?php

	$db_name = "samuka";
	$mysql_username = "root";
	$mysql_password = "";
	$server_name = "localhost";

	$conn =mysqli_connect($server_name,$mysql_username,$mysql_password,$db_name);

	if(!$conn){
		die("Error in connection: ". mysqli_connect_error());

	}
	$response = array();
	$sql_query = "select * from tblUser";

	$result = mysqli_query($conn,$sql_query);

	if(mysqli_num_rows($result)>0){
		while ($rows = mysqli_fetch_assoc($result)){
			array_push($response, $rows);
		}
	}
	else{
		$response['Success'] = 0;
		$response['Message'] = 'No data';
	}
	
	echo json_encode($response);
	mysqli_close($conn);


?>