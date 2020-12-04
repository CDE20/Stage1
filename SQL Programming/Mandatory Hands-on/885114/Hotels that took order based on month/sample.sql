SELECT DISTINCT h.hotel_id, h.hotel_name, h.rating
FROM hotel_details h INNER JOIN Orders o
ON h.hotel_id = o.hotel_id
WHERE MONTH(order_date) = 7
ORDER BY h.hotel_id;