select distinct h.hotel_id,h.hotel_name,h.rating  from hotel_details h,orders o
where o.order_date like '____-07-__' and h.hotel_id = o.hotel_id
order by h.hotel_id;