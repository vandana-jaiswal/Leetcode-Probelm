# Write your MySQL query statement below
with cteMax
AS(
select num,
 count(num) as c
 from MyNumbers
 group by num
)
select Max(num) as num from cteMax
where c = 1




