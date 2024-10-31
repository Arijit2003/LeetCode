# Write your MySQL query statement below
SELECT t.teacher_id, count(*) as cnt
FROM
(SELECT teacher_id,subject_id
FROM Teacher
GROUP BY teacher_id, subject_id) as t
GROUP BY t.teacher_id;