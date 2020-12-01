 var feed = [];
function addFeedback(){
 //Fill the required logic   
 var text = document.getElementById("feedback").value;
 feed.push(text);
 document.getElementById("feedback").value="";
 document.getElementById("result").innerHTML="<h2>Feedback Details</h2><br><p>Successfully Added Feedback Details!<p>";
}

function displayFeedback(){
    //Fill the required logic
    var t="";
     for (var i = 0; i < feed.length; i++) {
        t+="Feedback "+(i+1)+"<br>"+feed[i]+"<br>";
     }
    document.getElementById("result").innerHTML="<h2>Feedback Details</h2>"+t;
    feed.length=0;
}