create database Truyum_sql;
use Truyum_sql;
/* Table Creation*/
create table user(
user_id varchar(10) not null primary key,
name varchar(20),
password varchar(20) not null, 
user_role varchar(20) not null);
desc user;
create table menu(
item_id int(5) primary key,
item_name varchar(20),
item_price float(10) not null,
active_status varchar(8),
date_of_launch date,
category varchar(50) not null,
free_delivery varchar(10) not null);

create table cart(
cart_id int(10) not null,
user_id varchar(10) not null,
item_id int(20) not null,
foreign key(user_id) references user(user_id), 
foreign key(item_id) references menu(item_id));

/*Queries*/
/* 1A */
insert into menu values('0001','Sandwich','99.00','Yes','2017-03-15','Maincourse','Yes'),
('0002','Burger','129.00', 'Yes', '2017-12-23', 'Maincourse', 'No'),
('0003', 'Pizza', '149.00', 'Yes', '2017-08-21', 'Maincourse', 'No'),
('0004', 'French Fries', '57.00', 'No', '2017-07-02', 'Starters', 'Yes'),
('0005', 'Chocolate Brownie', '32.00', 'Yes', '2017-11-02', 'Dessert', 'Yes');

/* 1B */
select * from menu;

/* 2A */
select item_id, item_name, item_price from menu where date_of_launch < curdate() and active_status='Yes';

/* 3A */
select * from menu where item_id='0001';
/* 3B */
update menu set item_name='Misal', item_price='70.00', active_status='Yes', date_of_launch='2017-04-15', category='Maincourse', free_delivery='Yes' where item_id='0004';

/* 4A */
/* Insertion in User*/
insert into user values('A1','John', 'a1@123', 'admin'),('A2','Jack','a2@456', 'customer'), ('A3','Steve', 'a3@789', 'customer'); 
/*Insertion in Cart*/
insert into cart values('01','A2','0001'),('02','A2','0002'),('03','A2','0003'),('04','A2','0004'),('05','A3','0001');

/* 5A */
select c.item_id, m.item_name, m.item_price, m.date_of_launch, m.category, m.free_delivery from cart c, menu m where c.item_id=m.item_id and c.user_id='A2';
/* 5B */
select c.user_id, sum(m.item_price) as Billing_Amount from cart c, menu m where c.item_id=m.item_id and c.user_id='A2';

/* 6A*/
delete from cart where user_id='A3' and item_id='0001';




