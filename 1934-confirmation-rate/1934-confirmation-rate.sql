select s1.user_id , round( ifnull(avg(c.action='confirmed'),0 ),2) as confirmation_rate from Signups s1 left join Confirmations c on 

s1.user_id = c.user_id group by s1.user_id;