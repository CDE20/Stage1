drop database truyum;
create database truyum;
use truyum;

create table menu_items (
	menu_item_id int primary key not null auto_increment,
    name varchar(20),
    price decimal(10, 2), 
    active varchar(10), 
    date_of_launch date,
    category varchar(20),
    free_delivery varchar(10)
);

create table users (
	user_id int primary key not null auto_increment,
    name varchar(30),
	password varchar(30), 
    role varchar(10)	
);

create table cart_items (
	cart_item_id int primary key not null auto_increment,
    menu_item_id int, 
    user_id int,
    quantity int,
    foreign key (menu_item_id) references menu_items(menu_item_id),
    foreign key (user_id) references users(user_id)
);

desc menu_items;
desc users;
desc cart_items;

show tables;

