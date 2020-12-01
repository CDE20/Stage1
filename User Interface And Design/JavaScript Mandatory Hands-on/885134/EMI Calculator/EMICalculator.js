
/* 

    Fill with appropriate javascript code here 

*/
function calculateEMI(){
    var p = document.getElementById("principalAmount").value;
    var r= document.getElementById("interestRate").value;
    var n= document.getElementById("tenure").value;
    var R=(r/100)/12;
    
    var z=Math.pow((1+R),n);
    var y=z-1;
    var emi= p* R *(z / y);
    document.getElementById("result").innerHTML="EMI is Rs."+(emi.toFixed(2));
    return false;
}