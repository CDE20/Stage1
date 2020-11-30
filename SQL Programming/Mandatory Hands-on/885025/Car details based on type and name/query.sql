select car_id,car_name,car_type
from cars
where substring(car_name,1,7)="Maruthi" and car_type="Sedan"
order by car_id asc; 