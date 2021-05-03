-- Query 1
SELECT ProductName, QuantityPerUnit, ListPrice
FROM product
ORDER BY ProductName;

-- Query 2
SELECT OrderID, CustomerID, OrderDate, RequiredDate
FROM `order`
WHERE ShippedDate IS NULL
ORDER BY OrderDate, RequiredDate;

-- Query 3
SELECT OrderID, (ROUND(SUM(SalePrice) * SUM(Quantity)) - (SUM(SalePrice) * SUM(Discount) / 100)) AS Total
FROM orderDetail
WHERE OrderID = 10360
ORDER BY OrderID;
The fraud prevention team is starting an investigating on a few orders that had claims submitted for them. They need to know the Subtotal for orders 10360, 10436, and 10449.
Show the OrderID and the Subtotal of the order
This information should be obtainable from the orderdetail table
Subtotal include a sum of all the line items for an order
Remember each line item has a price, quantity, and a discount (percentage off of the price). You'll need to create a math formula to calculate the total of the line item that you can use to sum in order to get the entire orders subtotal. A percentage field, if you look at the records in the table, is a decimal number from 0 (0%) to 1 (100%), so 0.75 would be equal to 75%, keep this in mind when developing your formula.
Tip: Work in small steps, get one piece at a time. Look up a simple order, such as orderID 10248, to manually add up to make sure your formula is working.
Sort by the OrderID
Label the query as Query 3
Example of first two records: