function display() {
	var eDate = document.getElementById("dateOfLaunch").value;
	var cDate = new Date().toISOString().slice(0,10);
	if(eDate<cDate){
		alert("Please enter valid date");
	}
}