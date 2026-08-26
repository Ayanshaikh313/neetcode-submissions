-- Write your query below
SELECT c.customer_id 
FROM Customers as c
WHERE revenue >'0' AND year='2020';