SELECT s.student_name, d.department_name
FROM Student s INNER JOIN Department d 
ON s.department_id = d.department_id
WHERE s.city = 'Coimbatore'
ORDER BY s.student_name;