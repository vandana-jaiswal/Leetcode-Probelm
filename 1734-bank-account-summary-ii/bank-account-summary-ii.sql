# Write your MySQL query statement below

select Sum( t.amount) as balance ,u.name
from Transactions t
inner join Users u
ON t.account = u.account
group by  u.name
having balance > 10000