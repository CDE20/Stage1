use truYum;

/*entering values into the table menu_item*/
/*1.a*/
insert into menu_item values
	 (1,'Sandwich',99,'Yes','2017-03-15','Main Course','Yes'),
	 (2,'Burger',129,'Yes','2017-12-23','Main Course','No'),
	 (3,'Pizza',149,'Yes','2017-08-21','Main Course','NO'),
	 (4,'French Fries',57,'No','2017-07-02','Starters','Yes'),
	 (5,'Chocolate Brownie',32,'Yes','2022-11-02','Dessert','Yes');
	
	/*1.b*/
	select * from menu_item;
	
	
	/*2.a*/
	select *from menu_item
	where date_of_launch >= '2017-03-15'
	and active_status = 'Yes';
	
	/*3.a*/
	select *from menu_item
	where item_id = 3;
	
	/*3.b*/
	update menu_item
	set item_name = 'Thal',
		item_price =120,
	    active_status ='No',
	    date_of_launch = '2017-03-27',
	    category = 'Main Course',
	    free_delivery = 'No'
	    where item_id = 2;
	
	/*4.a*/
	
	insert into user
	values (001, 'prem','prem@gmail.com','9876543210','Pune','prem123','customer'),
		   (002, 'raghav','rg@gmail.com','9876123450','Mumbai','rg789','admin'),
	       (003, 'sam','sam@gmail.com','9871234579','delhi','sam476','customer');
	 
	 insert into cart
	 values (501,'Thal',120,'No',001,1),
			(502,'Burger',129,'Yes',002,2),
	        (503,'Pizza',149,'Yes',003,3);
	
	/*5.a*/
	 select cart_id, name, price from cart 
	 where user_id=1;
	 
	/*5.b*/
	select sum(item_price) as TOTAL_PRICE from menu_item
	where item_id in (select item_id from cart where user_id = 2);
	
	/*6.a*/
	delete from cart
	where userId = 001 and itemId = 1;