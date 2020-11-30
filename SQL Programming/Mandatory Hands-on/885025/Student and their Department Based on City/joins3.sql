select s.student_name,d.department_name from Student s join Department d
on s.department_id=d.department_id 
where s.city='Coimbatore' 
order by s.student_name asc;