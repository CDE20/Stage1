function calculateEMI(){
    var p=document.getElementById("principalAmount").value;
    var r=document.getElementById("interestRate").value;
    var N=document.getElementById("tenure").value;
      R=(r/100)/12;
      var em=p*R*(Math.pow((1+R),N))/(Math.pow((1+R),N)-1);
      var emi=em.toFixed(2);
      document.getElementById("result").innerHTML="EMI is Rs."+emi;
      return false;
}
/* 

    Fill with appropriate javascript code here 

*/