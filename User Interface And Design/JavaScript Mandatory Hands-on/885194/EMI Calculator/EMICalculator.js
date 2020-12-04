
/* 

    Fill with appropriate javascript code here 

*/
var EMI;
function calculateEMI()
{
    var P = document.getElementById("principalAmount").value;
    var R = document.getElementById("interestRate").value;
    R = (R/100)/12;
    var N = document.getElementById("tenure").value;
    EMI = P * R * ( Math.pow((1 + R), N) / (Math.pow((1 + R), N) - 1) );
    document.getElementById("result").innerHTML = "EMI is Rs."+toFixed();
    return false;
}

function toFixed()
{
    return Math.round(EMI*100)/100;
}