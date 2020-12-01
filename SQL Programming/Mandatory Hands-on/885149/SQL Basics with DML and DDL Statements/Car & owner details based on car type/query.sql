select car_id,car_name,owner_id from cars
where car_type='SUV'
or car_type='Hatchback'
order by car_id;