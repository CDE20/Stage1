select distinct u.NAME,u.ADDRESS from 
users u inner join bookingdetails bd 
on u.user_id=bd.user_id 
where u.user_id not in (select user_id from bookingdetails where name='HDFC')
order by u.name;