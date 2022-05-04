function validate(){
	var userid = document.form.userid.value;
	var pass = document.form.password.value;
	
	if(userid == "" || pass == ""){
		alert("Student ID or password can't leave as Empty");
		return false;
	}else if(!parseInt(userid)){
		alert("The student ID must only be in Integer");
		return false;
	}else if(pass.length < 8){
		alert("Password must be greater than 8 character");
		return false;
	}else return true;
}