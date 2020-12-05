create database truyum;

use truyum;

create table User(
Id int Primary Key auto_increment,
Name varchar(30),
Email varchar(30),
Phone varchar(10)
);


create table Menu(
Id int Primary Key auto_increment,
Name varchar(30),
Price decimal(7,2),
Active enum('Yes','No'),
Date_Of_Launch date,
Category varchar(30),
Free_Delivery enum('Yes','No')
);


create table Cart(
Id int  Primary Key,
User_id int not null,
Menu_id int not null,
foreign key(User_id) references User(Id),
foreign key(Menu_id) references Menu(Id)
);

show tables;

