
function delitem()
{
	 document.getElementById("status").style.display='block';
	document.getElementById("status").innerHTML="Item removed from Cart Successfully";
}

function additem()
{
	 document.getElementById("status").style.display='block';
	document.getElementById("status").innerHTML="Item added to Cart Successfully";
}

function menufun()
{
     let input=document.getElementById("dateOfLaunch").value;
	 let todayDate=new Date().toISOString().slice(0, 10);
	    if(input < todayDate)
	    {
	        alert("The entered date is not valid");
	    }
	}