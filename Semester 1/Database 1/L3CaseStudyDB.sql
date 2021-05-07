CREATE DATABASE  IF NOT EXISTS `droneportation` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `droneportation`;
-- MySQL dump 10.13  Distrib 8.0.21, for macos10.15 (x86_64)
--
-- Host: localhost    Database: droneportation
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `AuthorizedCategory`
--

DROP TABLE IF EXISTS `AuthorizedCategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `AuthorizedCategory` (
  `RemotePilotID` int NOT NULL,
  `TypeID` tinyint NOT NULL,
  `AcquiredDate` date DEFAULT NULL,
  `ExpiresDate` date DEFAULT NULL,
  `LicenseDescirption` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`RemotePilotID`,`TypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AuthorizedCategory`
--

LOCK TABLES `AuthorizedCategory` WRITE;
/*!40000 ALTER TABLE `AuthorizedCategory` DISABLE KEYS */;
/*!40000 ALTER TABLE `AuthorizedCategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Drone`
--

DROP TABLE IF EXISTS `Drone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Drone` (
  `DroneID` int NOT NULL,
  `Color` varchar(15) DEFAULT NULL,
  `AddedOn` date DEFAULT NULL,
  `ModelID` tinyint DEFAULT NULL,
  PRIMARY KEY (`DroneID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Drone`
--

LOCK TABLES `Drone` WRITE;
/*!40000 ALTER TABLE `Drone` DISABLE KEYS */;
/*!40000 ALTER TABLE `Drone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FlightReservation`
--

DROP TABLE IF EXISTS `FlightReservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `FlightReservation` (
  `FlightID` int NOT NULL,
  `PickUpTime` datetime DEFAULT NULL,
  `EstDropOffTime` datetime DEFAULT NULL,
  `ActDropOffTime` datetime DEFAULT NULL,
  `CostPerMile` decimal(5,2) DEFAULT NULL,
  `PickUpLat` decimal(9,6) DEFAULT NULL,
  `PickUpLong` decimal(9,6) DEFAULT NULL,
  `DropOffLat` decimal(9,6) DEFAULT NULL,
  `DropOffLong` decimal(9,6) DEFAULT NULL,
  `TypeID` tinyint DEFAULT NULL,
  `StatusID` tinyint DEFAULT NULL,
  `DroneID` smallint DEFAULT NULL,
  `RemotePilotID` smallint DEFAULT NULL,
  PRIMARY KEY (`FlightID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FlightReservation`
--

LOCK TABLES `FlightReservation` WRITE;
/*!40000 ALTER TABLE `FlightReservation` DISABLE KEYS */;
/*!40000 ALTER TABLE `FlightReservation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FlightStatus`
--

DROP TABLE IF EXISTS `FlightStatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `FlightStatus` (
  `StatusID` int NOT NULL,
  `Description` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`StatusID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FlightStatus`
--

LOCK TABLES `FlightStatus` WRITE;
/*!40000 ALTER TABLE `FlightStatus` DISABLE KEYS */;
INSERT INTO `FlightStatus` VALUES (1,'Pending'),(2,'Confirmed'),(3,'Cancelled'),(4,'In Progress'),(5,'Complete');
/*!40000 ALTER TABLE `FlightStatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FlightType`
--

DROP TABLE IF EXISTS `FlightType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `FlightType` (
  `TypeID` int NOT NULL,
  `Description` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`TypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FlightType`
--

LOCK TABLES `FlightType` WRITE;
/*!40000 ALTER TABLE `FlightType` DISABLE KEYS */;
INSERT INTO `FlightType` VALUES (1,'Passenger'),(2,'Package'),(3,'Passenger and Package');
/*!40000 ALTER TABLE `FlightType` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GroupType`
--

DROP TABLE IF EXISTS `GroupType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `GroupType` (
  `GroupTypeID` int NOT NULL,
  `Description` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`GroupTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GroupType`
--

LOCK TABLES `GroupType` WRITE;
/*!40000 ALTER TABLE `GroupType` DISABLE KEYS */;
INSERT INTO `GroupType` VALUES (1,'Family'),(2,'Business');
/*!40000 ALTER TABLE `GroupType` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ManifestPackage`
--

DROP TABLE IF EXISTS `ManifestPackage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ManifestPackage` (
  `FlightID` int NOT NULL,
  `PackageID` int NOT NULL,
  PRIMARY KEY (`FlightID`,`PackageID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ManifestPackage`
--

LOCK TABLES `ManifestPackage` WRITE;
/*!40000 ALTER TABLE `ManifestPackage` DISABLE KEYS */;
/*!40000 ALTER TABLE `ManifestPackage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ManifestPassenger`
--

DROP TABLE IF EXISTS `ManifestPassenger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ManifestPassenger` (
  `FlightID` int NOT NULL,
  `PassID` int NOT NULL,
  `SeatPrice` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`FlightID`,`PassID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ManifestPassenger`
--

LOCK TABLES `ManifestPassenger` WRITE;
/*!40000 ALTER TABLE `ManifestPassenger` DISABLE KEYS */;
/*!40000 ALTER TABLE `ManifestPassenger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Model`
--

DROP TABLE IF EXISTS `Model`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Model` (
  `ModelID` int NOT NULL,
  `Brand` varchar(30) DEFAULT NULL,
  `Description` varchar(60) DEFAULT NULL,
  `Model` varchar(20) DEFAULT NULL,
  `TopSpeed` decimal(6,2) DEFAULT NULL,
  `MaxRange` decimal(6,2) DEFAULT NULL,
  `MaxCargoWeight` decimal(6,2) DEFAULT NULL,
  `MaxSeats` tinyint DEFAULT NULL,
  `TypeID` tinyint DEFAULT NULL,
  PRIMARY KEY (`ModelID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Model`
--

LOCK TABLES `Model` WRITE;
/*!40000 ALTER TABLE `Model` DISABLE KEYS */;
INSERT INTO `Model` VALUES (1,'DJI','Small package delivery drone','Mavic',90.00,100.00,30.00,1,2),(2,'DJI','Short range small package delivery','Spark',120.00,50.00,20.00,1,2),(3,'DJI','Medium package transport','Phantom',100.00,80.00,40.00,1,2),(4,'DJI','Large package transport','Inspire',80.00,120.00,60.00,1,2),(5,'GoPro','High speed small package delivery','Karma',200.00,120.00,30.00,1,2),(6,'GoPro','High speed medium package transport','Hero6',180.00,110.00,40.00,1,2),(7,'Yuneec','6 passenger transport','Typhoon 6X',122.00,250.00,1500.00,6,1),(8,'Yuneec','4 passenger transport','Mantis Q',168.00,300.00,1000.00,4,3),(9,'Yuneec','6 passenger transport, high speed','Typhoon H',168.00,250.00,1500.00,6,1),(10,'Parrot','2 passenger transport','Bebob',186.00,450.00,500.00,2,1),(11,'Parrot','2 passenger, long range','ANAFI',204.00,800.00,500.00,2,1);
/*!40000 ALTER TABLE `Model` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Package`
--

DROP TABLE IF EXISTS `Package`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Package` (
  `PackageID` int NOT NULL,
  `Length` decimal(6,2) DEFAULT NULL,
  `Width` decimal(6,2) DEFAULT NULL,
  `Height` decimal(6,2) DEFAULT NULL,
  `Weight` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`PackageID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Package`
--

LOCK TABLES `Package` WRITE;
/*!40000 ALTER TABLE `Package` DISABLE KEYS */;
/*!40000 ALTER TABLE `Package` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Passenger`
--

DROP TABLE IF EXISTS `Passenger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Passenger` (
  `PassID` int NOT NULL,
  `FirstName` varchar(25) DEFAULT NULL,
  `LastName` varchar(25) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `City` varchar(40) DEFAULT NULL,
  `State` varchar(25) DEFAULT NULL,
  `Country` varchar(40) DEFAULT NULL,
  `RegionCode` varchar(10) DEFAULT NULL,
  `LocationLat` decimal(9,6) DEFAULT NULL,
  `LocationLong` decimal(9,6) DEFAULT NULL,
  PRIMARY KEY (`PassID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Passenger`
--

LOCK TABLES `Passenger` WRITE;
/*!40000 ALTER TABLE `Passenger` DISABLE KEYS */;
/*!40000 ALTER TABLE `Passenger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PassGroup`
--

DROP TABLE IF EXISTS `PassGroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PassGroup` (
  `GroupID` int NOT NULL,
  `Nickname` varchar(40) DEFAULT NULL,
  `Description` varchar(150) DEFAULT NULL,
  `OwnerID` int DEFAULT NULL,
  `GroupTypeID` tinyint DEFAULT NULL,
  PRIMARY KEY (`GroupID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PassGroup`
--

LOCK TABLES `PassGroup` WRITE;
/*!40000 ALTER TABLE `PassGroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `PassGroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PassGroupMember`
--

DROP TABLE IF EXISTS `PassGroupMember`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PassGroupMember` (
  `PassID` int NOT NULL,
  `GroupID` int NOT NULL,
  PRIMARY KEY (`PassID`,`GroupID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PassGroupMember`
--

LOCK TABLES `PassGroupMember` WRITE;
/*!40000 ALTER TABLE `PassGroupMember` DISABLE KEYS */;
/*!40000 ALTER TABLE `PassGroupMember` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RemotePilot`
--

DROP TABLE IF EXISTS `RemotePilot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `RemotePilot` (
  `PilotID` int NOT NULL,
  `FirstName` varchar(25) DEFAULT NULL,
  `LastName` varchar(25) DEFAULT NULL,
  `Salary` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`PilotID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RemotePilot`
--

LOCK TABLES `RemotePilot` WRITE;
/*!40000 ALTER TABLE `RemotePilot` DISABLE KEYS */;
/*!40000 ALTER TABLE `RemotePilot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'droneportation'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-19 22:15:30
