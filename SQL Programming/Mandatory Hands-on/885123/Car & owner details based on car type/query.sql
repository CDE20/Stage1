select cars.car_id, cars.car_name,cars.owner_id
from cars
where car_type IN('Hatchback','SUV')
ORDER BY car_id;
