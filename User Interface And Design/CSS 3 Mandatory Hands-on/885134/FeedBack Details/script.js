var a=[];
function addFeedback(){
 //Fill the required logic
 var data=document.getElementById("feedback").value;
  a.push(data);
  data.value="";
  //document.getElementById("feedback").value="";
  document.getElementById("result").innerHTML="<h2>Feedback Details</h2><h3>Successfully Added Feedback Details!</h3>";
  return false;
}

function displayFeedback(){
    //Fill the required logic
    var e="<h2>Feedback Details</h2>";
    for (var y=0; y<a.length; y++)
   {
     e += "Feedback " + (y+1) + "<br>" + a[y] + "<br>";
   }
   document.getElementById("result").innerHTML = e;
   //a=[];
   return false;
}