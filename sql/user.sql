/*
 Navicat MySQL Data Transfer

 Source Server         : local
 Source Server Version : 50719
 Source Host           : localhost
 Source Database       : test

 Target Server Version : 50719
 File Encoding         : utf-8

 Date: 09/16/2019 13:17:41 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', 'test', '10');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
