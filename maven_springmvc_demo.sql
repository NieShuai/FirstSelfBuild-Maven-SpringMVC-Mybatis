/*
Navicat MySQL Data Transfer

Source Server         : nieshuai-test
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : maven_springmvc_demo

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2016-06-30 11:16:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'test1', '男');
INSERT INTO `user` VALUES ('2', '托尔斯泰2', '男');
INSERT INTO `user` VALUES ('3', 'test3', '女');
INSERT INTO `user` VALUES ('4', 'test4', '女');
