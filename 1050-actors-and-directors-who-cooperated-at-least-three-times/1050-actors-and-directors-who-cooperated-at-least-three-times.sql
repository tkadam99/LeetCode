# Write your MySQL query statement below



SELECT 
    actor_id, 
    director_id
    -- COUNT(actor_id) AS actor
FROM 
    ActorDirector
GROUP BY 
    actor_id, 
    director_id
HAVING
    COUNT(actor_id) > 2;



