-- 1. View Menu Item List Admin (TYUC001)
-- a. Frame insert scripts to add data into menu_item table. Refer View Menu
-- Item List Admin screen below for sample data.
insert into menu_items (
	name,
    price, 
    active, 
    date_of_launch,
    category,
    free_delivery
) values (
	"Sandwich", 
    99.00,
    "Yes",
    '2017-03-15',
    "Main Course",
    "Yes"
), (
	"Burger", 
    129.00,
    "Yes",
    '2017-12-23',
    "Main Course",
    "No"
), (
	"Pizza", 
    149.00,
    "Yes",
    '2017-08-21',
    "Main Course",
    "No"
), (
	"French Fries", 
    57.00,
    "No",
    '2017-07-02',
    "Starters",
    "Yes"
), (
	"Chocolate Brownie", 
    32.00,
    "Yes",
    '2022-11-02',
    "Dessert",
    "Yes"
);

-- b. Frame SQL query to get all menu items
select 
	menu_item_id, 
	name,
    price, 
    active, 
    date_format(date_of_launch, '%d/%m/%Y') as date_of_launch,
    category,
    free_delivery 
from 
	menu_items;


-- 2. View Menu Item List Customer (TYUC002)
-- a. Frame SQL query to get all menu items which after launch date and is
-- active.
select 
	menu_item_id, 
	name,
    price, 
    active, 
    date_format(date_of_launch, '%d/%m/%Y') as date_of_launch,
    category,
    free_delivery 
from 
	menu_items
where 
	date_of_launch < curdate() and active = "Yes";


-- 3. Edit Menu Item (TYUC003)
-- a. Frame SQL query to get a menu items based on Menu Item Id
select 
	menu_item_id, 
	name,
    price, 
    active, 
    date_format(date_of_launch, '%d/%m/%Y') as date_of_launch,
    category,
    free_delivery 
from 
	menu_items
where 
	menu_item_id = 1;
    
-- b. Frame update SQL menu_items table to update all the columns values
-- based on Menu Item Id
update 
	menu_items
set	
	name = "Sandwich", 
	price = 99.00, 
	active = "Yes",
	date_of_launch = '2017-03-15',
	category = "Main Course",
	free_delivery =  "Yes"
where 
	menu_item_id = 1;
    
    
-- 4. Add to Cart (TYUC004)
-- a. Frame insert scripts for adding data into user and cart tables.In user table
-- create two users. Once user will not have any entries in cart, while the
-- other will have at least 3 items in the cart.
insert into users 
	(name, password, role)
values 
	("Admin user", "admin123", "admin"),
    ("Customer user", "customer123", "customer");
    
insert into cart_items
	(menu_item_id, user_id, quantity) 
values 
	(1, 2, 1),
    (2, 2, 1),
    (3, 2, 1);
select * from users;
select * from cart_items;


-- 5. View Cart (TYUC005)
-- a. Frame SQL query to get all menu items in a particular user’s cart
select c.cart_item_id, m.name, m.free_delivery, m.price 
from cart_items c
inner join menu_items m on c.cart_item_id = m.menu_item_id
where user_id = 2;

-- b. Frame SQL query to get the total price of all menu items in a particular
-- user’s cart
select sum(m.price) as total
from cart_items c
inner join menu_items m on c.cart_item_id = m.menu_item_id
where user_id = 2;


-- 6. Remove Item from Cart (TYUC006)
-- a. Frame SQL query to remove a menu items from Cart based on User Id
-- and Menu Item Id
delete from cart_items 
where cart_item_id = 3;


select * from menu_items;
select * from users;
select * from cart_items;
