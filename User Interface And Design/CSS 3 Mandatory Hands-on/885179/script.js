
var feedlist = [];
function addFeedback(){
 //Fill the required logic   
 var feed = document.getElementById("feedback").value;
 feedlist.push(feed);
 document.getElementById("feedback").value = "";
 
 document.getElementById("result").innerHTML = "<h2> Feedback Details</h2><br><p>Successfully Added Feedback Details</p>"

}

function displayFeedback(){
    //Fill the required logic
    var display = "";
    var count=0;
    for (var i in feedlist){
        display += "Feedback "+(++count) + " <br>" + feedlist[i] + " <br>"; 
    }
    document.getElementById("result").innerHTML = "<h2> Feedback Details</h2>" + display;
}