CREATE DATABASE  IF NOT EXISTS `PetStore` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `PetStore`;
-- MySQL dump 10.13  Distrib 8.0.21, for macos10.15 (x86_64)
--
-- Host: localhost    Database: PetStore
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
-- Table structure for table `Pets`
--

DROP TABLE IF EXISTS `Pets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Pets` (
  `PetID` int unsigned NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) DEFAULT NULL,
  `DOB` date DEFAULT NULL COMMENT 'Date of Birth',
  `Price` decimal(5,2) DEFAULT NULL,
  `Type` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`PetID`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='This table will hold pet information\n';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Pets`
--

LOCK TABLES `Pets` WRITE;
/*!40000 ALTER TABLE `Pets` DISABLE KEYS */;
INSERT INTO `Pets` VALUES (1,'Mogy','2017-08-17',400.00,'Dog'),(2,'Harper','2016-07-12',600.00,'Dog'),(3,'Meeka','2020-04-12',299.99,'Bird'),(4,'Bob','2006-02-21',89.50,'Fish'),(5,'Amethyst','2018-04-11',219.06,'Dog'),(6,'Cedric','2018-02-07',204.47,'Animal'),(7,'Alea','2018-05-30',119.15,'Animal'),(8,'Keaton','2019-01-18',116.25,'Animal'),(9,'Lillith','2018-10-03',282.35,'Animal'),(10,'Troy','2018-10-14',189.61,'Animal'),(11,'Sydnee','2018-12-26',204.03,'Cat'),(12,'Emerald','2019-08-28',265.38,'Animal'),(13,'Forrest','2019-02-08',188.77,'Animal'),(14,'Honorato','2019-07-31',196.42,'Hamster'),(15,'Halee','2018-06-29',17.83,'Cat'),(16,'Martin','2019-07-09',98.85,'Animal'),(17,'Eaton','2018-12-27',90.92,'Hamster'),(18,'Cain','2019-06-19',251.01,'Animal'),(19,'Neil','2019-05-10',235.59,'Bird'),(20,'Daryl','2018-12-08',299.53,'Cat'),(21,'Kalia','2019-06-10',282.14,'Animal'),(22,'Oren','2018-09-08',148.27,'Animal'),(23,'Coby','2019-05-04',142.62,'Hamster'),(24,'Rashad','2019-10-21',155.42,'Hamster'),(25,'Isadora','2018-09-25',54.62,'Hamster'),(26,'Honorato','2019-04-28',175.89,'Bird'),(27,'Grant','2019-10-30',109.08,'Animal'),(28,'Kylee','2018-02-25',12.01,'Animal'),(29,'Lillian','2019-10-21',207.13,'Cat'),(30,'Malik','2018-12-15',56.11,'Animal'),(31,'Lael','2017-12-22',289.69,'Bird'),(32,'Karyn','2019-04-02',107.62,'Hamster'),(33,'Mara','2018-10-14',123.32,'Hamster'),(34,'Seth','2018-09-10',63.52,'Hamster'),(35,'Jessica','2018-02-14',267.27,'Animal'),(36,'Demetrius','2018-09-13',247.09,'Bird'),(37,'Chandler','2018-03-10',277.95,'Animal'),(38,'Peter','2017-11-15',210.74,'Animal'),(39,'Leo','2019-03-12',40.88,'Animal'),(40,'Fiona','2018-08-24',18.49,'Bird'),(41,'Griffith','2019-08-14',276.26,'Dog'),(42,'Miriam','2017-12-17',203.61,'Animal'),(43,'Kim','2018-09-26',47.25,'Animal'),(44,'Abel','2019-02-24',143.09,'Bird'),(45,'Channing','2018-12-27',215.27,'Animal'),(46,'Mufutau','2019-06-16',190.18,'Animal'),(47,'Stacy','2019-04-06',34.87,'Animal'),(48,'Chava','2018-06-05',230.39,'Bird'),(49,'Rhea','2017-12-15',221.60,'Animal'),(50,'Francis','2018-04-10',292.32,'Hamster'),(51,'Quintessa','2018-06-05',132.43,'Cat'),(52,'Dylan','2017-11-23',30.14,'Animal'),(53,'Uta','2018-09-24',59.80,'Animal'),(54,'Georgia','2018-05-18',87.62,'Hamster'),(55,'Meredith','2019-06-14',226.13,'Cat'),(56,'Briar','2018-10-26',175.94,'Animal'),(57,'Summer','2018-09-05',204.32,'Hamster'),(58,'Haley','2018-09-13',11.96,'Dog'),(59,'Xenos','2019-11-07',272.32,'Hamster'),(60,'Carly','2018-10-04',35.55,'Animal'),(61,'George','2019-09-06',194.54,'Animal'),(62,'Ila','2019-04-03',270.09,'Bird'),(63,'Nash','2018-05-31',40.12,'Hamster'),(64,'Isaac','2018-06-16',174.28,'Animal'),(65,'Demetrius','2019-05-10',272.26,'Dog'),(66,'Malik','2019-04-12',298.48,'Animal'),(67,'Kadeem','2019-07-12',163.73,'Cat'),(68,'Nomlanga','2019-02-04',152.53,'Cat'),(69,'Sloane','2019-02-22',180.67,'Animal'),(70,'Whitney','2019-08-25',218.12,'Hamster'),(71,'Brennan','2019-07-18',145.33,'Cat'),(72,'Dominique','2018-12-29',282.53,'Cat'),(73,'Xavier','2018-10-17',250.76,'Dog'),(74,'Jackson','2018-11-19',40.82,'Hamster'),(75,'Alika','2017-12-06',10.94,'Animal'),(76,'Rosalyn','2019-04-05',48.47,'Animal'),(77,'Chastity','2017-12-20',95.69,'Bird'),(78,'Abel','2019-10-26',169.35,'Animal'),(79,'Lillith','2018-06-15',224.04,'Animal'),(80,'Shelby','2019-08-09',192.40,'Animal'),(81,'Jin','2018-09-02',237.60,'Animal'),(82,'Fay','2018-01-05',274.59,'Bird'),(83,'Alfonso','2019-08-10',150.85,'Animal'),(84,'Noel','2018-01-22',156.84,'Animal'),(85,'Remedios','2017-12-10',297.92,'Hamster'),(86,'Chiquita','2018-07-30',137.99,'Bird'),(87,'Kimberly','2018-05-05',111.06,'Dog'),(88,'Gray','2019-08-02',170.66,'Dog'),(89,'Clark','2019-01-24',97.75,'Animal'),(90,'Colby','2018-11-08',224.60,'Animal'),(91,'Samson','2017-12-04',161.85,'Animal'),(92,'Emily','2018-12-22',159.91,'Animal'),(93,'Irene','2019-02-04',48.49,'Bird'),(94,'Holmes','2019-07-09',215.61,'Animal'),(95,'Valentine','2017-11-14',119.72,'Hamster'),(96,'Amelia','2018-05-04',47.30,'Animal'),(97,'Genevieve','2018-07-24',135.01,'Animal'),(98,'Josephine','2019-10-01',70.39,'Bird'),(99,'Chanda','2019-07-17',151.65,'Animal'),(100,'September','2017-11-29',68.56,'Animal'),(101,'Roth','2018-04-11',180.59,'Animal'),(102,'Charlotte','2018-07-07',180.30,'Animal'),(103,'Jamalia','2019-05-19',18.28,'Animal'),(104,'Amy','2019-03-11',19.16,'Dog');
/*!40000 ALTER TABLE `Pets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'PetStore'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-16 22:37:48
