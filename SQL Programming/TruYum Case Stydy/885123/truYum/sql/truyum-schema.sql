create database truyum_menu;

use truyum_menu;
create table menu_item
(
menu_item_id int Primary key auto_increment,
name varchar(50),
price int,
active varchar(5),
date_of_launch varchar(20),
category varchar(20),
free_delivery varchar(5)
);
 
 create table USER(
 user_id int auto_increment,
 name varchar(20),
 number bigint,
 primary key(user_id)
 );
 
 create table cart(
 cart_id int primary key auto_increment,
 user_id int,
 menu_item_id int,
 foreign key (user_id) references user (user_id),
 foreign key (menu_item_id) references menu_item(menu_item_id)
 );