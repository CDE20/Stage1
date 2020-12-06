create database truYum;
use truYum;

create table Menu(
MenuId int primary key,
Name varchar(50),
Price decimal(10,2),
Active varchar(3),
DateOfLaunch date,
Category varchar(50),
FreeDelivery varchar(50)
);


create table User(
UserId int primary key,
Name varchar(20),
Email varchar(20),
phone varchar(10),
address varchar(30)
);

create table Cart(
Id int primary key,
MenuId int not null,
UserId int not null,
foreign key(MenuId) references Menu(MenuId),
foreign key(UserId) references User(UserId)
);

show tables;