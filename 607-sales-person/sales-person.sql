# Write your MySQL query statement below

with cte
as(
select  o.sales_id as sales_id from Orders o 
inner join Company c
ON o.com_id = c.com_id and c.name = 'red'
)

select  s.name from cte c
right join  SalesPerson s
on s.sales_id=c.sales_id 
where c.sales_id is null

