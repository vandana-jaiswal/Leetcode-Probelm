# Write your MySQL query statement below
with CteP
As(


select id , num , 
lag(num) over() as beforeNumber,
lead(num) over() as AfterNumber
from Logs
)
select distinct num as ConsecutiveNums from CteP
where num=beforeNumber 

And num= AfterNumber
