var array=[];

function addFeedback(){
 //Fill the required logic 
 
 var feedback=document.getElementById("feedback").value;
 array.push(feedback);
 document.getElementById("feedback").value="";
 document.getElementById("result").innerHTML="<h3>Feedback Details</h3> <br>Successfully Added Feedback Details!";
 document.getElementById("result").style.border = "thick solid";
 document.getElementById("result").style.width= "fit-content";

}

function displayFeedback(){
    //Fill the required logic
    var feedback="";
    for(var i=0;i<array.length;i++){
        feedback+="Feedback "+(i+1)+"<br>"+array[i]+"<br>";
    }
    document.getElementById("result").innerHTML="<h3>Feedback Details</h3>"+feedback;
    array=[];
}