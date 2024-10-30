# Write your MySQL query statement below
select DATE_FORMAT(t.trans_date,'%Y-%m') as month, t.country,
count(*) as trans_count, 
SUM(IF(t.state='approved',1,0)) as approved_count,
SUM(IF(t.state='approved',t.amount,0)) as approved_total_amount,
SUM(t.amount) as trans_total_amount
from Transactions as t
group by t.country, month;