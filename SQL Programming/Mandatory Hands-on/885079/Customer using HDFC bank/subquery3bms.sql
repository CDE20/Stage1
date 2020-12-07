select distinct u.Name,u.Address  from Users u,Bookingdetails b
where (u.USER_ID = b.USER_ID) and u.Name not in (select u.name from Users u, Bookingdetails b
                    where u.USER_ID = b.USER_ID and b.Name = 'HDFC')
order by u.Name;