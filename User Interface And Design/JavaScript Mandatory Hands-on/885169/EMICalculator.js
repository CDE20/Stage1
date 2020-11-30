
/* 

    Fill with appropriate javascript code here 

*/
function calculateEMI()
{
    var p = document.getElementById("principalAmount").value;
                var r = document.getElementById("interestRate").value;
                var n = document.getElementById("tenure").value;
                var R = (r/100)/12;
                var temp = Math.pow((R+1),n);
                var EMI = p * R * (temp/(temp-1));
                var total = EMI.toFixed(2);
                document.getElementById("result").innerHTML = "EMI is Rs."+total;
                
                return false;
                

}