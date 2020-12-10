var arr=[];
function addFeedback(){
    var x=document.getElementById("feedback").value;
    arr.push(x);
    document.getElementById("feedback").value="";
    document.getElementById("result").innerHTML="<h2><b>Feedback Details</b></h2><b>Successfully Added Feedback Details!</b>";
}

function displayFeedback(){
    var count=1;
    var x="<h2><b>Feedback Details</b></h2>";
    for(var i=0; i<arr.length; i++){
        x+="Feedback "+count+"<br>"+arr[i]+"<br>";
        count++;
    }
    document.getElementById("result").innerHTML=x;
    arr=[];
}