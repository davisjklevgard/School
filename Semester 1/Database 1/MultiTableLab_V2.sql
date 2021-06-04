-- Query 1
SELECT 
    CompanyName, COUNT(CustomerID) AS NumOrders
FROM
    customer
        INNER JOIN
    `order` USING (CustomerID)
GROUP BY CustomerID
ORDER BY NumOrders DESC;

-- Query 2
SELECT 
    ProductName,
    ROUND(SUM(SalePrice * Quantity * (1 - Discount)),
            2) AS TotalSales
FROM
    product
        INNER JOIN
    orderDetail USING (ProductID)
GROUP BY ProductID
ORDER BY TotalSales DESC;

-- Query 3
SELECT 
    CategoryName,
    ROUND(SUM(SalePrice * Quantity * (1 - Discount)),
            2) AS TotalSales
FROM
    category
        INNER JOIN
    product USING (CategoryID)
        INNER JOIN
    orderDetail USING (ProductID)
GROUP BY CategoryID
ORDER BY TotalSales DESC;

-- Query 4
SELECT 
    FirstName,
    LastName,
    COUNT(DISTINCT OrderID) AS NumOrders,
    ROUND(SUM(SalePrice * Quantity * (1 - Discount)),
            2) AS TotalSales
FROM
    employee
        INNER JOIN
    `order` USING (EmployeeID)
        INNER JOIN
    orderDetail USING (OrderID)
WHERE
    Title = 'Sales Representative'
GROUP BY EmployeeID
ORDER BY TotalSales DESC;

-- Query 5
SELECT 
    ProductName,
    COUNT(ProductID) AS TimesOrdered,
    SUM(Quantity) AS TotalOrdered
FROM
    product
        LEFT JOIN
    orderDetail USING (ProductID)
GROUP BY ProductID
ORDER BY TimesOrdered DESC;

-- Query 6
SELECT 
    ProductName,
    ListPrice,
    AVG(SalePrice) AS AvgSalePrice,
    (AVG(SalePrice) - ListPrice) AS DiffInPrice
FROM
    product
        INNER JOIN
    orderDetail USING (ProductID)
GROUP BY ProductID
ORDER BY DiffInPrice;


 