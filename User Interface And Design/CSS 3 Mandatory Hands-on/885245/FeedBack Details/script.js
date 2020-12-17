var datahtml="<h2>Feedback Details</h2>";
 var index=0;
 var f=new Array();
function addFeedback(){
 //Fill the required logic  
 f[index++]=document.getElementById("feedback").value;
 document.getElementById("result").style.border="thick solid black";
 var data=datahtml+"<h4>Successfully Added feedback Details!</h4>";
 document.getElementById("result").innerHTML=data;

}

function displayFeedback(){
    //Fill the required logic
    var data=datahtml;
    for(index=0;index<f.length;index++)
    {
        data+="Feedback "+(index+1)+"<br>"+f[index]+"<br>";
    }
    document.getElementById("result").style.border="thick solid black";
    document.getElementById("result").innerHTML=data;
   
   
}

