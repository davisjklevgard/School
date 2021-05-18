-- Query 1
SELECT 
    LastName, FirstName, COUNT(RemotePilotID) AS NumFlights
FROM
    RemotePilot
        INNER JOIN
    FlightReservation ON FlightReservation.RemotePilotID = RemotePilot.PilotID
GROUP BY PilotID
ORDER BY LastName;

-- Query 2
SELECT 
    `Description`, COUNT(TypeID) AS NumFlights
FROM
    FlightType
        INNER JOIN
    FlightReservation USING (TypeID)
GROUP BY `Description`
ORDER BY NumFlights;

-- Query 3
SELECT 
    DroneID, Brand, Model, COUNT(DroneID) AS NumFlights
FROM
    Drone
        INNER JOIN
    Model USING (ModelID)
        INNER JOIN
    FlightReservation USING (DroneID)
GROUP BY DroneID
ORDER BY Brand , Model , NumFlights;

-- Query 4
SELECT 
    GroupID, Nickname, `Description`, FirstName, LastName
FROM
    PassGroup
        INNER JOIN
    PassGroupMember USING (GroupID)
        INNER JOIN
    Passenger USING (PassID)
WHERE
    GroupID = 92
ORDER BY LastName;

-- Query 5
SELECT 
    GroupType.Description, COUNT(GroupTypeID) AS TotalMembers
FROM
    PassGroup
        INNER JOIN
    PassGroupMember USING (GroupID)
        INNER JOIN
    GroupType USING (GroupTypeID)
GROUP BY GroupTypeID;


