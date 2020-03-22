/*
Navicat MySQL Data Transfer

Source Server         : admin
Source Server Version : 80016
Source Host           : localhost:3306
Source Database       : practise

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-08-04 15:57:42
*/

drop database if exists `practise` ;
create database `practise` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;


SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` varchar(64) COLLATE utf8mb4_general_ci NOT NULL,
  `user_name` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `user_password` varchar(64) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `user_sex` int(11) DEFAULT NULL,
  `user_email` varchar(64) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `user_phone` varchar(11) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `user_admin` varchar(16) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
