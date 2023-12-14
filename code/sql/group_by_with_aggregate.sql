SELECT Department, SUM(orderTotal)
FROM orders
GROUP BY Department;
SELECT Department, AVG(orderTotal)
FROM orders
GROUP BY Department;
