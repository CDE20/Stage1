function calcEMI(){
    var P = document.getElementById("principalAmount").value;
    var r = document.getElementById("interestRate").value;
    var N = document.getElementById("tenure").value;
    var R = (r/100)/12;
    var EMI = P * R * (Math.pow(1 + R,N) / (Math.pow(1 + R,N) - 1));
    document.getElementById("result").innerHTML = "EMI is Rs." + EMI.toFixed(2);
}