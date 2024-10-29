# Write your MySQL query statement below

select R.contest_id,
ROUND(count(R.user_id)*100/t.ct,2)as percentage from 
Register as R cross join (select count(*) as ct from Users) as t
group by R.contest_id
order by percentage desc,R.contest_id asc;