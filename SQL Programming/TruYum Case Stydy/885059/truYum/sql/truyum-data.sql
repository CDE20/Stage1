/*1. View Menu Item List Admin (TYUC001)*/
/*a. Frame insert scripts to add data into menu_item table.*/
insert into menu_item (name, price, active, date_of_launch, category, free_delivery)
values
("Sandwich", 99, "Yes", "15/03/2017", "Main Course", "Yes"),
("Burger", 129, "Yes", "23/12/2017", "Main Course", "No"),
("Pizza", 149, "Yes", "21/08/2017", "Main Course", "No"),
("French Fries", 57, "No", "02/07/2017", "Starters", "No"),
("Chocolate Brownie", 32, "No", "02/11/2022", "Dessert", "Yes");

/*b. Frame SQL query to get all menu items*/
select * from menu_item;

/*2. View Menu Item List Customer (TYUC002)*/
/*a. Frame SQL query to get all menu items which after launch date and is active.*/
select * from menu_item
where active = "Yes";

/*3. Edit Menu Item (TYUC003)
a. Frame SQL query to get a menu items based on Menu Item Id*/
select * from menu_item
where itemId = 2; /* for menu item id 2*/

/*b. Frame update SQL menu_items table to update all the columns values
based on Menu Item Id*/
update menu_item
set price = 299 /*write column name and value here*/
where itemId = 2;

/*4. Add to Cart (TYUC004)
a. Frame insert scripts for adding data into user and cart tables.In user table
create two users. Once user will not have any entries in cart, while the
other will have at least 3 items in the cart.*/
insert into user (name, email, password, contact, role)
values
("Shubham", "s@gmail.com", "abcd123", "9876543210", "admin"),
("Shubham", "shubham@gmail.com", "sdfsd123", "9876543210", "customer"),
("Neha", "neha@gmail.com", "qwer123", "9876543210", "customer");

insert into cart (userId, itemId)
values
(3, 1),
(3, 2),
(3, 3);

/*5. View Cart (TYUC005)
a. Frame SQL query to get all menu items in a particular user’s cart*/
select itemId from cart
where userId = 3;

/*b. Frame SQL query to get the total price of all menu items in a particular
user’s cart*/
select sum(price) as Total from menu_item
where itemId in(select itemId from cart where userId = 3); /*for userId 3*/

/*6. Remove Item from Cart (TYUC006)
a. Frame SQL query to remove a menu items from Cart based on User Id
and Menu Item Id*/
delete from cart
where userId = 3 and itemId = 2;
