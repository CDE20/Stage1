select rental_id, car_id, customer_id, km_driven
from rentals
where pickup_date like "2019-08%"
order by rental_id;