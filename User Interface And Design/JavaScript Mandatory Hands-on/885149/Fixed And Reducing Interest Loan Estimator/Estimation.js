
/* 

    Fill with appropriate and required javascript global variables  code here 

*/


var R=0,r=0;
var P=0;
var N=0;
var EMI_Reduce=0;
var totalpay_Reduce=0;
var totalInt_Reduce=0;


function EstimateReducingInterestLoan()
{
	/* Fill with required javascript code to read input values from HTML Components  */
	r=parseInt(document.getElementById("interestRate").value);
    P=parseInt(document.getElementById("principalAmount").value);
    N=parseInt(document.getElementById("tenure").value);
    R=(r/100)/12;
	  calculateEMI();
	  //EMI_Reduce=document.getElementById("EMI").value;
      totalPayment();
     // totalpay_Reduce=document.getElementById("tPayment").value;
      totalInterest();
      EstimateFixedInterestLoan();


    
}

function EstimateFixedInterestLoan()
{
    /* Fill with required javascript code here  */
    var totalInt_fixed=P*(r/100)*(N/12);
    document.getElementById("tInterestFixed").innerHTML = totalInt_fixed.toFixed(2); 
    
     /* Fill with required javascript code here  */
     var totalpay_fixed=parseInt(P)+totalInt_fixed;
    document.getElementById("tPaymentFixed").innerHTML = totalpay_fixed.toFixed(2); /*Assign total payment value here*/
    
     /* Fill with required javascript code here  */
     var EMI_Fixed=totalpay_fixed/N;
     
    document.getElementById("EMIFixed").innerHTML = EMI_Fixed.toFixed(2); /*Assign emi  value here*/
    
    
}

function calculateEMI(){
	
    /* Fill with required javascript code here  */
    EMI_Reduce=P * R * ( Math.pow((1 + R), N) / (Math.pow((1 + R), N) - 1) );
    
   // EMI_Reduce=EMI_Reduce.toFixed(2);
    document.getElementById("EMI").innerHTML = EMI_Reduce.toFixed(2);/*Assign emi value here*/
}

function totalPayment(){
	
	/* Fill with required javascript code here  */
	totalpay_Reduce=EMI_Reduce*N;
	
    document.getElementById("tPayment").innerHTML = totalpay_Reduce.toFixed(2);/*Assign total payment value here*/
}

function totalInterest(){
	
/* Fill with required javascript code here  */
    totalInt_Reduce=totalpay_Reduce-P;
    document.getElementById("tInterest").innerHTML = totalInt_Reduce.toFixed(2);/*Assign total Interest value here*/
}


