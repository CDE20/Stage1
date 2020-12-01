select distinct h.hotel_id,h.hotel_name,h.rating from hotel_details h
JOIN orders o ON h.hotel_id = o.hotel_id where
MONTH(o.order_date) = "07"
order by h.hotel_id;
