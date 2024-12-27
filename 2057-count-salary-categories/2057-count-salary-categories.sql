# Write your MySQL query statement below
-- select 'Low Salary' as category, 
-- sum(case when income<20000 then 1 else 0 end) as accounts_count from Accounts
-- union all 
-- select 'Average Salary' as category, 
-- sum(case when income>=20000 and income<=50000 then 1 else 0 end) as accounts_count from Accounts
-- union all
-- select 'High Salary' as category, 
-- sum(case when income>50000 then 1 else 0 end) as accounts_count from Accounts;
with salary_account as 
(select
    case 
        when income<20000 then 'Low Salary'
        when income between 20000 and 50000 then 'Average Salary'
        when income>50000 then 'High Salary'
    end as category,
    count(*) as accounts_count
from Accounts
group by category)

select c.category, COALESCE(sc.accounts_count,0) as  accounts_count
from (
    select 'Low Salary' as category
    union all
    select 'Average Salary' as category
    union all
    select 'High Salary' as category
) as c left join salary_account as sc
on c.category=sc.category