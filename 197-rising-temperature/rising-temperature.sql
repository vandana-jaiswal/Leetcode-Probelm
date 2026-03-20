# Write your MySQL query statement below

-- select id as Id from (

-- with CteT
-- As(
-- select id , temperature,
-- lag(temperature) over(order by recordDate) as PreTemp
--  from Weather
-- )

-- select 
-- Case 
--     when temperature> PreTemp then id 
--     end as id
--  from CteT
-- ) as t
-- where id IS NOT NULL

SELECT w1.id
FROM Weather w1
JOIN Weather w2
ON w1.recordDate = DATE_ADD(w2.recordDate, INTERVAL 1 DAY)
WHERE w1.temperature > w2.temperature;

