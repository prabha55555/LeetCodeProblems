with  CTE as (select *,sum(weight) over(order by turn ) as cum_sum from Queue)
select person_name from CTE where cum_sum<=1000 order by cum_sum desc limit 1;