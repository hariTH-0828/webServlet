function validate(){

	var userid = document.form.userid.value;
	var pass = document.form.password.value;
	
	console.log(userid +" "+ pass);
	if(userid == "" || pass == ""){
		alert("Student ID or Password can't leave as Blank");
		return false;
	}else if(!parseInt(userid)){
		alert("Student ID must only be in Integer");
		return false;
	}else if(password.length < 8){
		alert("Password must be greater than 8 characters");
		return false;
	}else return true;

}