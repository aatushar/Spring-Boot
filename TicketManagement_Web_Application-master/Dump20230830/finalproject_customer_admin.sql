-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: finalproject
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `customer_admin`
--

DROP TABLE IF EXISTS `customer_admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_admin` (
  `customer_id` int(11) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `customer_name` varchar(45) DEFAULT NULL,
  `dob` varchar(45) DEFAULT NULL,
  `nationality` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `customerstatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_admin`
--

LOCK TABLES `customer_admin` WRITE;
/*!40000 ALTER TABLE `customer_admin` DISABLE KEYS */;
INSERT INTO `customer_admin` VALUES (1271426,'Tarik@gmail.com','tarik','Tarikul islam','2023-07-07','Bangladeshi','01740930495','Barishal',NULL),(1271427,'israt@gmail.com','israt','israt','2023-07-04','bangladeshi','01740436288','barishal',NULL),(1271428,'rejwan@gmail.com','rejwan','Rejwan Sharif','1996-05-16','bangladeshi','01740436288','noakhali',NULL),(1271429,'sharif@gmail.com','sharif','Sharif','1998-11-24','bangladeshi','01740436288','noakhali',NULL),(1271430,'tajnun@gmail.com','tajnun','Tajnun Nahar','2023-07-19','bangladeshi','01740436288','barishal',NULL),(1271431,'taba@gmail.com','taba','Taba','2023-07-04','bangladeshi','01740436288','barishal',NULL),(1271432,'twaha@gmail.com','twaha','Twaha','2023-07-19','bangladeshi','01740436288','barishal',NULL),(1271434,'nilu@gmail.com','nilu','Nilima','2023-07-27','bangladeshi','01740436288','barishal',NULL);
/*!40000 ALTER TABLE `customer_admin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-30 12:11:07
