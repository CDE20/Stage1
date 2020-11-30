select rental_id, car_id, customer_id, km_driven from rentals where rental_id in(select rental_id from rentals where return_date BETWEEN '2019-08-01' AND '2019-08-31')
order by rental_id asc;