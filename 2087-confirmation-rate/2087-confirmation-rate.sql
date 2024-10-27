# Write your MySQL query statement below
select s.user_id, 
ROUND(COALESCE(t.confirmed_msg/t.total_msg,0),2) as confirmation_rate  from Signups as s left outer join  
(select user_id, count(*) as total_msg,
sum(CASE WHEN action='confirmed' THEN 1 ELSE 0 END) as confirmed_msg
from Confirmations group by user_id) as t
on s.user_id=t.user_id;