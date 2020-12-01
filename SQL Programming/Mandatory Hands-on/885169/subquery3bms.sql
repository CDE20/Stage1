select distinct users.name, users.address
from users 
inner join bookingdetails on users.user_id = bookingdetails.user_id
where users.user_id not in
(select user_id from bookingdetails where name='HDFC') order by users.name;