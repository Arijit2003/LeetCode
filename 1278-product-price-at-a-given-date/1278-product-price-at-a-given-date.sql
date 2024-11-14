# Write your MySQL query statement below
select pp.product_id, COALESCE(tt.new_price,10) as price from
(select product_id from Products group by product_id) as pp
left outer join 
(select p.product_id,p.new_price,p.change_date  
from Products as p inner join
(select product_id,max(change_date) as chdate
from Products where change_date <='2019-08-16'
group by product_id) as t
on p.product_id=t.product_id and p.change_date = t.chdate) as tt
on pp.product_id =tt.product_id ;