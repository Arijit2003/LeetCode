# Write your MySQL query statement below
select q.query_name, ROUND((sum(q.rating/q.position))/count(*),2) as quality,
ROUND(((SUM(IF(q.rating<3, 1, 0))/count(*))*100),2) as poor_query_percentage 
from Queries as q
where query_name is not null
group by q.query_name;