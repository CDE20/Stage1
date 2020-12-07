var a=[];
function addFeedback() {
  document.getElementById("result").innerHTML = "<h2>Feedback Details</h2><h4>Successfully Added Feedback Details!</h4>";
var i=document.getElementById('feedback').value;
    a.push(i);
    document.getElementById('result').style.display = "block";
    return false;
}
function displayFeedback(){
    
    var i;
    var text="";
    for(i=0;i<a.length;i++){
        text+="Feedback "+(i+1)+"<br>"+a[i]+"<br>";
    }
    a=[];
    document.getElementById('result').style.display = "block";
    document.getElementById("result").innerHTML="<h2>Feedback Details</h2>"+text;
return false;
}