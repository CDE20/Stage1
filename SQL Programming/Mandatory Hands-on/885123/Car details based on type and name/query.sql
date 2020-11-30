select car_id,car_name,car_type
from cars
where car_type='Sedan' AND car_name LIKE 'Maruthi %'
ORDER BY car_id;