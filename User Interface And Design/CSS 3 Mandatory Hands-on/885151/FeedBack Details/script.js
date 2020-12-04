var j=0;
var arr=[];
function addFeedback() {
 var feed=document.getElementById("feedback").value;
 arr.push(feed);
 j++;
 document.getElementById("result").innerHTML="<h2>Feedback Details</h2><h3>Successfully Added Feedback Details!</h3>";
 return false;
}

function displayFeedback(){
    var i=0;
    var full="<h2>Feedback Details<h2>";
    for(i=0;i<j;i++){
        full=full+"Feedback "+(i+1)+"<br>"+arr[i]+"<br>";
    }
    document.getElementById("result").innerHTML=""+full;
    arr=[];
    return false;
}