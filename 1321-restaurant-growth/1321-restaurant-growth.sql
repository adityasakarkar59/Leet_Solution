# Write your MySQL query statement below
WITH DailyTotals AS (
    SELECT 
        visited_on, 
        SUM(amount) AS daily_amount
    FROM Customer
    GROUP BY visited_on
)
SELECT 
    t1.visited_on, 
    SUM(t2.daily_amount) AS amount, 
    ROUND(SUM(t2.daily_amount) / 7.0, 2) AS average_amount
FROM DailyTotals t1
JOIN DailyTotals t2 
    ON t2.visited_on <= t1.visited_on 
    AND t2.visited_on >= DATE_SUB(t1.visited_on, INTERVAL 6 DAY)
GROUP BY t1.visited_on
HAVING COUNT(t2.visited_on) = 7
ORDER BY t1.visited_on;