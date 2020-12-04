SELECT customer_id, customer_name, address, phone_no FROM customers
WHERE SUBSTRING(email_id, -9) = "gmail.com";