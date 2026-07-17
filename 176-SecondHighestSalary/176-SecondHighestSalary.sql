-- Last updated: 7/17/2026, 2:58:33 PM
# Write your MySQL query statement below
SELECT
    (
        SELECT MAX(salary)
        FROM Employee
        WHERE salary < (
            SELECT MAX(salary)
            FROM Employee
        )
    ) AS SecondHighestSalary;