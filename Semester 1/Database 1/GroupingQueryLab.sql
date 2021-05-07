-- Query 1
SELECT 
    ProductName, QuantityPerUnit, ListPrice
FROM
    product
ORDER BY ProductName;

-- Query 2
SELECT 
    OrderID, CustomerID, OrderDate, RequiredDate
FROM
    `order`
WHERE
    ShippedDate IS NULL
ORDER BY OrderDate , RequiredDate;

-- Query 3
SELECT 
    OrderID,
    ROUND((SUM(SalePrice) * SUM(Quantity)) - (SUM(SalePrice) * SUM(Discount) / 100),
            2) AS Total
FROM
    orderDetail
WHERE
    OrderID IN (10360 , 10436, 10449)
GROUP BY OrderID
ORDER BY OrderID;

-- Query 4
SELECT 
    ProductID,
    ProductName,
    QuantityPerUnit,
    SupplierID,
    CategoryID,
    ListPrice,
    UnitCost,
    UnitsInStock,
    UnitsOnReorder,
    ReorderLevel,
    Discontinued
FROM
    product
WHERE
    QuantityPerUnit LIKE '%500%'
GROUP BY ProductID
ORDER BY ProductID;

-- Query 5
SELECT 
    Country, COUNT(ContactName) AS NumCustomers
FROM
    customer
GROUP BY Country
ORDER BY NumCustomers DESC;

-- Query 6
SELECT 
    CustomerID, COUNT(CustomerID) AS NumOrders
FROM
    `order`
GROUP BY CustomerID
ORDER BY NumOrders DESC;

-- Query 7
SELECT 
    OrderID,
    CustomerID,
    EmployeeID,
    OrderDate,
    RequiredDate,
    ShippedDate,
    ShipVia,
    Freight,
    ShipName,
    ShipAddress,
    ShipCity,
    ShipPostalCode,
    ShipCountry
FROM
    `order`
WHERE
    OrderID IN (10360 , 10436, 10449)
GROUP BY OrderID
ORDER BY OrderID;

-- Query 8
SELECT 
    DATEDIFF(ShippedDate, RequiredDate) AS DaysLate,
    COUNT(DATEDIFF(ShippedDate, RequiredDate)) AS NumOrders
FROM
    `order`
GROUP BY DaysLate
ORDER BY DaysLate DESC;

-- Query 9
SELECT 
    CategoryID, ROUND(AVG(ListPrice - UnitCost), 2) AS AvgProfit
FROM
    product
GROUP BY CategoryID
HAVING AvgProfit > 10
ORDER BY CategoryID;





