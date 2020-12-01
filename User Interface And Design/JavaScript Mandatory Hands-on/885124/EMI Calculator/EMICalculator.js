
/* 

    Fill with appropriate javascript code here 

*/
var E;
function calculateEMI(){
    var P=document.getElementById("principalAmount").value;
    var r=document.getElementById("interestRate").value;
    var R=r/1200;
    var N=document.getElementById("tenure").value;
    E = (P * R * (Math.pow((1 + R),N)/(Math.pow((1 + R),N) - 1)));
    var EMI = E.toFixed(2);
    document.getElementById("result").innerHTML = "EMI is Rs."+EMI;
    return false;
}


