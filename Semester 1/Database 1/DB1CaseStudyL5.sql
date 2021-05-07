-- Query 1
SELECT 
    DroneID, AVG(CostPerMile) AS AvgCostPerMile
FROM
    FlightReservation
WHERE
    StatusID = 5
GROUP BY DroneID
ORDER BY AvgCostPerMile;

-- Query 2
SELECT 
    FlightID, MAX(DropOffLat) AS DropOffLat
FROM
    FlightReservation
GROUP BY FlightID
ORDER BY DropOffLat DESC
LIMIT 3;

-- Query 3
SELECT 
    State, COUNT(PassId) AS NumPassengers
FROM
    Passenger
GROUP BY State
ORDER BY State;

-- Query 4
SELECT 
    MIN(TopSpeed) AS SlowestSpeed,
    AVG(TopSpeed) AS AvgSpeed,
    MAX(TopSpeed) FastestSpeed
FROM
    Model
WHERE
    TypeID = 1;

-- Query 5
SELECT 
    FlightID, COUNT(PassID) AS NumPassengers
FROM
    ManifestPassenger
GROUP BY FlightID
ORDER BY NumPassengers DESC;
