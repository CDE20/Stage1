select rental_id,car_id,customer_id,km_driven from rentals
where MONTH(pickup_date) = "08"
order by rental_id;
