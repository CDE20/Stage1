var feedbacks =[];
function addFeedback(){
 //Fill the required logic   
 feedbacks.push(document.getElementById("feedback").value);
 document.getElementById("feedback").value = "";
 document.getElementById("result").innerHTML = "<h2>Feedback Details</h2><h3>Successfully Added Feedback Details!</h3>";
}

function displayFeedback(){
    //Fill the required logic
    var feedback = "";
    for(i=0; i<feedbacks.length; i++)
    {
        feedback += "Feedback "+ (i+1) + "<br>"+feedbacks[i]+"<br>";
    }
    document.getElementById("result").innerHTML = "<h2>Feedback Details</h2>"+feedback;
}