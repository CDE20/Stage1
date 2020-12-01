select distinct hotel_details.hotel_id, hotel_details.hotel_name, hotel_details.rating
from hotel_details inner join orders
on hotel_details.hotel_id = orders.hotel_id
where orders.order_date like '2019-07-%'
order by hotel_details.hotel_id;