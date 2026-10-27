# Write your MySQL query statement below
SELECT 
    p.email as Email
FROM 
    Person p
GROUP BY
    p.email
HAVING 
    count(1) > 1;