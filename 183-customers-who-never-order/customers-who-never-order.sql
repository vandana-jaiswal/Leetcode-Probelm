# Write your MySQL query statement below

select c.name AS Customers from Customers c
Left Join Orders o 
ON o.customerId = c.id
where o.customerId IS NULL

