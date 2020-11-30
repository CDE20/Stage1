select distinct u.name, u.address from USERS u, BOOKINGDETAILS b where 
u.user_id not in (select user_id from BOOKINGDETAILS where NAME = "HDFC") and u.user_id=b.user_id order by u.name;