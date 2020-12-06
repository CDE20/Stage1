/* 1. View Menu Item List Admin (TYUC001)
a. Frame insert scripts to add data into menu_item table. */
insert into Menu values 
		(1,'Sandwich',99,'Yes','2017-03-15','Main Course','Yes'),
        (2,'Burger',129,'Yes','2017-12-23','Main Course','No'),
        (3,'Pizza',149,'Yes','2017-08-21','Main Course','NO'),
        (4,'French Fries',57,'No','2017-07-02','Starters','Yes'),
        (5,'Chocolate Brownie',32,'Yes','2022-11-02','Dessert','Yes');
   
/* b. Frame SQL query to get all menu items */      
select * from Menu; 

/* 2. View Menu Item List Customer (TYUC002)
a. Frame SQL query to get all menu items which after launch date and is
active. */

select * from Menu
where DateOfLaunch >= '2017-03-15'
and Active= 'Yes';

/* 3. Edit Menu Item (TYUC003)
a. Frame SQL query to get a menu items based on Menu Item Id */
select * from Menu where MenuId = 2;

/* b. Frame update SQL menu_items table to update all the columns values
based on Menu Item Id */

update Menu set
	Name = 'Cheese Sandwich',
	Price =150,
    Active ='Yes',
    DateOfLaunch = '2017-03-22',
    Category = 'Main Course',
    FreeDelivery = 'No'
    where MenuId = 1;
    
/* 4. Add to Cart (TYUC004)
a. Frame insert scripts for adding data into user and cart tables.In user table
create two users. Once user will not have any entries in cart, while the
other will have at least 3 items in the cart.*/

insert into User
values (1, 'John','john1@gmail.com','7898976553','Mumbai'),
       (2, 'Suresh','ramesh@gmail.com','9878665434','Pune');
       
 select * from user;      
 
 insert into cart values 
		(101,1,1),
		(102,4,1),
        (103,3,1);
        
 /* 5. View Cart (TYUC005)
a. Frame SQL query to get all menu items in a particular user’s cart */       
 select c.Id,m.MenuId, m.Name, m.Price from cart c,Menu m 
 where c.MenuId=m.MenuId and UserId=1;

/* b. Frame SQL query to get the total price of all menu items in a particular
user’s cart */       
select sum(Price) as total_price from Menu
where MenuId in(select MenuId from cart where UserId = 1);
  
  
 /* 6. Remove Item from Cart (TYUC006)
a. Frame SQL query to remove a menu items from Cart based on User Id
and Menu Item Id */ 
delete from cart where UserId=1 and MenuId=3;

select * from cart;