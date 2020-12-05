use truyum;

insert into User values(001,"Michael","michael@gmail.com","9876512340"),
(002,"Joseph","joseph@yahoo.com","8080118080"),
(003,"Akshat","akshat@gmail.com","1234567890");

select * from User;

insert into Menu values(001,"Sandwich",99.00,"Yes","2017-03-15","Main Course","Yes"),
(002,"Burger",129.00,"Yes","2017-12-23","Main Course","No"),
(003,"Pizza",149.00,"Yes","2017-08-21","Main Course","No"),
(004,"French Fries",57.00,"No","2017-07-02","Starters","Yes"),
(005,"Chocolate Brownie",32.00,"Yes","2022-11-02","Dessert","Yes");

insert into Cart values(001,002,004),
(002,002,005),
(003,003,002),
(004,001,001),
(005,001,003);

select * from Cart;

/* SQL query to get all menu items */
select * from Menu;



/* SQL query to get all menu items where Status is Active*/
select * from Menu
where Active="Yes" and Date_of_launch >= "2017-03-15";



/* SQL query to get Menu items based on Id */
select * from Menu
where Id = 5;



/* SQL query to Update Menu item based on Id */
Update Menu
set Name = "Veg Burger" 
where Id=2;
select * from Menu;



/* SQL query to insert new User in User table and and their respective orders in cart table */
insert into User values(004,"Gaurav","gaurav@hotmail.com",9889881770),
(005,"Pawan","pawan@yahoo.com",1223344550);

select * from User;

insert into Cart values(006,005,004),
(007,005,002),
(008,005,001);

select * from Cart;



/* SQL query to get Menu items in a particular User's Cart*/
select m.Name from menu m join Cart c On
m.id = c.menu_id join User u On
c.user_id = u.id where
u.id = 5;



/* SQL query to get the total Price of Menu items in a particular User's Cart */
select sum(m.price) from menu m join Cart c On
m.id = c.menu_id join User u On
c.user_id = u.id where
u.id = 1;



/* SQL query to remove menu item from cart based on User Id and Menu Id */
delete from cart 
where user_id = 2 and menu_id = 5;

select * from cart;







 
