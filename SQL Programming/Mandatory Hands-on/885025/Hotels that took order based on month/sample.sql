select distinct h.hotel_id,h.hotel_name,h.rating from hotel_details as h,orders as o
where h.hotel_id=o.hotel_id and order_date between '2019-07-01' and '2019-07-30' 
order by hotel_id asc;