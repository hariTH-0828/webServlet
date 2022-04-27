function validate(){

	var userid = document.getElementsByName("userid");
	var password = document.getElementsByName("password");
	
	if(userid == "" || password == ""){
		alert("values cannot be Empty");
		return false;
	}else if(userid == "admin" || password == "admin"){
		alert("Hey user, don't set username or password as admin'");
		return false;
	}
	


	/*if(document.form.userid.value == "" || document.form.password.value == ""){
		alert("userid or password can't leave as Empty");
		return false;
	}else if(document.form.userid.value == "admin" || document.form.password.value == "admin"){
		alert("Hey user, Don't set username or password as admin");
		return false;
	}else if(document.form.password.value < 6){
		alert("Password must be greater than 8 character");
		return false;
	}else return true;*/
}