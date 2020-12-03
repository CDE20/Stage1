/*---Creating database---*/
create database truyum;


/*---Using database created---*/
use truyum;



/*---Creating table for Menu---*/
create table menu_item
(
	id int not null primary key auto_increment,
    Name varchar(100),
    Price decimal(10,2),
    Active varchar(100),
    DateOfLaunch date,
    Category varchar(100),
    FreeDelivery varchar(100)
);



/*---Creating table for Customers/Users---*/
create table user
(
	UserId int not null primary key,
    UserName varchar(100),
    UserEmail varchar(100),
    UserPhoneNo varchar(100),
    UserAddress varchar(100)
);



/*---Creating table for cart---*/
create table cart
(
	CartId int not null primary key,
	Name varchar(100),
    Price decimal(10,2),
    FreeDelivery varchar(100),
    MenuId int,
    CustomerId int,
    foreign key(MenuId) references menu_item(id),
    foreign key(CustomerId) references user(UserId)
);