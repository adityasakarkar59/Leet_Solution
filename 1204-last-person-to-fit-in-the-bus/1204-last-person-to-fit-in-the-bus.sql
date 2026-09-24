with temp as(
select person_name ,
    turn,
    sum(weight) over (order by turn) as total_weights
from Queue
)

-- here the temp is and temparary table where all the weights are calulated first and then go for the last person and We use the WITH clause because SQL does not allow you to put a Window Function (like OVER) directly inside a WHERE filter.If you try to write the code like this, SQL will crash and give you an error

select person_name 
from temp
where  total_weights <= 1000
order by total_weights desc
limit  1;