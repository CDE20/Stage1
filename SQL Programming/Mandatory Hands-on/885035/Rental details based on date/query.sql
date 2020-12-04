select rental_id, car_id,customer_id,km_driven from rentals
where return_date between '2019-08-01' and '2019-08-31'
order by rental_id;