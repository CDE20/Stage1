select distinct h.hotel_id,h.hotel_name,h.rating from hotel_details h,orders o
where h.hotel_id=o.hotel_id and o.order_date BETWEEN "2019-07-01" and "2019-07-31"
order by h.hotel_id;