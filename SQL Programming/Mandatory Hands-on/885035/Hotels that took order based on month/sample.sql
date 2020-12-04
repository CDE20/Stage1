select distinct h.hotel_id,h.hotel_name,h.rating from hotel_details h
join orders o on h.hotel_id = o.hotel_id
where order_date between '2019-07-01' and '2019-07-31'
order by h.hotel_id;