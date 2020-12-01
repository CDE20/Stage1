
/* 

    Fill with appropriate javascript code here 
    

*/

function calculateEMI(){
        var P = document.getElementById("principalAmount").value;
    var r = document.getElementById("interestRate").value;
    var N = document.getElementById("tenure").value;

    var R = (r/100)/12;

    EMI = P * R * (Math.pow((1+R),N)/((Math.pow((1+R),N))-1) )

    result = "EMI is Rs."+ EMI.toFixed(2);
    document.getElementById("result").innerHTML = result;
    
    return false;
}
