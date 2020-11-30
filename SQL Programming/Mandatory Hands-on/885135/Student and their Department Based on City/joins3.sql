select student_name, department_name from Student s, Department d where s.city="Coimbatore"
and s.department_id=d.department_id order by s.student_name asc;