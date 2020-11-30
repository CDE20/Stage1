var fbackarray=[]
function addFeedback(){
 //Fill the required logic
 var x=0;
 var tarea=document.getElementById("feedback").value;
 fbackarray.push(tarea);
 document.getElementById("feedback").value="";
 document.getElementById("result").innerHTML="<h2>Feedback Details</h2><>Successfully Added Feedback Details</p>";
}

function displayFeedback(){
    //Fill the required logic
    var value="<h2>Feedback Details</h2>";
    var y;
    for(y=0;y<fbackarray.length;y++){
        value+="Feedback " + (y+1) + "<br>" +fbackarray[y] + "<br>";
    }
    document.getElementById("result").innerHTML=value;
    fdbackarray=[];
    
}