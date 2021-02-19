-- EXAMPLES IN THIS SYNTAX OVERVIEW ARE FROM A STORE-DATABASE ABOUT PRODUCTS AND COSTUMERS.

-- Select database
USE sql_store; 

-- Select columns, * means all columns
SELECT *

-- Select specific columns
SELECT first_name, last_name, points

--Create two columns, the original points columns and a points + 10 column.  
SELECT points, points + 10

-- Shows a column with points + 10, but presented with another title.
SELECT points + 10 AS poinst_bonus

-- Filters out all duplicate states. Shows 1 result of each unique state. 
SELECT DISTINCT state

-- Select table from database
FROM order_items

-- Only customers with customer_id = 1 are shown. ..... Other operators can be used like: >, <, >=, <=, !=, %, |
WHERE customer_id = 1

-- Customers born in 1990 or later, and with more than 100 points are shown. 
WHERE birth_date >= 1990-01-01 AND points > 100

-- Customers born in 1990 or later, or with more than 100 points are shown. 
WHERE birth_date >= 1990-01-01 OR points > 100

-- Shorter version of OR. Shows customers from state VA, TX, or, WA.
WHERE state IN ("VA", "TX", "WA")

-- Shows customers but not from VA or TX.
WHERE stat NOT IN ("VA", "TX")

-- Shows customers with points equal to 100 or 300 or all values in between. 
WHERE points BETWEEN 100 AND 300

-- Shows customers with a last name starting with a "b". 
WHERE last_name LIKE "b%"

- Shows customers with a last name ending with a "y".
WHERE last_name LIKE "%y"

-- Shows customers with a last name that contain a "b". 
WHERE last_name LIKE "%b%"

-- Shows customers with a last name with a 3rd letter "t".
WHERE last_name LIKE "__t%"

-- Shows customers with a last name that is not ending with a "y".
WHERE laste_name NOT LIKE "%y"

-- Shows customers with a last name that contain a "b".
WHERE last_name REGEXP "b"

-- Shows customers with a last name that starts with "field".
WHERE last_name REGEXP "^field"

-- Shows customers with a last name that ends with "field".
WHERE last_name REGEXP "field$"

-- Shows customers with a last name that contain "field" or "mac".
WHERE last_name REGEXP "field|mac"

-- Shows customers with a last name that contain "ei", "ui" or "mi".
WHERE last_name REGEXP "[eum]i"

-- Shows customers with a last name that contain "at", "bt" or "ct".
WHERE last_name REGEXP "[a-c]t"

-- Shows customers without a phone number
WHERE phone IS NULL

-- Shows customers with a phone number
WHERE phone IS NOT NULL

-- Orders results by first_name
ORDER BY first_name

-- Orders first_name column from z to a. 
ORDER BY first_name DESC

-- Orders by state first, then on first_name from z to a.
ORDER BY state, first_name DESC

-- Only shows the first 3 records of the table.
LIMIT 3

-- Skips the first 6 records, then it shows record 7, 8, 9.
LIMIT 6, 3

-- Selects 4 columns. customers.customer_id should be defined specifically because the orders table also has a customer_id. 
-- Combines the orders and customers table. Each record should have an equal customer_id from the orders table and the customers table. 
SELECT order_id, customers.customer_id, first_name, last_name
FROM orders
JOIN customers ON orders.customer_id = customers.customer_id