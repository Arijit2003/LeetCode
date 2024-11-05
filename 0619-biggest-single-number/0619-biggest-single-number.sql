# Write your MySQL query statement below
SELECT max(t.num) as num
FROM
(SELECT num 
FROM MyNumbers
GROUP BY num
having count(num)=1) as t;  