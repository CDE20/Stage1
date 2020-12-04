SELECT c.car_id, c.car_name, o.owner_id
FROM cars c INNER JOIN owners o
ON c.owner_id = o.owner_id
WHERE c.car_type = 'Hatchback' or c.car_type = 'SUV';