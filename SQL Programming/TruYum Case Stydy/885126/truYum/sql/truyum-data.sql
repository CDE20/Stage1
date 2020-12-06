-- SQL QUERIES --

-- 1. View Menu Item List Admin (TYUC001) --

--    a. Insert data into menu_item table :

insert into menu_item values
('M01', 'Sandwich', 99.00, 'Yes', '2017-03-15', 'Main Course', 'Yes'),
('M02', 'Burger', 129.00, 'Yes', '2017-12-23', 'Main Course', 'No'),
('M03', 'Pizza', 149.00, 'Yes', '2017-08-21', 'Main Course', 'No'),
('M04', 'French Fries', 57.00, 'No', '2017-07-02', 'Starters', 'Yes'),
('M05', 'Chocolate Brownie', 32.00, 'Yes', '2022-11-02', 'Dessert', 'Yes');

--    b. SQL query to get all menu items :

select * from menu_item;

-- 2. View Menu Item List Customer (TYUC002) --

--    a. SQL query to get all menu items which after launch date and is active :

select * from menu_item where menu_date_of_launch >= '2017-03-15' and menu_active = 'Yes';

-- 3. Edit Menu Item (TYUC003) --

--    a. SQL query to get a menu items based on Menu Id :

select * from menu_item where menu_id = 'M01';

--    b. SQL query to update all the columns values based on Menu Id in menu_item table :

update menu_item  
set menu_name = 'Chilli Potato',
    menu_price = 60.00,
    menu_active = 'Yes',
    menu_date_of_launch = '2020-03-20',
    menu_category = 'Main Course',
    menu_free_delivery = 'Yes'
where menu_id = 'M02';

-- 4. Add to Cart (TYUC004) --

--    a. SQL query to insert scripts for adding data into user and cart tables :

--        Insert data into user table -->

insert into user values
('A01', 'Saurabh', 'Bihar', '9678123450', 'saurabh01@gmail.com', 'admin'),
('CUS01', 'Rishu', 'Kolkata', '8845109336', 'rishu01@gmail.com', 'customer'),
('CUS02', 'David', 'USA', '0115834529', 'david02@gmail.com', 'customer');

--        Insert data into cart tables -->

insert into cart values
(1, 'Sandwich', 'Yes', 99.00, 'CUS01', 'M01'), 
(2, 'Burger', 'No', 129.00,'CUS01', 'M02'),
(3, 'Pizza', 'No', 149.00, 'CUS02', 'M03');

-- 5. View Cart (TYUC005) --

--    a. SQL query to get all menu items in a particular user’s cart :

select c.cart_id, c.cart_name, c.cart_free_delivery, c.cart_price from cart c
join user u on c.user_id = u.user_id
where u.user_id = 'CUS02';

--    b. SQL query to get the total price of all menu items in a particular user’s cart :

select sum(c.cart_price) as Total_Price from cart c
join user u on c.user_id = u.user_id
where u.user_id = 'CUS01';

-- 6. Remove Item from Cart (TYUC006) --

--    a. SQL query to remove a menu item from Cart based on User Id and Menu Id :

delete from cart where user_id = 'CUS02' and menu_id = 'M03';