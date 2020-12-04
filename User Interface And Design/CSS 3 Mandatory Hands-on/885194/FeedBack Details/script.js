var array=[];
function addFeedback(){
 //Fill the required logic  
	
	var feedback=document.getElementById("feedback").value;
	array.push(feedback);
	document.getElementById("feedback").value="";
	document.getElementById("result").innerHTML="<h2>Feedback Details</h2><h3>Successfully Added Feedback Details!";
	
}

function displayFeedback(){
    //Fill the required logic
	var x="";
	for(i=0;i<array.length;i++)
		{
		x=x+"Feedback "+(i+1)+"<br>"+array[i]+"<br>";
		}
	document.getElementById("result").innerHTML="<h2>Feedback Details</h2>"+x;
}