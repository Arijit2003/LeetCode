# Write your MySQL query statement below
select p.product_id, ROUND(sum(p.price*COALESCE(u.units,0))/COALESCE(sum(u.units),1),2) as average_price from
Prices as p left outer join UnitsSold as u
on p.product_id=u.product_id and 
u.purchase_date between p.start_date and p.end_date
group by p.product_id;
