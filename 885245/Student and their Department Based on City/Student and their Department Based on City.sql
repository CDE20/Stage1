select student_name,department_name 
from student,department
where student.department_id=department.department_id
and  city='Coimbatore' 
order by student_name;