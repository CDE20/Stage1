
// function hello(){
//     document.getElementById("result").innerHTML="<p>wrteen on the page</p>";
// }
var index=0;
var nam=['Sandwich','Burger','Pizza','French Fries','Chocolate Brownie'];
var price=[99.00,129.00,149.00,57.00,32.00];
var active=['Yes','Yes','Yes','No','Yes'];
var date_launch=['15/03/2017','23/12/2017','21/08/2017','02/07/2017','02/11/2022'];
var category=['Main Course','Main Course','Main Course','Starters','Desert'];
var free_delivery=['Yes','No','No','Yes','Yes'];
var action=[1,2,3,4,5];
function display(){
    var itemList="";
    itemList+="<table>";
    itemList+="<th><label for='Name'>Name</label></th><th><label for='Price'>Price</label></th><th><label for='Active'>Active</label></th><th><label for='Date of Launch'>Date of Launch</label></th><th><label for='Category'>Category</label></th><th><label for='Free Delivey'>Free Delivey</label></th><th><label for='Action'>Action</label></th>";
    for(var i=0;i<5;i++){
        itemList+="<tr><td>"+nam[i]+"</td><td>"+price[i]+"</td><td>"+active[i]+"</td><td>"+date_launch[i]+"</td><td>"+category[i]+"</td><td>"+free_delivery[i]+"</td><td><a href='./truyum-ui/edit-menu-item.html'>Edit</a></td><tr>";
    }
    itemList+="</table>";
    document.getElementById("result").innerHTML=itemList;
}

function customer_list_display(){
    var itemList="";
    itemList+="<table>";
    itemList+="<th><label for='Name'>Name</label></th><th><label for='Free Delivey'>Free Delivey</label></th><th><label for='Price'>Price</label></th><th><label for='Category'>Category</label></th><th><label for='Action'>Action</label></th>";
    for(var i=0;i<5;i++){
        if(active[i]==='Yes'){
        itemList+="<tr><td>"+nam[i]+"</td><td>"+free_delivery[i]+"</td><td>"+price[i]+"</td><td>"+category[i]+"</td><td><a href='./menu-item-list-customer-notification.html'>Add to Cart</a></td><tr>";
    }
}
    itemList+="</table>";
    document.getElementById("customer_list").innerHTML=itemList;

}

function addedToCart(){
    //index=document.getElementsByTagName("BUTTON")[0].value
    document.getElementById("addedmessage").innerHTML=""
}
function displayvalue(){
    document.getElementById("cart_list").innerHTML=index;
}
function cart_list_display(){
    var itemList="";
    itemList+="<table>";
    itemList+="<th><label for='Name'>Name</label></th><th><label for='Free Delivey'>Free Delivey</label></th><th><label for='Price'>Price</label></th><th><label for='Category'>Category</label></th>";
    for(var i=0;i<3;i++){
        if(active[i]==='Yes'){
        itemList+="<tr><td>"+nam[i]+"</td><td>"+free_delivery[i]+"</td><td>"+price[i]+"</td><td>"+category[i]+"</td><td><a href='./cart-notification.html'>Delete</a></td><tr>";
    }
    document.getElementById("cart_list").innerHTML=itemList;

}
}
function cart_list_notification(){
    var itemList="";
    itemList+="<table>";
    itemList+="<th><label for='Name'>Name</label></th><th><label for='Free Delivey'>Free Delivey</label></th><th><label for='Price'>Price</label></th><th><label for='Category'>Category</label></th>";
    for(var i=0;i<2;i++){
        if(active[i]==='Yes'){
        itemList+="<tr><td>"+nam[i]+"</td><td>"+free_delivery[i]+"</td><td>"+price[i]+"</td><td>"+category[i]+"</td><td><a href='./cart-notification.html'>Delete</a></td><tr>";
    }
    document.getElementById("cart_list_notification").innerHTML=itemList;

}
}