# Write your MySQL query statement below
select * from Cinema
where (id % 2) != 0
Having  description NOT IN ('boring')
Order by rating desc;