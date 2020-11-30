select distinct h.hotel_id, hotel_name, rating from Hotel_details h, orders o where 
month(o.order_date) = 7 and h.hotel_id=o.hotel_id order by h.hotel_id asc;