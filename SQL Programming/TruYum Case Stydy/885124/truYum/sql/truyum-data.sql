/*--------Frame insert scripts to add data into menu_item table. Refer View Menu Item List Admin screen below for sample data.----------*/

insert into menu_item values
(1, 'Sandwich', 99.00, 'Yes', '2017-03-15', 'Main Course', 'Yes'),
(2, 'Burger', 129.00, 'Yes', '2017-12-23', 'Main Course', 'No'),
(3, 'Pizza', 149.00, 'Yes', '2017-08-21', 'Main Course', 'No'),
(4, 'French Fries', 57.00, 'No', '2017-07-02', 'Starters', 'Yes'),
(5, 'Chocolate Brownie', 32.00, 'Yes', '2022-11-02', 'Dessert', 'Yes');




/*-------Frame SQL query to get all menu items--------*/

select * from menu_item;




/*---------Frame SQL query to get all menu items which after launch date and is active.--------*/

select * from menu_item
where DateOfLaunch >= '2017-03-15' and Active = 'Yes';




/*----------Frame SQL query to get a menu items based on Menu Item Id----------*/

select * from menu_item where id=1;




/*-------------Frame update SQL menu_items table to update all the columns values based on Menu Item Id------------*/

update menu_item
set Name='PannerSandwhich',Price=210.00,Active='Yes',DateOfLaunch='2020-01-18',Category='Main Course',FreeDelivery='Yes' 
where id=1;




/*-----------Frame insert scripts for adding data into user and cart tables.
In user table create two users. Once user will not have any entries in cart, while the other will have at least 3 items in the cart.----------------*/

/*--------When no user in table-------*/
insert into user values
(1,'A','A@gmail.com','9130406391','ABC');

/*-------View user table--------*/
select * from user;

/*-------Adding more users in table-------*/
insert into user values
(2,'Ab','Ab@gmail.com','9130406392','AbBC'),
(3,'AbC','AbC@gmail.com','9130406393','AbCBC');




/*------Inserting data in cart---------*/

insert into cart values
(1,'Burger',129.00,'Yes',2,1),
(2,'Pizza',149.00,'Yes',3,3),
(3,'Pizza',149.00,'Yes',3,1),
(4,'French Fries',57.00,'No',4,2);




/*------view cart table--------*/

select * from cart;




/*--------Frame SQL query to get all menu items in a particular user’s cart---------*/

select CartId,Name,Price,FreeDelivery from cart where customerId = 1;




/*--------Frame SQL query to get the total price of all menu items in a particular user’s cart----------*/

select sum(Price) as TotalCost from cart where customerId = 1;




/*--------Frame SQL query to remove a menu items from Cart based on User Id and Menu Item Id---------*/

delete from cart where MenuId = 3 and CustomerId = 1;
select * from cart;