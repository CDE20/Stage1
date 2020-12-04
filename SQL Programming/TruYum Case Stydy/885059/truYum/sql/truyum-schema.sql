create database menu;

use menu;
create table user
(
	userId int primary key auto_increment,
	name varchar(20),
    email varchar(30),
    password varchar(8),
    contact varchar(10),
    role varchar(10)
);

create table menu_item
(
	itemId int primary key auto_increment,
	name varchar(50),
    price int,
    active varchar(5),
    date_of_launch varchar(20),
    category varchar(20),
    free_delivery varchar(5)
);

create table cart
(
	cartId int primary key auto_increment,
    userId int,
    itemId int,
    foreign key (userId) references user (userId),
    foreign key (itemId) references menu_item (itemId)
);
