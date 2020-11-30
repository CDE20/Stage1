function calculateEMI(){
    var P = document.getElementById("principalAmount").value;
    var R = (document.getElementById("interestRate").value/100)/12;
    var N = document.getElementById("tenure").value;
    var EMI = P * R * (Math.pow((1 + R),N)/((Math.pow((1+R),N)) - 1))
    document.getElementById("result").innerHTML = "EMI is Rs."+EMI.toFixed(2);
    return false;
}