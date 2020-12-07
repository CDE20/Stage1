/* 1. View Menu Item List Admin
1.1 Insert scripts to add data into menu_item table. */

insert into menu_item
values (1,'Sandwich',99,'Yes','2017-03-15','Main Course','Yes'),
        (2,'Burger',129,'Yes','2017-12-23','Main Course','No'),
        (3,'Pizza',149,'Yes','2017-08-21','Main Course','NO'),
        (4,'French Fries',57,'No','2017-07-02','Starters','Yes'),
        (5,'Chocolate Brownie',32,'Yes','2022-11-02','Dessert','Yes');
        
 /* 1.2 SQL query to get all menu items */      
 
select *from menu_item;        

/* 2. View Menu Item List Customer
2.1 SQL query to get all menu items which after launch date and is active. */

select *from menu_item where date_of_launch >= '2017-03-15' and free_delivery = 'Yes';

/* 3. Edit Menu Item 
3.1 SQL query to get a menu items based on Menu Item Id */

select *from menu_item where item_id = 2;

/* b. Update SQL menu_items table to update all the columns values based on Menu Item Id */

update menu_item
set item_name = 'Tacos',
	item_price =30,
    active_status ='No',
    date_of_launch = '2017-03-29',
    category = 'Main Course',
    free_delivery = 'No'
    where item_id = 1;

select *from menu_item ;
/* 4. Add to Cart 
4.1 Insert scripts for adding data into user and cart tables.In user table
create two users. Once user will not have any entries in cart, while the
other will have at least 3 items in the cart.*/

insert into user
values (101, 'abhishek','abhishek@gmail.com','963852741','Pune','abhishek963','admin'),
	(102, 'satyajeet','satyajeet@gmail.com','852741963','Mumbai','satyajeet852','customer'),
       (103, 'raj','raj@gmail.com','741852963','Hydrabad','raj741','customer');
       
 select *from user;      
 
 insert into cart
 values (123,'French Fries',60,'No',002,4),
	(124,'Pizza',149,'Yes',003,3),
	(125,'Tacos',30,'No',001,1);
        
        
 /* 5. View Cart 
5.1 SQL query to get all menu items in a particular user’s cart */       
 select cart_id, name, price from cart where user_id=1;

/* 5.2 SQL query to get the total price of all menu items in a particular user’s cart */       

select sum(item_price) as total_price from menu_item
where item_id in(select item_id from cart where user_id = 4);
  
  
 /* 6. Remove Item from Cart
6.1 SQL query to remove a menu items from Cart based on User Id and Menu Item Id */ 

delete from cart where user_id=001 and item_id=1;