function calculateEMI(){
    var p=document.getElementById('principalAmount').value;
    var r=document.getElementById('interestRate').value; 
    var n=document.getElementById('tenure').value;
    //if(Number.isInteger(p) && p >= 0 && Number.isInteger(r) && r >= 0 && Number.isInteger(n) && n >= 0){
        var R=(r/100)/12;
        var interest = Math.pow((1+R),n);
        var EMI=p*R*(interest/(interest-1));
        var finalEMI = EMI.toFixed(2);
        var finalEMIString = finalEMI.toString();
        var answer = "EMI is Rs."+finalEMIString;
        document.getElementById("result").innerHTML = answer;
    //}
    return false;
}