-- Query 1
SELECT 
    FirstName, LastName, HomePhone
FROM
    employee
ORDER BY FirstName;

-- Query 2
SELECT 
    CompanyName, Country, City
FROM
    supplier
ORDER BY Country , City , CompanyName;

-- Query 3
SELECT 
    FirstName, LastName, BirthDate
FROM
    employee
ORDER BY BirthDate;

-- Query 4
SELECT 
    ProductName, ListPrice - UnitCost AS Profit
FROM
    product
ORDER BY ProductName;

-- Query 5
SELECT 
    DATEDIFF(ShippedDate, OrderDate) AS LeadTimeDays
FROM
    northwind.order; 




