
function calculateEMI()
    {

        var P= document.getElementById('principalAmount').value;
        var N= document.getElementById('tenure').value;
        var r=document.getElementById('interestRate').value/100;
        
        var R=(r/12);
        var ad=1+R;
        var lt=Math.pow(ad,N);
        var rt=Math.pow(ad,N);
        var rt1=rt-1;
        var EMI=P * R * (lt/rt1);
        document.getElementById("result").innerHTML="EMI is Rs." +parseFloat(EMI).toFixed(2);
        return false;
    }
    
                
