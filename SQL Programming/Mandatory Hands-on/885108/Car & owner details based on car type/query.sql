select c.car_id,c.car_name,o.owner_id from cars c, owners o 
where  (c.owner_id = o.owner_id) and (c.car_type = 'SUV' or c.car_type = 'Hatchback')
order by c.car_id;