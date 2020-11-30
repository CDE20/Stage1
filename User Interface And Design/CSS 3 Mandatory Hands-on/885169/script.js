var arr=[];
function addFeedback(){
    
 //Fill the required logic   
 var x=document.getElementById("feedback").value;
    arr.push(x);
    
    var p=document.getElementById("result");
    p.style.display="block";
}

function displayFeedback(){
    //Fill the required logic
    var i=0;
    var res="";
    for(i=0;i<arr.length;i++)
    {
        res=res+"Feedback "+(i+1)+"<br/>"+arr[i]+"<br/>";
    }
    document.getElementsByName("dr")[1].innerHTML= res;
    arr=[];

}