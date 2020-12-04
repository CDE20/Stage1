var feedbacks = new Array();

function addFeedback(){
    var text = document.getElementById("feedback").value;
    feedbacks.push(text);
 
 
    document.getElementById("feedback").value = "";
    
    var output = "<h1>Feedback Details</h1>";
    output += "<b>Successfully Added Feedback Details!";
    
    document.getElementById("result").innerHTML = output;
    
}

function displayFeedback(){

    var output = "<h1>Feedback Details</h1>";
    // output += "<br>";
    
    for (var i = 0; i < feedbacks.length; i++) {
        output += "Feedback " + (i+1) + "<br>";
        output += feedbacks[i] + "<br>";
    }
    
    document.getElementById("result").innerHTML = output;
}