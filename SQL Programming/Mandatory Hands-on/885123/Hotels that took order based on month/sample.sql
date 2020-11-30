Select distinct hotel_details.hotel_id,hotel_details.hotel_name,hotel_details.rating
from hotel_details
join orders
on hotel_details.hotel_id=orders.hotel_id
where order_date like '____-07%'
ORDER BY hotel_id;