SELECT column_name(s)
FROM table_name
WHERE filter_condition
GROUP BY group_by_column_or_expression
HAVING group_filter_condition;

SELECT Department, SUM(orderTotal) as Total
FROM orders
GROUP BY Department
HAVING Total > 2000;
