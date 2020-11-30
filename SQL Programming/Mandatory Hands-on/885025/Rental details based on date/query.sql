select rental_id,car_id,customer_id,km_driven from rentals
where month(return_date)='08' and year(return_date)='2019'
order by rental_id asc;