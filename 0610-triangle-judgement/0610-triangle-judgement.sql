# Write your MySQL query statement below
SELECT t.x,t.y,t.z,
IF(t.acmin>0 and t.scmin>0 and t.gt>0 and t.acmin+t.scmin>t.gt, 'Yes','No') as triangle 
FROM
(SELECT x,y,z,LEAST(x,y,z) as acmin,GREATEST(x,y,z) as gt,
CASE 
    WHEN x=LEAST(x,y,z) THEN LEAST(y,z)
    WHEN y=LEAST(x,y,z) THEN LEAST(x,z)
    ELSE LEAST(x,y)
END AS scmin
FROM Triangle) as t;