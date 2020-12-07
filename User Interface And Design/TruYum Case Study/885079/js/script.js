function display() {
	var Date1 = document.getElementById("dateOfLaunch").value;
	var Date2 = new Date().toISOString().slice(0,10);
	if(Date1<Date2){
		alert("Please enter valid date");
	}
}