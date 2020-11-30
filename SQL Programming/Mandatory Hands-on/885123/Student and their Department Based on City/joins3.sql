select Student.student_name,Department.department_name
from Department
JOIN Student
ON Department.department_id=Student.department_id
where city='Coimbatore'
ORDER BY student_name;