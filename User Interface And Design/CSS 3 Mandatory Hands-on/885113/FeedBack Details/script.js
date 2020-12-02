 var array=[];
 function addFeedback(){
    var feedback=document.getElementById("feedback").value;
    array.push(feedback);
    document.getElementById("result").value="";
   var s="feedback Details<br> Sussessful";
     document.getElementById("result").innerHTML=s;
    return false;
}

function displayFeedback(){
    var disp="Feedback Details";
    var res="";
    var i,j=0;
    for(i=0;i<array.length;i++){
        j=i+1;
        res=res+"<br>Feedback " + j + "<br>" + array[i];
    }
    res=disp+res;
  document.getElementById("result").innerHTML=res;
  return false;
    
}