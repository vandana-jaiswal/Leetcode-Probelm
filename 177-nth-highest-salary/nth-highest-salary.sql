CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
select  salary from
 (
 select salary,Dense_Rank() over (Order by salary desc ) as R
 from Employee
 ) as temp
 where R = N 
 group by salary
  );
END