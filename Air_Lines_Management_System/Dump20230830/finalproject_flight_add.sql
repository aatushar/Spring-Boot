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
-- Table structure for table `flight_add`
--

DROP TABLE IF EXISTS `flight_add`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight_add` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `number` varchar(45) DEFAULT NULL,
  `departuer_time` varchar(45) DEFAULT NULL,
  `arrival_time` varchar(45) DEFAULT NULL,
  `flying_date` varchar(45) DEFAULT NULL,
  `return_date` varchar(45) DEFAULT NULL,
  `from_city` varchar(45) DEFAULT NULL,
  `to_city` varchar(45) DEFAULT NULL,
  `catagory` varchar(45) DEFAULT NULL,
  `economy_price` int(11) DEFAULT NULL,
  `business_price` int(11) DEFAULT NULL,
  `photo` varchar(45) DEFAULT NULL,
  `offered` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight_add`
--

LOCK TABLES `flight_add` WRITE;
/*!40000 ALTER TABLE `flight_add` DISABLE KEYS */;
INSERT INTO `flight_add` VALUES (1,'US BANGLA','UB001','16:00','17:01','2023-08-03','2023-08-05','Dhaka','Barishal','Domestic',1500,1000,'./assets/udb1.jpg',NULL,NULL),(2,'US BANGLA','UB002','18:25','19:25','2023-08-22','2023-08-23','Rajshahi','Dhaka','Domestic',1500,1000,'./assets/udb1.jpg',NULL,NULL),(3,'US BANGLA','UB001','21:25','22:25','2023-08-05',NULL,'Barishal','Dhaka','Domestic',1500,1000,'./assets/udb1.jpg','Yes','Eid Offer'),(4,'US BANGLA','Ub001','12:12','13:12','2023-08-16','2023-08-17','Rajshahi','Barishal','Domestic',1500,1000,'./assets/udb1.jpg',NULL,NULL),(5,'US BANGLA','UB003','19:50','20:50','2023-08-15','2023-08-17','Dhaka','Rajshahi','Domestic',1500,1000,'./assets/udb1.jpg',NULL,NULL),(6,'US BANGLA','UB002','20:59','21:59','2023-08-23','2023-08-25','Dhaka','Rajshahi','Domestic',1500,1000,'./assets/udb1.jpg',NULL,NULL),(7,'biman bangladesh','bb001','05:55','06:55','2023-08-07','2023-08-17','Dhaka','India','International',5500,4500,'./assets/udb1.jpg',NULL,NULL),(8,'NOVO AIR','NA001','13:50','14:55','2023-07-28','2023-07-30','Dhaka','Thiland','International',7700,5500,'./assets/udb1.jpg',NULL,NULL),(9,'NOVO AIR','NA002','14:53','15:55','2023-08-02','2023-08-03','Dhaka','USA','International',15000,13000,'./assets/udb1.jpg',NULL,NULL),(10,'NOVO AIR','NA003','15:15','16:20','2023-08-09','2023-08-10','USA','Dhaka','International',15000,13000,'./assets/udb1.jpg','NO','there is no package');
/*!40000 ALTER TABLE `flight_add` ENABLE KEYS */;
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
