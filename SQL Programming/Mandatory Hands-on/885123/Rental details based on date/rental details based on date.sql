select rentals.rental_id,rentals.car_id,rentals.customer_id,rentals.km_driven
from rentals
where return_date Like '2019-08%';