CREATE DATABASE `version_management`;
 
USE `version_management`;


DROP TABLE IF EXISTS `licenses`;

CREATE TABLE `licenses` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `licenses` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
);


DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `fullname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
)

DROP TABLE IF EXISTS `versions`;

CREATE TABLE `versions` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `file_attach` varchar(255) DEFAULT NULL,
  `licenses_id` int unsigned NOT NULL,
  `version` float NOT NULL,
  `date_changed` datetime NOT NULL,
  `changed_by` varchar(255) NOT NULL,
  `content_reset` tinyint(1) NOT NULL,
  `comment_attach` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `licenses_id` (`licenses_id`),
  CONSTRAINT `versions_ibfk_1` FOREIGN KEY (`licenses_id`) REFERENCES `licenses` (`id`)
);