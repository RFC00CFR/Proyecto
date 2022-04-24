CREATE DATABASE  IF NOT EXISTS `proyecto_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `proyecto_db`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: proyecto_db
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `IDENTIFICACION` int NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(45) NOT NULL,
  `APELLIDO_PATERNO` varchar(45) NOT NULL,
  `APELLIDO_MATERNO` varchar(45) NOT NULL,
  `FECHA_NACIMIENTO` varchar(45) NOT NULL,
  `PUESTO` varchar(45) NOT NULL,
  `SALARIO_EMPLEADO` varchar(45) NOT NULL,
  `OFICINA_ASIGNADA` varchar(45) NOT NULL,
  `UBICACION_OFICINA` varchar(45) NOT NULL,
  `DIRECCION_EMPLEADO` varchar(45) NOT NULL,
  `TELEFONO_1` varchar(45) NOT NULL,
  `TELEFONO_2` varchar(45) NOT NULL,
  `CORREOS_ELECTRONICOS` varchar(45) NOT NULL,
  `ESTADO` tinyint NOT NULL,
  `FECHA_REGISTRO` date NOT NULL,
  `NOMBRE_USUARIO_REGISTRO` varchar(45) NOT NULL,
  PRIMARY KEY (`IDENTIFICACION`),
  UNIQUE KEY `IDENTIFICACION_UNIQUE` (`IDENTIFICACION`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado_cantones`
--

DROP TABLE IF EXISTS `empleado_cantones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado_cantones` (
  `id_cantones` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id_cantones`),
  UNIQUE KEY `id_cantones_UNIQUE` (`id_cantones`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado_cantones`
--

LOCK TABLES `empleado_cantones` WRITE;
/*!40000 ALTER TABLE `empleado_cantones` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado_cantones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado_correos`
--

DROP TABLE IF EXISTS `empleado_correos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado_correos` (
  `id_correos` int NOT NULL AUTO_INCREMENT,
  `correo` varchar(45) NOT NULL,
  PRIMARY KEY (`id_correos`),
  UNIQUE KEY `id_correos_UNIQUE` (`id_correos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado_correos`
--

LOCK TABLES `empleado_correos` WRITE;
/*!40000 ALTER TABLE `empleado_correos` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado_correos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado_direcciones`
--

DROP TABLE IF EXISTS `empleado_direcciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado_direcciones` (
  `id_direcciones` int NOT NULL AUTO_INCREMENT,
  `provincia` varchar(45) NOT NULL,
  `canton` varchar(45) NOT NULL,
  `distrito` varchar(45) NOT NULL,
  `senas` varchar(45) NOT NULL,
  PRIMARY KEY (`id_direcciones`),
  UNIQUE KEY `id_direcciones_UNIQUE` (`id_direcciones`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado_direcciones`
--

LOCK TABLES `empleado_direcciones` WRITE;
/*!40000 ALTER TABLE `empleado_direcciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado_direcciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado_distritos`
--

DROP TABLE IF EXISTS `empleado_distritos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado_distritos` (
  `id_distritos` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id_distritos`),
  UNIQUE KEY `id_distritos_UNIQUE` (`id_distritos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado_distritos`
--

LOCK TABLES `empleado_distritos` WRITE;
/*!40000 ALTER TABLE `empleado_distritos` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado_distritos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado_oficinas`
--

DROP TABLE IF EXISTS `empleado_oficinas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado_oficinas` (
  `id_oficina` int NOT NULL AUTO_INCREMENT,
  `ubicacion` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  PRIMARY KEY (`id_oficina`),
  UNIQUE KEY `telefono_UNIQUE` (`telefono`),
  UNIQUE KEY `id_oficina_UNIQUE` (`id_oficina`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado_oficinas`
--

LOCK TABLES `empleado_oficinas` WRITE;
/*!40000 ALTER TABLE `empleado_oficinas` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado_oficinas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado_provincias`
--

DROP TABLE IF EXISTS `empleado_provincias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado_provincias` (
  `id_provincias` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id_provincias`),
  UNIQUE KEY `id_provincias_UNIQUE` (`id_provincias`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado_provincias`
--

LOCK TABLES `empleado_provincias` WRITE;
/*!40000 ALTER TABLE `empleado_provincias` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado_provincias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado_puestos`
--

DROP TABLE IF EXISTS `empleado_puestos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado_puestos` (
  `id_puestos` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `salario` varchar(45) NOT NULL,
  PRIMARY KEY (`id_puestos`),
  UNIQUE KEY `id_puestos_UNIQUE` (`id_puestos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado_puestos`
--

LOCK TABLES `empleado_puestos` WRITE;
/*!40000 ALTER TABLE `empleado_puestos` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado_puestos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado_registros`
--

DROP TABLE IF EXISTS `empleado_registros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado_registros` (
  `id_registros` int NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `nombre_de_usuario` varchar(45) NOT NULL,
  PRIMARY KEY (`id_registros`),
  UNIQUE KEY `id_registros_UNIQUE` (`id_registros`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado_registros`
--

LOCK TABLES `empleado_registros` WRITE;
/*!40000 ALTER TABLE `empleado_registros` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado_registros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado_telefonos`
--

DROP TABLE IF EXISTS `empleado_telefonos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado_telefonos` (
  `id_telefonos` int NOT NULL AUTO_INCREMENT,
  `telefono` varchar(45) NOT NULL,
  PRIMARY KEY (`id_telefonos`),
  UNIQUE KEY `telefono_UNIQUE` (`telefono`),
  UNIQUE KEY `id_telefonos_UNIQUE` (`id_telefonos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado_telefonos`
--

LOCK TABLES `empleado_telefonos` WRITE;
/*!40000 ALTER TABLE `empleado_telefonos` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado_telefonos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturacion_paqueteria`
--

DROP TABLE IF EXISTS `facturacion_paqueteria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facturacion_paqueteria` (
  `NUM_FACTURA` int NOT NULL AUTO_INCREMENT,
  `NOMBRE_CLIENTE` varchar(45) NOT NULL,
  `FECHA_FACTURA` varchar(45) NOT NULL,
  `NUMERO_PAQUETE` varchar(45) NOT NULL,
  `COSTO_IMPUESTOS` varchar(45) NOT NULL,
  `COSTO_FLETE` varchar(45) NOT NULL,
  `COSTO_IVA` varchar(45) NOT NULL,
  `TOTAL_POR_ENVIO` varchar(45) NOT NULL,
  `TOTAL_ANTES_IVA` varchar(45) NOT NULL,
  `TOTAL_FACTURA` varchar(45) NOT NULL,
  `DIRECCION_CLIENTE` varchar(45) NOT NULL,
  `TELEFONO_CLIENTE_1` varchar(45) NOT NULL,
  `TELEFONO_CLIENTE_2` varchar(45) NOT NULL,
  `EMAIL_CLIENTE_FE` varchar(45) NOT NULL,
  `EMAIL_CLIENTE` varchar(45) NOT NULL,
  `FECHA_REGISTRO` varchar(45) NOT NULL,
  `NOMBRE_USUARIO_REGISTRO` varchar(45) NOT NULL,
  `ESTADO` varchar(45) NOT NULL,
  PRIMARY KEY (`NUM_FACTURA`),
  UNIQUE KEY `NUM_FACTURA_UNIQUE` (`NUM_FACTURA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturacion_paqueteria`
--

LOCK TABLES `facturacion_paqueteria` WRITE;
/*!40000 ALTER TABLE `facturacion_paqueteria` DISABLE KEYS */;
/*!40000 ALTER TABLE `facturacion_paqueteria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventario_marca`
--

DROP TABLE IF EXISTS `inventario_marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventario_marca` (
  `id_marca` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id_marca`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario_marca`
--

LOCK TABLES `inventario_marca` WRITE;
/*!40000 ALTER TABLE `inventario_marca` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventario_marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventario_revisiones`
--

DROP TABLE IF EXISTS `inventario_revisiones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventario_revisiones` (
  `id_revisiones` int NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  PRIMARY KEY (`id_revisiones`),
  UNIQUE KEY `id_revisiones_UNIQUE` (`id_revisiones`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario_revisiones`
--

LOCK TABLES `inventario_revisiones` WRITE;
/*!40000 ALTER TABLE `inventario_revisiones` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventario_revisiones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventario_tipo_mantenimiento`
--

DROP TABLE IF EXISTS `inventario_tipo_mantenimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventario_tipo_mantenimiento` (
  `id_tipo_mantenimiento` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id_tipo_mantenimiento`),
  UNIQUE KEY `id_tipo_mantenimiento_UNIQUE` (`id_tipo_mantenimiento`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario_tipo_mantenimiento`
--

LOCK TABLES `inventario_tipo_mantenimiento` WRITE;
/*!40000 ALTER TABLE `inventario_tipo_mantenimiento` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventario_tipo_mantenimiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventario_tipo_vehiculo`
--

DROP TABLE IF EXISTS `inventario_tipo_vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventario_tipo_vehiculo` (
  `id_tipo_vehiculo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id_tipo_vehiculo`),
  UNIQUE KEY `id_tipo_vehiculo_UNIQUE` (`id_tipo_vehiculo`),
  UNIQUE KEY `tipo_UNIQUE` (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario_tipo_vehiculo`
--

LOCK TABLES `inventario_tipo_vehiculo` WRITE;
/*!40000 ALTER TABLE `inventario_tipo_vehiculo` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventario_tipo_vehiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventario_vehiculos`
--

DROP TABLE IF EXISTS `inventario_vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventario_vehiculos` (
  `NUM_INTERNO` int NOT NULL,
  ` NUM_PLACA` varchar(45) DEFAULT NULL,
  `MARCA` varchar(45) DEFAULT NULL,
  `MODELO` varchar(45) DEFAULT NULL,
  `STOCK` varchar(45) DEFAULT NULL,
  `TIPO_VEHICULO` varchar(45) DEFAULT NULL,
  `ESTADO_VEHICULO` varchar(45) DEFAULT NULL,
  `FECHA_REGISTRO` varchar(45) DEFAULT NULL,
  `NOMBRE_USUARIO_REGISTRO` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`NUM_INTERNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario_vehiculos`
--

LOCK TABLES `inventario_vehiculos` WRITE;
/*!40000 ALTER TABLE `inventario_vehiculos` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventario_vehiculos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invetario_modelo`
--

DROP TABLE IF EXISTS `invetario_modelo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invetario_modelo` (
  `id_modelo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id_modelo`),
  UNIQUE KEY `id_modelo_UNIQUE` (`id_modelo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invetario_modelo`
--

LOCK TABLES `invetario_modelo` WRITE;
/*!40000 ALTER TABLE `invetario_modelo` DISABLE KEYS */;
/*!40000 ALTER TABLE `invetario_modelo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paqueteria`
--

DROP TABLE IF EXISTS `paqueteria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paqueteria` (
  `NUM_PAQUETE` int NOT NULL AUTO_INCREMENT,
  `DESCRIPCION_PAQUETE` varchar(45) DEFAULT NULL,
  `OFICINA_UBICACION` varchar(45) DEFAULT NULL,
  `EMPLEADO_PROCESO` varchar(45) DEFAULT NULL,
  `NOMBRE_CLIENTE` varchar(45) DEFAULT NULL,
  `IDENTIFICACION_CLIENTE` varchar(45) DEFAULT NULL,
  `TIPO_ENVIO` varchar(45) DEFAULT NULL,
  `TELEFONO_CLIENTE` varchar(45) DEFAULT NULL,
  `DIRECCIONES_CLIENTE` varchar(45) DEFAULT NULL,
  `CORREOS_CLIENTE` varchar(45) DEFAULT NULL,
  `TIPO_CLIENTE` varchar(45) DEFAULT NULL,
  `ESTADO_CLIENTE` varchar(45) DEFAULT NULL,
  `ESTADO_PAQUETE` varchar(45) DEFAULT NULL,
  `FECHA_REGISTRO` varchar(45) DEFAULT NULL,
  `NOMBRE_USUARIO_REGISTRO` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`NUM_PAQUETE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paqueteria`
--

LOCK TABLES `paqueteria` WRITE;
/*!40000 ALTER TABLE `paqueteria` DISABLE KEYS */;
/*!40000 ALTER TABLE `paqueteria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paqueteria_correos_clientes`
--

DROP TABLE IF EXISTS `paqueteria_correos_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paqueteria_correos_clientes` (
  `id_correos_cliente` int NOT NULL AUTO_INCREMENT,
  `correo` varchar(45) NOT NULL,
  PRIMARY KEY (`id_correos_cliente`),
  UNIQUE KEY `id_correos_cliente_UNIQUE` (`id_correos_cliente`),
  UNIQUE KEY `correo_UNIQUE` (`correo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paqueteria_correos_clientes`
--

LOCK TABLES `paqueteria_correos_clientes` WRITE;
/*!40000 ALTER TABLE `paqueteria_correos_clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `paqueteria_correos_clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paqueteria_direcciones_clientes`
--

DROP TABLE IF EXISTS `paqueteria_direcciones_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paqueteria_direcciones_clientes` (
  `id_direcciones_clientes` int NOT NULL AUTO_INCREMENT,
  `direccion` varchar(45) NOT NULL,
  PRIMARY KEY (`id_direcciones_clientes`),
  UNIQUE KEY `id_direcciones_clientes_UNIQUE` (`id_direcciones_clientes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paqueteria_direcciones_clientes`
--

LOCK TABLES `paqueteria_direcciones_clientes` WRITE;
/*!40000 ALTER TABLE `paqueteria_direcciones_clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `paqueteria_direcciones_clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paqueteria_envio`
--

DROP TABLE IF EXISTS `paqueteria_envio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paqueteria_envio` (
  `id_envio` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id_envio`),
  UNIQUE KEY `id_envio_UNIQUE` (`id_envio`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paqueteria_envio`
--

LOCK TABLES `paqueteria_envio` WRITE;
/*!40000 ALTER TABLE `paqueteria_envio` DISABLE KEYS */;
/*!40000 ALTER TABLE `paqueteria_envio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paqueteria_estados_paquetes`
--

DROP TABLE IF EXISTS `paqueteria_estados_paquetes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paqueteria_estados_paquetes` (
  `id_estados_paquetes` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id_estados_paquetes`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`),
  UNIQUE KEY `id_estados_paquetes_UNIQUE` (`id_estados_paquetes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paqueteria_estados_paquetes`
--

LOCK TABLES `paqueteria_estados_paquetes` WRITE;
/*!40000 ALTER TABLE `paqueteria_estados_paquetes` DISABLE KEYS */;
/*!40000 ALTER TABLE `paqueteria_estados_paquetes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paqueteria_telefonos_clientes`
--

DROP TABLE IF EXISTS `paqueteria_telefonos_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paqueteria_telefonos_clientes` (
  `id_telefonos_clientes` int NOT NULL AUTO_INCREMENT,
  `telefono` varchar(45) NOT NULL,
  PRIMARY KEY (`id_telefonos_clientes`),
  UNIQUE KEY `id_telefonos_clientes_UNIQUE` (`id_telefonos_clientes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paqueteria_telefonos_clientes`
--

LOCK TABLES `paqueteria_telefonos_clientes` WRITE;
/*!40000 ALTER TABLE `paqueteria_telefonos_clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `paqueteria_telefonos_clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paqueteria_tipos_clientes`
--

DROP TABLE IF EXISTS `paqueteria_tipos_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paqueteria_tipos_clientes` (
  `id_tipos_clientes` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id_tipos_clientes`),
  UNIQUE KEY `id_tipos_clientes_UNIQUE` (`id_tipos_clientes`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paqueteria_tipos_clientes`
--

LOCK TABLES `paqueteria_tipos_clientes` WRITE;
/*!40000 ALTER TABLE `paqueteria_tipos_clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `paqueteria_tipos_clientes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-21 21:39:14
