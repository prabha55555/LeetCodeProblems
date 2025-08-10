# Write your MySQL query statement below

with cte as(select *,
case
  when id  % 2=0 and id!=(select min(id)from Seat)then id-1
  when id % 2 =1 and id!=(select max(id)from Seat)then  id+1
  else id

  end as _id

  from Seat 

  
)

select _id as id,student from cte order by id;