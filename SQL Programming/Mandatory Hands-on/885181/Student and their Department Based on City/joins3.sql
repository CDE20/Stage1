select Student.student_name, Department.department_name from Student 
INNER JOIN Department  ON Student.department_id = Department.department_id 
WHERE  Student.city = 'Coimbatore'  order by Student.student_name ASC;