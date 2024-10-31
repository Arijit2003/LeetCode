WITH FirstLogin as (
    select player_id,min(event_date) as event_date
    from Activity 
    group by player_id
),

ConsecutiveLogin as (
    select a.player_id 
    from Activity as a inner join FirstLogin as f
    on a.player_id=f.player_id
    where a.event_date=DATE_ADD(f.event_date, INTERVAL 1 DAY)
)

select ROUND((count(distinct(cl.player_id))/count(fl.player_id)),2) as fraction
from FirstLogin as fl left outer join ConsecutiveLogin as cl
on fl.player_id=cl.player_id;