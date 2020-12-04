var Menu = [
    {id:1,name : "Sandwich", freeDelivery : "Yes",price : "99",category:"Main Course" ,date : "15/03/2017",active:"Yes"},
    {id:2,name : "Burger", freeDelivery : "No",price : "129",category:"Main Course",date : "23/12/2017",active:"Yes"},
    {id:3,name : "Pizza", freeDelivery : "Yes",price : "49",category:"Main Course",date : "21/08/2017",active:"Yes"},
    {id:4,name : "French Fries", freeDelivery : "No",price : "57",category:"Starter",date :"02/07/2017",active:"No"},
    {id:5,name : "Chocolate Brownie", freeDelivery : "Yes",price : "32",category:"Dessert",date : "02/11/2017",active:"Yes"},
]
;

var cart = [];

var editValue;
var pageType= "customer";

function setEditValue(value){
    for(i in Menu){
        if(Menu[i].id == value ) editValue = Menu[i] ;
    }
}