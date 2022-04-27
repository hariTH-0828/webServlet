function validate(){

	var userid = document.getElementById("userid");
	var password = document.getElementById("password");
	
	if(userid == "" || password == ""){
		alert("Student ID or Password can't leave as Blank'");
		return false;
	}else if(!parseInt(userid)){
		alert("Student ID must only be in Integer");
		return false;
	}else if(password.length < 8){
		alert("Password must be greater than 8 characters");
		return false;
	}else return true;

}