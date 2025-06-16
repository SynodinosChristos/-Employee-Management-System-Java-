CREATE DATABASE  IF NOT EXISTS `employees` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `employees`;
-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: employees
-- ------------------------------------------------------
-- Server version	8.0.40

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
-- Table structure for table `authorizedusers`
--

DROP TABLE IF EXISTS `authorizedusers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `authorizedusers` (
  `UserID` int NOT NULL AUTO_INCREMENT,
  `EmployeeID` int DEFAULT NULL,
  `UserName` varchar(50) DEFAULT NULL,
  `Password` binary(60) DEFAULT NULL,
  PRIMARY KEY (`UserID`),
  UNIQUE KEY `UserID_UNIQUE` (`UserID`),
  UNIQUE KEY `UserName_UNIQUE` (`UserName`),
  KEY `EmployeeID_frk_idx` (`EmployeeID`),
  CONSTRAINT `EmployeeID_frk` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authorizedusers`
--

LOCK TABLES `authorizedusers` WRITE;
/*!40000 ALTER TABLE `authorizedusers` DISABLE KEYS */;
INSERT INTO `authorizedusers` VALUES (1,1,'executioner45',_binary 'exe54986094856\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(2,2,'xorio900',_binary '[B@3651f87b\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(3,3,'zaxar8902',_binary 'zax38569047846\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(4,2,'xorio',_binary 'q170564Qwm!\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0');
/*!40000 ALTER TABLE `authorizedusers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employeephones`
--

DROP TABLE IF EXISTS `employeephones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employeephones` (
  `PhoneID` int NOT NULL AUTO_INCREMENT,
  `EmployeeID` int DEFAULT NULL,
  `PhoneNumber` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`PhoneID`),
  UNIQUE KEY `PhoneID_UNIQUE` (`PhoneID`),
  UNIQUE KEY `PhoneNumber_UNIQUE` (`PhoneNumber`),
  KEY `EmployeeID_idx` (`EmployeeID`),
  CONSTRAINT `EmployeeID` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employeephones`
--

LOCK TABLES `employeephones` WRITE;
/*!40000 ALTER TABLE `employeephones` DISABLE KEYS */;
INSERT INTO `employeephones` VALUES (1,1,'69797894561'),(2,1,'69715320486'),(3,2,'69412834000'),(4,3,'6982154687'),(5,3,'69824863284'),(12,1,'6971658653'),(13,2,'697166853');
/*!40000 ALTER TABLE `employeephones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `EmployeeID` int NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(50) DEFAULT NULL,
  `LastName` varchar(50) DEFAULT NULL,
  `FatherName` varchar(50) DEFAULT NULL,
  `MotherName` varchar(50) DEFAULT NULL,
  `AFM` varchar(9) DEFAULT NULL,
  `AMKA` varchar(11) DEFAULT NULL,
  `Address` text,
  `MaritalStatus` enum('Έγγαμος','Άγαμος') DEFAULT NULL,
  `ChildrenCount` int DEFAULT NULL,
  `EducationalLevel` varchar(100) DEFAULT NULL,
  `SalaryType` enum('Ωρομίσθιος','Ημερομίσθιος','Μηνιάτικο') DEFAULT NULL,
  `Email1` varchar(100) DEFAULT NULL,
  `Email2` varchar(100) DEFAULT NULL,
  `Position` varchar(100) DEFAULT NULL,
  `Department` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`EmployeeID`),
  UNIQUE KEY `EmployeeID_UNIQUE` (`EmployeeID`),
  UNIQUE KEY `AFM_UNIQUE` (`AFM`),
  UNIQUE KEY `AMKA_UNIQUE` (`AMKA`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'Ανδρέας','Ανδρεόπουλος','Μάκης','Ευτυχία','263489710','956472301κρ','Κανελλοπούλου 20','Άγαμος',1,'Δευτεροβάθμια Εκπαίδευση','Μηνιάτικο','','','Επιστάτης','Καθαρισμού'),(2,'Γιάννης','Γιαννάκης','Γιάννης','Καίτη','024865729','364856102αμ','Βάρη 50','Έγγαμος',2,'Πρωτοβάθμια Εκπαίδευση','Ωρομίσθιος','','','Πωλητής','Κυλικείο'),(3,'Ζαχαρίας','Ζαχαριάδης','Αγαμέμνων','Ελένη','654821038','64897230κρ','Χαριλάου Τρικόυπη 6','Έγγαμος',1,'Ακαδημαϊκή Εκπαίδευση','Μηνιάτικο','zaxarias@gmail.com','','Διευθυντής','Τμήμα Πωλήσεων');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employeestatus`
--

DROP TABLE IF EXISTS `employeestatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employeestatus` (
  `StatusID` int NOT NULL AUTO_INCREMENT,
  `EmployeeID` int DEFAULT NULL,
  `HireDate` date DEFAULT NULL,
  `TerminationDate` date DEFAULT NULL,
  PRIMARY KEY (`StatusID`),
  UNIQUE KEY `StatusID_UNIQUE` (`StatusID`),
  KEY `EmployeeID_idx` (`EmployeeID`),
  CONSTRAINT `EmployeeID_` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employeestatus`
--

LOCK TABLES `employeestatus` WRITE;
/*!40000 ALTER TABLE `employeestatus` DISABLE KEYS */;
INSERT INTO `employeestatus` VALUES (1,1,'2024-02-24','2025-02-24'),(2,2,'2025-03-20','2025-03-30'),(3,3,'2020-01-15','2023-01-15'),(4,3,'2023-01-16','2025-03-10'),(5,1,'2024-12-15','2025-01-27');
/*!40000 ALTER TABLE `employeestatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leavedays`
--

DROP TABLE IF EXISTS `leavedays`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leavedays` (
  `LeaveID` int NOT NULL AUTO_INCREMENT,
  `EmployeeID` int DEFAULT NULL,
  `LeaveDays` int DEFAULT NULL,
  `Year` int DEFAULT NULL,
  `LeaveDate` date DEFAULT NULL,
  PRIMARY KEY (`LeaveID`),
  UNIQUE KEY `LeaveID_UNIQUE` (`LeaveID`),
  KEY `EmployeeID_f_idx` (`EmployeeID`),
  CONSTRAINT `EmployeeID_f` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leavedays`
--

LOCK TABLES `leavedays` WRITE;
/*!40000 ALTER TABLE `leavedays` DISABLE KEYS */;
INSERT INTO `leavedays` VALUES (4,3,3,2025,'2025-05-15'),(5,3,5,2025,'2025-06-03'),(6,1,1,2025,'2025-05-02'),(7,1,2,2025,'2025-06-18'),(8,2,1,2025,'2025-05-22'),(9,2,1,2025,'2025-06-30');
/*!40000 ALTER TABLE `leavedays` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salary` (
  `SalaryID` int NOT NULL AUTO_INCREMENT,
  `EmployeeID` int DEFAULT NULL,
  `Year` int DEFAULT NULL,
  `Month` int DEFAULT NULL,
  `Salary` decimal(6,2) DEFAULT NULL,
  `LeaveDays` int DEFAULT NULL,
  `SickDays` int DEFAULT NULL,
  `AbsenceDays` int DEFAULT NULL,
  PRIMARY KEY (`SalaryID`),
  KEY `EmployeeID_fk_idx` (`EmployeeID`),
  CONSTRAINT `EmployeeID_fok` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=145 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
INSERT INTO `salary` VALUES (139,1,2025,5,920.00,1,2,2),(140,2,2025,5,390.00,1,1,1),(141,3,2025,5,1320.00,3,2,3),(142,1,2025,6,1000.00,2,3,0),(143,2,2025,6,525.00,1,0,0),(144,3,2025,6,1140.00,5,0,6);
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salaryhistory`
--

DROP TABLE IF EXISTS `salaryhistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salaryhistory` (
  `SalaryID` int NOT NULL AUTO_INCREMENT,
  `EmployeeID` int DEFAULT NULL,
  `Salary` decimal(6,2) DEFAULT NULL,
  `EffectiveDate` date DEFAULT NULL,
  PRIMARY KEY (`SalaryID`),
  UNIQUE KEY `SalaryID_UNIQUE` (`SalaryID`),
  KEY `EmployeeID-_idx` (`EmployeeID`),
  CONSTRAINT `EmployeeID-` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salaryhistory`
--

LOCK TABLES `salaryhistory` WRITE;
/*!40000 ALTER TABLE `salaryhistory` DISABLE KEYS */;
INSERT INTO `salaryhistory` VALUES (1,1,1000.00,'2025-05-01'),(2,2,10.00,'2025-05-01'),(3,3,1500.00,'2025-05-01'),(9,2,15.00,'2025-05-15');
/*!40000 ALTER TABLE `salaryhistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sickdays`
--

DROP TABLE IF EXISTS `sickdays`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sickdays` (
  `SickID` int NOT NULL AUTO_INCREMENT,
  `EmployeeID` int DEFAULT NULL,
  `SickDays` int DEFAULT NULL,
  `Year` int DEFAULT NULL,
  `SickDate` date DEFAULT NULL,
  PRIMARY KEY (`SickID`),
  UNIQUE KEY `SickID_UNIQUE` (`SickID`),
  KEY `EmployeeID_fk_idx` (`EmployeeID`),
  CONSTRAINT `EmployeeID_fk` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sickdays`
--

LOCK TABLES `sickdays` WRITE;
/*!40000 ALTER TABLE `sickdays` DISABLE KEYS */;
INSERT INTO `sickdays` VALUES (4,1,2,2025,'2025-05-08'),(5,1,3,2025,'2025-06-16'),(6,2,1,2025,'2025-05-05'),(7,2,1,2025,'2025-05-16'),(8,3,5,2025,'2025-05-28'),(9,3,2,2025,'2025-05-24');
/*!40000 ALTER TABLE `sickdays` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unpaidabsences`
--

DROP TABLE IF EXISTS `unpaidabsences`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unpaidabsences` (
  `AbsenceID` int NOT NULL AUTO_INCREMENT,
  `EmployeeID` int DEFAULT NULL,
  `AbsenceDays` int DEFAULT NULL,
  `Year` int DEFAULT NULL,
  `AbsenceDate` date DEFAULT NULL,
  PRIMARY KEY (`AbsenceID`),
  KEY `EmployeeID-f_idx` (`EmployeeID`),
  CONSTRAINT `EmployeeID-f` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unpaidabsences`
--

LOCK TABLES `unpaidabsences` WRITE;
/*!40000 ALTER TABLE `unpaidabsences` DISABLE KEYS */;
INSERT INTO `unpaidabsences` VALUES (4,3,3,2025,'2025-05-19'),(5,3,6,2025,'2025-06-03'),(6,1,2,2025,'2025-05-16'),(10,2,1,2025,'2025-05-22');
/*!40000 ALTER TABLE `unpaidabsences` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workhours`
--

DROP TABLE IF EXISTS `workhours`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `workhours` (
  `WorkHourID` int NOT NULL AUTO_INCREMENT,
  `EmployeeID` int DEFAULT NULL,
  `WorkDate` date DEFAULT NULL,
  `HoursWorked` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`WorkHourID`),
  UNIQUE KEY `WorkHourID_UNIQUE` (`WorkHourID`),
  KEY `EmployeeID-fk_idx` (`EmployeeID`),
  CONSTRAINT `EmployeeID-fk` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workhours`
--

LOCK TABLES `workhours` WRITE;
/*!40000 ALTER TABLE `workhours` DISABLE KEYS */;
INSERT INTO `workhours` VALUES (4,2,'2025-05-01',2.00),(5,1,'2025-05-01',8.00),(6,3,'2025-05-01',8.00),(7,1,'2025-05-02',8.00),(8,3,'2025-05-02',8.00),(9,2,'2025-05-05',3.00),(10,1,'2025-05-05',8.00),(11,3,'2025-05-05',8.00),(12,2,'2025-05-06',3.00),(13,1,'2025-05-06',8.00),(14,3,'2025-05-06',8.00),(15,1,'2025-05-07',8.00),(16,2,'2025-05-08',3.00),(17,1,'2025-05-08',8.00),(18,3,'2025-05-08',8.00),(19,1,'2025-05-09',8.00),(20,3,'2025-05-09',8.00),(21,2,'2025-05-12',3.00),(22,1,'2025-05-12',8.00),(23,3,'2025-05-12',8.00),(24,2,'2025-05-13',1.00),(25,1,'2025-05-13',8.00),(26,3,'2025-05-13',8.00),(27,1,'2025-05-14',8.00),(28,2,'2025-05-15',3.00),(29,1,'2025-05-15',8.00),(30,3,'2025-05-15',8.00),(31,1,'2025-05-16',8.00),(32,3,'2025-05-16',8.00),(33,2,'2025-05-19',3.00),(34,1,'2025-05-19',8.00),(35,3,'2025-05-19',8.00),(36,2,'2025-05-20',3.00),(37,1,'2025-05-20',8.00),(38,3,'2025-05-20',8.00),(39,1,'2025-05-21',8.00),(40,3,'2025-05-21',8.00),(42,1,'2025-05-22',8.00),(43,3,'2025-05-22',8.00),(44,1,'2025-05-23',8.00),(45,3,'2025-05-23',8.00),(46,2,'2025-05-26',3.00),(47,1,'2025-05-26',8.00),(48,3,'2025-05-26',8.00),(49,2,'2025-05-27',1.00),(50,1,'2025-05-27',8.00),(51,3,'2025-05-27',8.00),(52,1,'2025-05-28',8.00),(53,3,'2025-05-28',8.00),(54,2,'2025-05-29',3.00),(55,1,'2025-05-29',8.00),(56,3,'2025-05-29',8.00),(57,1,'2025-05-30',8.00),(58,2,'2025-06-02',3.00),(59,1,'2025-06-02',8.00),(60,2,'2025-06-03',3.00),(61,1,'2025-06-03',8.00),(62,3,'2025-06-03',8.00),(63,1,'2025-06-04',8.00),(64,3,'2025-06-04',8.00),(65,2,'2025-06-05',3.00),(66,1,'2025-06-05',8.00),(67,3,'2025-06-05',8.00),(68,1,'2025-06-06',8.00),(69,3,'2025-06-06',8.00),(70,2,'2025-06-09',3.00),(71,1,'2025-06-09',8.00),(72,3,'2025-06-09',8.00),(73,2,'2025-06-10',3.00),(74,1,'2025-06-10',8.00),(75,3,'2025-06-10',8.00),(76,1,'2025-06-11',8.00),(77,3,'2025-06-11',8.00),(78,2,'2025-06-12',3.00),(79,1,'2025-06-12',8.00),(80,1,'2025-06-13',8.00),(81,3,'2025-06-13',8.00),(82,2,'2025-06-16',3.00),(83,1,'2025-06-16',8.00),(84,3,'2025-06-16',8.00),(85,2,'2025-06-17',3.00),(86,1,'2025-06-17',8.00),(87,3,'2025-06-17',8.00),(88,1,'2025-06-18',8.00),(89,3,'2025-06-18',8.00),(90,2,'2025-06-19',3.00),(91,1,'2025-06-19',8.00),(92,3,'2025-06-19',8.00),(93,1,'2025-06-20',8.00),(94,3,'2025-06-20',8.00),(95,2,'2025-06-23',2.00),(96,1,'2025-06-23',8.00),(97,3,'2025-06-23',8.00),(98,2,'2025-06-24',1.00),(99,1,'2025-06-24',8.00),(100,3,'2025-06-24',8.00),(101,1,'2025-06-25',8.00),(102,3,'2025-06-25',8.00),(103,2,'2025-06-26',3.00),(104,1,'2025-06-26',8.00),(105,3,'2025-06-26',8.00),(106,1,'2025-06-27',8.00),(107,2,'2025-06-30',2.00),(108,1,'2025-06-30',8.00),(109,3,'2025-06-30',8.00);
/*!40000 ALTER TABLE `workhours` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-16 10:24:45
