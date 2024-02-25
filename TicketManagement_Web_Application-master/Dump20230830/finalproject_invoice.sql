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
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoice` (
  `bookingid` int(11) NOT NULL AUTO_INCREMENT,
  `passanger_id` varchar(45) DEFAULT NULL,
  `passanger_name` varchar(45) DEFAULT NULL,
  `passanger_email` varchar(45) DEFAULT NULL,
  `flight_number` varchar(45) DEFAULT NULL,
  `flight_name` varchar(45) DEFAULT NULL,
  `from_city` varchar(45) DEFAULT NULL,
  `to_city` varchar(45) DEFAULT NULL,
  `flying_date` varchar(45) DEFAULT NULL,
  `return_date` varchar(45) DEFAULT NULL,
  `classcatagory` varchar(45) DEFAULT NULL,
  `seat` varchar(45) DEFAULT NULL,
  `gate` varchar(45) DEFAULT NULL,
  `departure_time` varchar(45) DEFAULT NULL,
  `arrival_time` varchar(45) DEFAULT NULL,
  `booking_date` varchar(45) DEFAULT NULL,
  `total_amount` int(11) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `cancel_date` varchar(45) DEFAULT NULL,
  `refundable_amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`bookingid`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES (10,'1271427','israt','israt@gmail.com','UB001','US BANGLA','Dhaka','Barishal','2023-08-03','2023-08-05','economy','A1','AA','16:00','17:01','2023-08-07',1500,'Booked',NULL,0),(11,'1271426','Tarikul islam','Tarik@gmail.com','UB002','US BANGLA','Rajshahi','Dhaka','2023-08-22','2023-08-23','economy','A1','AA','18:25','19:25','2023-08-07',1500,'Booked',NULL,0),(15,'1271428','Rejwan Sharif','rejwan@gmail.com','UB001','US BANGLA','Dhaka','Barishal','2023-08-03','2023-08-05','economy','A2','AA','16:00','17:01','2023-08-08',1500,'Booked',NULL,0),(20,'1271429','Sharif','sharif@gmail.com','UB001','US BANGLA','Dhaka','Barishal','2023-08-03','2023-08-05','economy','B3','AA','16:00','17:01','2023-08-08',1500,'Booked',NULL,0),(21,'1271427','israt','israt@gmail.com','UB001','US BANGLA','Dhaka','Barishal','2023-08-03','2023-08-05','economy','','AA','16:00','17:01','2023-08-08',3000,'Cancel','2023-08-09',600),(22,'1271428','Rejwan Sharif','rejwan@gmail.com','UB002','US BANGLA','Rajshahi','Dhaka','2023-08-22','null','economy','A2','AA','18:25','19:25','2023-08-08',1500,'Booked',NULL,0),(23,'1271428','Rejwan Sharif','rejwan@gmail.com','UB001','US BANGLA','Dhaka','Barishal','2023-08-03','2023-08-05','economy','A3','AA','16:00','17:01','2023-08-08',3000,'Booked',NULL,0),(24,'1271427','israt','israt@gmail.com','UB001','US BANGLA','Dhaka','Barishal','2023-08-03','2023-08-05','economy','A4','AA','16:00','17:01','2023-08-09',3000,'Booked',NULL,0),(25,'1271429','Sharif','sharif@gmail.com','bb001','biman bangladesh','Dhaka','India','2023-08-07','null','economy','A1','AA','05:55','06:55','2023-08-30',5500,'Booked',NULL,0),(26,'1271428','Rejwan Sharif','rejwan@gmail.com','NA001','NOVO AIR','Dhaka','Thiland','2023-07-28','null','Business','A1','AA','13:50','14:55','2023-08-30',5225,'Booked',NULL,0),(27,'1271426','Tarikul islam','Tarik@gmail.com','bb001','biman bangladesh','Dhaka','India','2023-08-07','null','Business','C1','AA','05:55','06:55','2023-08-30',4500,'Booked',NULL,0),(28,'1271427','israt','israt@gmail.com','NA002','NOVO AIR','Dhaka','USA','2023-08-02','2023-08-03','Business','A1','AA','14:53','15:55','2023-08-30',24700,'Booked',NULL,0);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
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
