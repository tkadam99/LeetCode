# Write your MySQL query statement below
Select
    c.name as Customers
from 
    Customers c
left join 
    Orders o
On 
    c.id = o.customerId
Where
    o.Id IS NULL
