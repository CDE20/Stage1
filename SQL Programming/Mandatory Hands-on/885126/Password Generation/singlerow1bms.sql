select name, concat(substring(name,1,3), substring(phno,1,3)) as password
from users
order by name;