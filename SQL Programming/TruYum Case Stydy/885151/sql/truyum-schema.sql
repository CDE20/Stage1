create database truyum;

use truyum;

/* create table user */

create table user(
user_id varchar(10) not null primary key ,
name varchar (20),
email varchar(20),
phone_no varchar(10),
address varchar (20),
password varchar(20) not null,
role varchar(20) not null);

/* create table menu_item */

CREATE TABLE menu_item (
    item_id INT(5) PRIMARY KEY,
    item_name VARCHAR(20),
    item_price DECIMAL(10 , 2 ) NOT NULL,
    active_status VARCHAR(8),
    date_of_launch DATE,
    category VARCHAR(30) NOT NULL,
    free_delivery VARCHAR(10) NOT NULL
);


/* create table cart */

create table cart(
cart_id int(10) not null primary key,
name varchar(50),
price decimal(10,2),
free_delivery varchar(10),
user_id varchar(10) not null,
item_id int(10) not null,
foreign key (user_id) references user(user_id),
foreign key(item_id) references menu_item(item_id));