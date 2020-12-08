/*1. View Menu Item List Admin 
a. Frame insert scripts to add data into menu_item table. Refer View Menu
Item List Admin screen below for sample data.*/
INSERT INTO menu_item(name,price,active,date_of_launch,category,free_delivery)values
("Sandwich", 99, "Yes", "15/03/2017", "Main Course", "Yes"),
("Burger", 129, "Yes", "23/12/2017", "Main Course", "No"),
("Pizza", 149, "Yes", "21/08/2017", "Main Course", "No"),
("French Fries", 57, "No", "02/07/2017", "Starters", "No"),
("Chocolate Brownie", 32, "No", "02/11/2022", "Dessert", "Yes");

/*b. Frame SQL query to get all menu items*/
SELECT * FROM menu_item;

/*2. View Menu Item List Customer 
a. Frame SQL query to get all menu items which after launch date and is
active*/
SELECT * from menu_item
WHERE active="yes";

/*3. Edit Menu Item 
a. Frame SQL query to get a menu items based on Menu Item Id*/
SELECT * FROM menu_item
WHERE menu_item_id="5";
 
/*b. Frame update SQL menu_items table to update all the columns values
based on Menu Item Id*/
UPDATE menu_item
set name="manchurian",price=110,active="yes",date_of_launch="13/01/2017",category="starters",free_delivery="No"
WHERE menu_item_id="5";

/*4. Add to Cart 
a. Frame insert scripts for adding data into user and cart tables.In user table
create two users. Once user will not have any entries in cart, while the
other will have at least 3 items in the cart.*/

INSERT INTO USER(name,number) values
("rahul",098765432),
("shyam",789065432),
("athirva",5678904532);

INSERT INTO cart(user_id,menu_item_id) values
(2,1),
(2,2),
(2,3)
;

/*5. View Cart (TYUC005)
a. Frame SQL query to get all menu items in a particular user’s cart*/
SELECT menu_item_id from cart
where User_id="2";
/*b. Frame SQL query to get the total price of all menu items in a particular
user’s cart*/
SELECT SUM(price) 
FROM menu_item
WHERE menu_item_id in (select menu_item_id from cart where user_id="2");

/*6. Remove Item from Cart (TYUC006)
a. Frame SQL query to remove a menu items from Cart based on User Id
and Menu Item Id*/

DELETE FROM cart
WHERE user_id ="2" and menu_item_id=5;

