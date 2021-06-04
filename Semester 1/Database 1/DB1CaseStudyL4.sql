-- Query 1
SELECT 
    ModelID, Brand, Model, TopSpeed
FROM
    Model
ORDER BY TopSpeed DESC;

-- Query 2
SELECT 
    AVG(Salary) AS AvgSalary
FROM
    RemotePilot;

-- Query 3
SELECT 
    PassID, FirstName, LastName
FROM
    Passenger
WHERE
    State = 'MI'
ORDER BY LastName , FirstName;

-- Query 4
SELECT 
    ModelID, Brand, Model
FROM
    Model
WHERE
    TypeID = 2
ORDER BY Brand , Model;

-- Query 5
SELECT 
    COUNT(PickUpTime) AS NumFlights
FROM
    FlightReservation
WHERE
    PickUpTime LIKE '2019%';

-- Query 6
SELECT 
    FlightID, TypeID, PickUpTime
FROM
    FlightReservation
WHERE
    PickUpTime LIKE '2020%' AND StatusID = 3
ORDER BY TypeID , PickUpTime;

-- Query 6
SELECT 
    FlightID,
    ActDropOffTime,
    EstDropOffTime,
    TIMEDIFF(ActDropOffTime, EstDropOffTime) AS TimeDifference
FROM
    FlightReservation
WHERE
    PickUpTime LIKE '2020%' AND StatusID = 5
ORDER BY TimeDifference DESC;




