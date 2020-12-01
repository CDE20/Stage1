function calculateEMI(){
    var P = document.getElementById("principalAmount").value;
    var R = document.getElementById("interestRate").value;
    R = (R/100)/12;
    var N = document.getElementById("tenure").value;
    
    var EMI=P*R*(Math.pow((1+R),N)/(Math.pow((1+R),N)-1));
    var emi=EMI.toFixed(2);
    document.getElementById("result").innerHTML = "EMI is Rs."+emi;
    return false;
    
}