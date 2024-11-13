SELECT DISTINCT(T.num) AS ConsecutiveNums
FROM
(
    SELECT num,
    LAG(num) OVER (ORDER BY id) AS prev_num,
    LEAD(num) OVER (ORDER BY id) AS next_num
    FROM Logs   
) as T
WHERE T.num=T.prev_num and T.num=T.next_num;