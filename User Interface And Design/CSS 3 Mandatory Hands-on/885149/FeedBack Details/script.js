var x=0;
var array=[];
var head="<h2>Feedback Details</h2>"
function addFeedback(){
 array[x]=document.getElementById("feedback").value;
 x++;
 document.getElementById("feedback").value="";
 var data=head+"<h4> Successfully Added Details!<h4>";
 document.getElementById("result").innerHTML=data;

 
}

function displayFeedback(){
    
   var data=head;
  
    for (var i = 0; i < array.length; i++) {
        data+= "Feedback "+ parseInt(i+1) + "<br/>" + array[i] + "<br/>";
        
    }
    document.getElementById("result").innerHTML=data;
   
}