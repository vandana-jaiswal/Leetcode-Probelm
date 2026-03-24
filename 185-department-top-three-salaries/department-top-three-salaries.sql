# Write your MySQL query statement below
with CteTop3
AS(
select  d.name as  Department , e.name as Employee,e.salary  as Salary,
Dense_Rank() over(partition by d.name order by salary desc ) as r
from Employee e
inner join Department d
ON e.departmentId = d.id
)
select Department, Employee , Salary from CteTop3
where r < 4