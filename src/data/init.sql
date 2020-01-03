-- Dumping database structure for test
CREATE DATABASE IF NOT EXISTS `test` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;
USE `test`;

CREATE TABLE `t_user_basic_info` (
	`id` INT(11) NULL DEFAULT NULL,
	`name` VARCHAR(64) NULL DEFAULT NULL COLLATE 'utf8mb4_unicode_ci',
	`address` VARCHAR(64) NULL DEFAULT NULL COLLATE 'utf8mb4_unicode_ci',
	`test_col` VARCHAR(64) NULL DEFAULT NULL COLLATE 'utf8mb4_unicode_ci'
) 
COLLATE='utf8mb4_unicode_ci'
ENGINE=InnoDB; 

-- Dumping data for table test.t_user_basic_info: ~3 rows (approximately)
/*!40000 ALTER TABLE `t_user_basic_info` DISABLE KEYS */;
INSERT INTO `t_user_basic_info` (`id`, `name`, `address`, `test_col`) VALUES
	(1, 'tony', 'net7.1', NULL),
	(2, 'tony', 'net7.1', NULL),
	(3, 'tony', 'net7.1', NULL);
/*!40000 ALTER TABLE `t_user_basic_info` ENABLE KEYS */;