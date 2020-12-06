create database truYum;
	
	use truYum;
	/* create table menu_item */
	
	create table menu_item(
	item_id int(5),
	item_name varchar(20),
	item_price decimal(10,2) not null,
	active_status varchar(8),
	date_of_launch date,
	category varchar(30) not null,
	free_delivery varchar(10) not null,
	primary key(item_id));
	
describe menu_item;
	/* create table user */
	
	create table user(
	user_id varchar(10) not null,
	name varchar (20),
	email varchar(20),
	phone_no varchar(10),
	address varchar (20),
	password varchar(20) not null,
	role varchar(20) not null,
	primary key (user_id));
	
    describe user;
	/* create table cart */
	
	create table cart(
	cart_id int(10) not null,
	name varchar(50),
	price decimal(10,2),
	free_delivery varchar(10),
	user_id varchar(10) not null,
	item_id int(10) not null,
	primary key(cart_id),
	foreign key (user_id) references user(user_id),
	foreign key(item_id) references menu_item(item_id));
    
describe cart;

	
SHOW DATABASES;

	
