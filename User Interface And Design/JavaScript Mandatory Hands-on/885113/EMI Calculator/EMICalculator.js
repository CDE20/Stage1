function calculateEMI(){
    var principalAmount=document.getElementById("principalAmount").value;
    var interest=document.getElementById("interestRate").value;
    interest=interest/100;
    interest=interest/12;
    var tenure=document.getElementById("tenure").value;
    var temp1=1+interest;
    temp1=Math.pow(temp1,tenure);
    temp2=temp1/(temp1-1);
    temp2=temp2*principalAmount*interest;
    var EMI="EMI is Rs."+temp2.toFixed(2);
    document.getElementById("result").innerHTML=EMI;
    return false;
}