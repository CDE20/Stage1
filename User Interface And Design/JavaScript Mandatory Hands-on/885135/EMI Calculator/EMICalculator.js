
/* 

    Fill with appropriate javascript code here 

*/
function calculateEMI(){
    var principleAmount=document.getElementById("principalAmount").value;
    var interestRate=document.getElementById("interestRate").value;
    var tenure=document.getElementById("tenure").value;
    var R=(interestRate/100)/12;
    var temp=Math.pow((R+1),tenure);
    var EMI=principleAmount*R*(temp/(temp-1));
    var result=EMI.toFixed(2);
    document.getElementById("result").innerHTML="EMI is Rs."+result;
    return false;
    
    
    
}