# Write your MySQL query statement below
SELECT S.product_id,S.year as first_year, S.quantity,S.price
FROM  Sales as S
INNER JOIN 
(SELECT product_id,min(year) as first_year 
FROM Sales GROUP BY product_id) as T
ON S.product_id=T.product_id AND S.year=T.first_year;
