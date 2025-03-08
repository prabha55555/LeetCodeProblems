# Write your MySQL query statement below
select left(trans_date,7)as month,country,count(id)as trans_count,sum(state='approved') as aprroved_count,

sum(amount)as trans_total_amount, sum(state='approved'* amount) as approved_total_amount

from Transcations group by month,country;
