SELECT rental_id, car_id, customer_id, km_driven
FROM rentals
WHERE MONTH(return_date) = 8 AND YEAR(return_date) = 2019
ORDER BY rental_id;