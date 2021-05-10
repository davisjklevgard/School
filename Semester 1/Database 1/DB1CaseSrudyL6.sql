-- UPDATE manifestpassenger SET PassID = PassID - 100 
-- WHERE FlightID > 0 AND PassID > 0; 
-- Only run this query once, otherwise the PassID will be off again.
-- The first PassID should be 10 and the last should be 376, if you order by PassID

-- Query 1
select FlightID, PassID, FirstName, LastName
from ManifestPassenger inner join Passenger using (PassID)
where FlightID = 79
order by LastName;

-- Query 2
select FlightID, PickUpTime, sum(SeatPrice) as TotalSeatPrice, CostPerMile 
from ManifestPassenger inner join FlightReservation using (FlightID)
group by FlightID
order by TotalSeatPrice desc; 

-- Query 3
select FirstName, LastName, FlightID, PickUpTime, SeatPrice
-- I am having problems with this one as the information is spread over three tables and am not sure how to join them together.
from ManifestPassenger inner join Passenger using (PassID) inner join FlightReservation using (FlightID);


-- Query 4
select FlightID, PickUpTime, ActDropOffTime, PackageID, Length, Width, Height, Weight 
from FlightReservation inner join Package using FlightID
where FlightID = 20;



