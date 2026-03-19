# Write your MySQL query statement below
select Max(num) as num from 
(
select num, count(*)
 from MyNumbers
 group by num
 having count(*) = 1
) as t

