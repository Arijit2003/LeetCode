# Write your MySQL query statement below
SELECT E.employee_id, E.name, 
count(T.employee_id) as reports_count, 
ROUND(AVG(T.age)) as average_age
FROM Employees as E INNER JOIN
(SELECT * FROM Employees WHERE reports_to IS NOT NULL) as T
ON E.employee_id = T.reports_to 
GROUP BY E.employee_id
ORDER BY E.employee_id;