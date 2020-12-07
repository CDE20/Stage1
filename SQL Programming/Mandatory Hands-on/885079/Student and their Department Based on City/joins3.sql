select s.student_name,d.department_name from Student s, Department d
where s.department_id = d.department_id and s.city = 'Coimbatore' 
order by s.student_name;
