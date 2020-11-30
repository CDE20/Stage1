
var feedback = new Array();
function addFeedback(){
 //Fill the required logic
 var textarea = document.getElementById("feedback").value;
 feedback.push(textarea);
 
 var output = "<h1>Feedback Details</h1>";
 output += "<b>Successfully Added Feedback Details!";
 
 document.getElementById("result").innerHTML = output;
}

function displayFeedback(){
    //Fill the required logic
     var output = "<h1>Feedback Details</h1>";
     
     for(var i = 0; i < feedback.length; i++){
         output += "Feedback " + (i+1) + "<br>";
         output += feedback[i] + "<br>";
     }
     
     document.getElementById("result").innerHTML = output;
}