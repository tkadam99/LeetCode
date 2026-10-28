# Write your MySQL query statement below
Select 
    w.id
from
    Weather w
join 
    Weather w2
on
    DATEDIFF(w.recordDate, w2.recordDate) = 1
where
    w.temperature > w2.temperature;