function menuSave()
{
var name=getElementById("name").value;
if(name.length<2 || name.length>65)
{
	alert("Size is invalid");
	return false;
}
}