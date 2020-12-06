-- creating a database named 'truyum'
create database truyum;

-- creating user table
create table user(
	user_id varchar(15) primary key,
    user_name varchar(20) not null,
    user_address varchar(50),
    user_phone_no varchar(20) not null,
    user_email varchar(30) not null,
    user_identity varchar(10) not null
);

-- creating menu_item table
create table menu_item(
	menu_id varchar(15) primary key,
    menu_name varchar(15) not null,
    menu_price decimal(10, 2) not null,
    menu_active enum('Yes', 'No'),
    menu_date_of_launch date not null,
    menu_category varchar(20),
    menu_free_delivery enum('Yes', 'No')
);

-- creating cart table
create table cart(
	cart_id int primary key auto_increment,
    cart_name varchar(15) not null,
    cart_free_delivery enum('Yes', 'No'),
    cart_price decimal(10, 2) not null,
    user_id varchar(15),
    menu_id varchar(15),
    foreign key(user_id) references user(user_id),
    foreign key(menu_id) references menu_item(menu_id)
);