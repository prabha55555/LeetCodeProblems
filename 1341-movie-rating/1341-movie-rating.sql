# Write your MySQL query statement below

-- with as cte(
--     select *, count(user_id) as max count from MovingRatings group by user_id ;
-- )
-- with as cte2(
--     select *, avg(rating) as average from MovingRatings group by movie_id, ;
-- )

-- with  cte as (
--     select *, 
--      max(user_id) over (partition by user_id order by user_id ) as max limit 1,
--      avg(rating) over (partition by movie_id ) as aver from MovieRating limit 1
--      )


-- select u.name, m.title from Users u join Movies m where u.name = max and m.title = aver

# Write your MySQL query statement below
(SELECT name AS results
FROM MovieRating JOIN Users USING(user_id)
GROUP BY name
ORDER BY COUNT(*) DESC, name
LIMIT 1)

UNION ALL

(SELECT title AS results
FROM MovieRating JOIN Movies USING(movie_id)
WHERE EXTRACT(YEAR_MONTH FROM created_at) = 202002
GROUP BY title
ORDER BY AVG(rating) DESC, title
LIMIT 1);
