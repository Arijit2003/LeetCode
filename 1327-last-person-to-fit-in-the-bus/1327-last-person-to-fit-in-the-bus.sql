select t.person_name from
(select  turn, person_name,sum(weight) over (order by turn) as tw from Queue) as t
where t.tw<=1000
order by t.tw desc
limit 1;
