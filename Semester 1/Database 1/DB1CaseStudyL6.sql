-- UPDATE manifestpassenger SET PassID = PassID - 100 
-- WHERE FlightID > 0 AND PassID > 0; 
-- Only run this query once, otherwise the PassID will be off again.
-- The first PassID should be 10 and the last should be 376, if you order by PassID

SELECT 
    FlightID, PassID, FirstName, LastName
FROM
    ManifestPassenger
        INNER JOIN
    Passenger USING (PassID)
WHERE
    FlightID = 79
ORDER BY LastName;

-- Query 2
SELECT 
    FlightID,
    PickUpTime,
    SUM(SeatPrice) AS TotalSeatPrice,
    CostPerMile
FROM
    ManifestPassenger
        INNER JOIN
    FlightReservation USING (FlightID)
GROUP BY FlightID
ORDER BY TotalSeatPrice DESC;

-- Query 3
SELECT 
    FirstName, LastName, FlightID, PickUpTime, SeatPrice
FROM
    Passenger
        INNER JOIN
    ManifestPassenger USING (PassID)
        INNER JOIN
    FlightReservation USING (FlightID)
WHERE
    PassID = 118
ORDER BY PickUpTime;


-- Query 4
SELECT 
    FlightID,
    PickUpTime,
    ActDropOffTime,
    PackageID,
    `Length`,
    Width,
    Height,
    Weight
FROM
    FlightReservation
        INNER JOIN
    ManifestPackage USING (FlightID)
        INNER JOIN
    Package USING (PackageID)
WHERE
    FlightID = 20;

-- Query 5
SELECT 
    DroneID, Color, AddedOn, Model, `Description`
FROM
    Model
        LEFT JOIN
    Drone USING (ModelID)
ORDER BY Model;

-- Query 6
SELECT 
    LastName, FirstName, FlightID
FROM
    FlightReservation
        INNER JOIN
    RemotePilot ON FlightReservation.RemotePilotID = RemotePilot.PilotID
ORDER BY LastName , FirstName , FlightID;

-- Query 7
SELECT 
    FlightID,
    PickUpTime,
    EstDropOffTime,
    CostPerMile,
    PickUpLat,
    PickUpLong,
    DropOffLat,
    DropOffLong,
    FlightType.Description AS Type,
    FlightStatus.Description AS Status,
    FirstName,
    LastName
FROM
    FlightReservation
        INNER JOIN
    RemotePilot ON FlightReservation.RemotePilotID = RemotePilot.PilotID
        INNER JOIN
    FlightType USING (TypeID)
        INNER JOIN
    FlightStatus USING (StatusID)
WHERE
    FlightID = 1078;
