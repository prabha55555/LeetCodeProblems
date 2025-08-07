-- SELECT DISTINCT l1.num AS ConsecutiveNums
-- FROM Logs l1, Logs l2, Logs l3
-- WHERE l1.num = l2.num
--   AND l2.num = l3.num
--   AND l1.id = l2.id - 1
--   AND l2.id = l3.id - 1;


select a.num as ConsecutiveNums from Logs a
join Logs b on a.id=b.id+1 and a.num=b.num
join Logs c on b.id=c.id+1 and b.num=c.num;