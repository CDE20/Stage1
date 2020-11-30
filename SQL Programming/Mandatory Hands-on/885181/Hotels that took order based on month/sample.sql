select hotel_id,hotel_name ,rating from hotel_details where hotel_id in(select hotel_id from orders where order_date between '2019-07-01' AND '2019-07-31')
order by hotel_id asc;