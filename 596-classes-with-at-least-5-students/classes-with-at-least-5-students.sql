# Write your MySQL query statement below
select class  from 
Courses
Group by class
having  Count(class) >= 5
