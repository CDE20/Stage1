select s.student_name,d.department_name from Student s 
inner join 
Department d 
where d.department_id = s.department_id
and s.city = "Coimbatore"
order by s.student_name;