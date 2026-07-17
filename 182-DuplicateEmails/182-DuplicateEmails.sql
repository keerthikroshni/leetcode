-- Last updated: 7/17/2026, 2:58:27 PM
# Write your MySQL query statement below
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;