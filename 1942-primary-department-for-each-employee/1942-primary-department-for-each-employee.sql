# Write your MySQL query statement below
SELECT E.employee_id,
COALESCE(T.department_id, E.department_id) AS department_id 
FROM
(SELECT * FROM Employee
GROUP BY employee_id) AS E
LEFT OUTER JOIN
(SELECT * FROM Employee 
WHERE primary_flag ='Y') AS T
ON E.employee_id = T.employee_id;