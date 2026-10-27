# Write your MySQL query statement below
SELECT
    e.name as Employee
FROM 
    Employee e
JOIN 
    Employee manager
ON 
    manager.id = e.managerId
WHERE
    manager.salary < e.salary