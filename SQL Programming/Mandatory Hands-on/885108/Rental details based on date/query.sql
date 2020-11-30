select r.rental_id,r.car_id,r.customer_id,r.km_driven from rentals r
where r.return_date like '____-08-__'
order by rental_id;