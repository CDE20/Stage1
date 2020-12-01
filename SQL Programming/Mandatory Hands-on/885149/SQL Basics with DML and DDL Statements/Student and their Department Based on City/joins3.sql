SELECT S.student_name,d.department_name from Student S
join Department d on S.department_id=d.department_id
where S.city='Coimbatore'
order by S.student_name;