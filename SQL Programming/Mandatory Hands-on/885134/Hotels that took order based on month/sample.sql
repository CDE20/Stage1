select distinct h.hotel_id,hotel_name,rating from hotel_details h,orders o where h.hotel_id=o.hotel_id and month(o.order_date)=7 order by hotel_id;