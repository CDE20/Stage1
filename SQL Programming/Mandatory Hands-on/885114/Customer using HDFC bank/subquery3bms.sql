-- select name, address from users;
-- select name from BOOKINGDETAIL?S;

-- select name, address 
-- from users 
-- where user_id IN (select user_id from bookingdetails where name != 'HDFC')
-- order by name;

-- SELECT DISTINCT U.NAME, U.ADDRESS
-- FROM USERS U INNER JOIN BOOKINGDETAILS B
-- ON U.USER_ID = B.USER_ID
-- WHERE B.NAME != 'HDFC'
-- ORDER BY U.NAME;

select distinct u.name, u.address from users u
join bookingdetails b on b.user_id = u.user_id
where u.user_id not in 
( select user_id from bookingdetails where name='HDFC')
order by u.name;
