select distinct orders.hotel_id,hotel_details.hotel_name,hotel_details.rating
from hotel_details inner join orders on hotel_details.hotel_id=orders.hotel_id
where month(orders.order_date)=07;