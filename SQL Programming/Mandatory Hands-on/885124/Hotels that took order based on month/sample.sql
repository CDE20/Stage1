select distinct h.hotel_id, h.hotel_name,h.rating from hotel_details h 
inner join orders o
on h.hotel_id=o.hotel_id
where month(order_date)=7
order by h.hotel_id asc;