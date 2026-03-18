# Write your MySQL query statement below

With ctea
as(
select e.name as Employee , e.salary as Salary, d.name as Department ,
Rank() over(Partition by d.name  order by e.Salary desc) as r from Employee e
left join Department d
ON e.departmentId = d.id
)
select Department ,Employee,Salary
 from ctea
 where r = 1

