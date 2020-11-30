select distinct u.NAME, u.ADDRESS from USERS u 
join BOOKINGDETAILS b on u.USER_ID=b.USER_ID
where u.USER_ID not in (select distinct USER_ID from BOOKINGDETAILS
                        where NAME="HDFC")
order by u.NAME asc;