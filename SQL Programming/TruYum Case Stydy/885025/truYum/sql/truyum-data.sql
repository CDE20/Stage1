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
where itemId = 5; /* selects rows for menu item id is 5*/

/*b. Frame update SQL menu_items table to update all the columns values
based on Menu Item Id*/
update menu_item
set price = 156 /*update price value for item id is 5*/
where itemId = 5;

/*4. Add to Cart (TYUC004)
a. Frame insert scripts for adding data into user and cart tables.In user table
create two users. Once user will not have any entries in cart, while the
other will have at least 3 items in the cart.*/
insert into user (name, email, password, contact, role)
values
("Meghana", "meghana@gmail.com", "mem098", "8466055561", "admin"),
("Shashidar", "shashi@gmail.com", "sas123", "8756344321", "customer"),
("Bhavitha", "bhavi@gmail.com", "ba453", "7865432109", "customer");

insert into cart (userId, itemId)
values
(1, 2),
(3, 3),
(2, 1);

/*5. View Cart (TYUC005)
a. Frame SQL query to get all menu items in a particular user’s cart*/
select itemId from cart
where userId = 1;

/*b. Frame SQL query to get the total price of all menu items in a particular
user’s cart*/
select sum(price) as Total_Price from menu_item
where itemId in(select itemId from cart where userId = 1); /*for user id 1*/

/*6. Remove Item from Cart (TYUC006)
a. Frame SQL query to remove a menu items from Cart based on User Id
and Menu Item Id*/
delete from cart
where userId = 1 and itemId = 2;
