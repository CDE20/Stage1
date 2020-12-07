/* 1. View Menu Item List Admin (TYUC001)
a. Frame insert scripts to add data into menu_item table. */
insert into menu_item
values (1,'Sandwich',99,'Yes','2017-03-15','Main Course','Yes'),
        (2,'Burger',129,'Yes','2017-12-23','Main Course','No'),
        (3,'Pizza',149,'Yes','2017-08-21','Main Course','NO'),
        (4,'French Fries',57,'No','2017-07-02','Starters','Yes'),
        (5,'Chocolate Brownie',32,'Yes','2022-11-02','Dessert','Yes');
        
 /* b. Frame SQL query to get all menu items */       
select *from menu_item;        

/* 2. View Menu Item List Customer (TYUC002)
a. Frame SQL query to get all menu items which after launch date and is
active. */

select *from menu_item
where date_of_launch >= '2017-03-15'
and active_status = 'Yes';

/* 3. Edit Menu Item (TYUC003)
a. Frame SQL query to get a menu items based on Menu Item Id */
select *from menu_item
where item_id = 2;

/* b. Frame update SQL menu_items table to update all the columns values
based on Menu Item Id */

update menu_item
set item_name = 'Tacos',
	item_price =60,
    active_status ='No',
    date_of_launch = '2017-03-29',
    category = 'Main Course',
    free_delivery = 'No'
    where item_id = 1;

/* 4. Add to Cart (TYUC004)
a. Frame insert scripts for adding data into user and cart tables.In user table
create two users. Once user will not have any entries in cart, while the
other will have at least 3 items in the cart.*/

insert into user
values (001, 'mrunal','mrunal@gmail.com','6788909865','Pune','mrunal123','admin'),
	   (002, 'janhavi','janhavi@gmail.com','8697531594','Delhi','janhavi919','customer'),
       (003, 'aakash','aakash@gmail.com','9635872341','Mumbai','aakash412','customer');
       
 select *from user;      
 
 insert into cart
 values (501,'Tacos',60,'No',001,1),
		(502,'Burger',129,'Yes',002,2),
        (503,'Pizza',149,'Yes',003,3);
        
 /* 5. View Cart (TYUC005)
a. Frame SQL query to get all menu items in a particular user’s cart */       
 select cart_id, name, price from cart where user_id=3;

/* b. Frame SQL query to get the total price of all menu items in a particular
user’s cart */       
select sum(item_price) as total_price from menu_item
where item_id in(select item_id from cart where user_id = 2);
  
  
 /* 6. Remove Item from Cart (TYUC006)
a. Frame SQL query to remove a menu items from Cart based on User Id
and Menu Item Id */ 
delete from cart where user_id=001 and item_id=1;