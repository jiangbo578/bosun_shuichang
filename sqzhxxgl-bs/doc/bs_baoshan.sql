/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50616
Source Host           : localhost:3306
Source Database       : baoshan

Target Server Type    : MYSQL
Target Server Version : 50616
File Encoding         : 65001

Date: 2014-07-04 12:56:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `bs_authority`
-- ----------------------------
DROP TABLE IF EXISTS `bs_authority`;
CREATE TABLE `bs_authority` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `CODE` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `PATH` varchar(255) DEFAULT NULL,
  `RESOURCE_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`),
  KEY `FKD3F29CD5371F336C` (`RESOURCE_ID`),
  CONSTRAINT `FKD3F29CD5371F336C` FOREIGN KEY (`RESOURCE_ID`) REFERENCES `bs_resource` (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_authority
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_business`
-- ----------------------------
DROP TABLE IF EXISTS `bs_business`;
CREATE TABLE `bs_business` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `AUDIT` tinyint(1) DEFAULT NULL,
  `CODE` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `REMIND` tinyint(1) DEFAULT NULL,
  `URL` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_business
-- ----------------------------
INSERT INTO `bs_business` VALUES ('402881f446e5bcf90146e5bdeb170000', '2014-06-29 11:49:27', '2014-07-03 21:29:20', '1', 'Gzldxz', '各类工作领导小组名单', '1', '/gzldxz/add');
INSERT INTO `bs_business` VALUES ('402881f446e60ffb0146e61091f10000', '2014-06-29 13:19:44', '2014-07-03 21:28:23', '1', 'Xfqcwh', '消防器材维护记录', '1', '/xfqcwh/add');
INSERT INTO `bs_business` VALUES ('402881f446e7f3cc0146e7f47b990000', '2014-06-29 22:08:17', '2014-07-03 21:29:59', '1', 'Zcdygk', '在册党员概况及名册', '1', '/zcdygk/add');

-- ----------------------------
-- Table structure for `bs_business_form`
-- ----------------------------
DROP TABLE IF EXISTS `bs_business_form`;
CREATE TABLE `bs_business_form` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `SYS_CREATE` tinyint(1) DEFAULT NULL,
  `BUSINESS_ID` varchar(255) DEFAULT NULL,
  `PROCESSINSTANCE_ID` varchar(255) DEFAULT NULL,
  `PROCESS_STATUS` varchar(255) DEFAULT NULL,
  `USER_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`),
  KEY `FKAE3D5A75AE7AE57` (`BUSINESS_ID`),
  KEY `FKAE3D5A7519C7C74C` (`USER_ID`),
  CONSTRAINT `FKAE3D5A7519C7C74C` FOREIGN KEY (`USER_ID`) REFERENCES `bs_user` (`PID`),
  CONSTRAINT `FKAE3D5A75AE7AE57` FOREIGN KEY (`BUSINESS_ID`) REFERENCES `bs_business` (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_business_form
-- ----------------------------
INSERT INTO `bs_business_form` VALUES ('4028800546ff54830146ff549c720000', '2014-07-04 11:04:33', '2014-07-04 11:04:33', '消防装备器材维护记录(07月04日)', '0', '402881f446e60ffb0146e61091f10000', '701', '书记审核业务', '402881f446fbf95e0146fbfc1aae0004');
INSERT INTO `bs_business_form` VALUES ('4028800546ffa2fa0146ffa37c290000', '2014-07-04 12:30:42', '2014-07-04 12:30:42', '在册党员名册表(2014)', '0', '402881f446e7f3cc0146e7f47b990000', '1301', '书记审核业务', '402881f446fbf95e0146fbfc1aae0004');
INSERT INTO `bs_business_form` VALUES ('402881f446e602e00146e60da330000c', '2014-06-29 13:16:31', '2014-06-29 22:30:23', '领导小组名单表1(2014)', '0', '402881f446e5bcf90146e5bdeb170000', null, null, null);

-- ----------------------------
-- Table structure for `bs_business_gzldxz`
-- ----------------------------
DROP TABLE IF EXISTS `bs_business_gzldxz`;
CREATE TABLE `bs_business_gzldxz` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `BZ` varchar(255) DEFAULT NULL,
  `CSNY` date DEFAULT NULL,
  `DRZW` varchar(255) DEFAULT NULL,
  `DZ` varchar(255) DEFAULT NULL,
  `FGZZ` varchar(255) DEFAULT NULL,
  `XB` varchar(255) DEFAULT NULL,
  `XM` varchar(255) DEFAULT NULL,
  `ZZMM` varchar(255) DEFAULT NULL,
  `BUSINESS_FORM_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`),
  KEY `FK169D9F5E6EEDC3B8` (`BUSINESS_FORM_ID`),
  CONSTRAINT `FK169D9F5E6EEDC3B8` FOREIGN KEY (`BUSINESS_FORM_ID`) REFERENCES `bs_business_form` (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_business_gzldxz
-- ----------------------------
INSERT INTO `bs_business_gzldxz` VALUES ('402881f446e602e00146e60dc5c5000d', '2014-06-29 13:16:40', null, '1', '2014-06-29', '1', '1', '1', '男', '1', '1', '402881f446e602e00146e60da330000c');

-- ----------------------------
-- Table structure for `bs_business_hyjl`
-- ----------------------------
DROP TABLE IF EXISTS `bs_business_hyjl`;
CREATE TABLE `bs_business_hyjl` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `CJDX` varchar(255) DEFAULT NULL,
  `DD` varchar(255) DEFAULT NULL,
  `HYLB` varchar(255) DEFAULT NULL,
  `HYYT` varchar(255) DEFAULT NULL,
  `JLR` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `NR` varchar(255) DEFAULT NULL,
  `RS` int(11) DEFAULT NULL,
  `SJ` date DEFAULT NULL,
  `ZCR` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_business_hyjl
-- ----------------------------
INSERT INTO `bs_business_hyjl` VALUES ('402881f446e7e4820146e7e65baa0000', '2014-06-26 21:52:49', null, '打算', '的', '34是', '打算', '打算', '2014年06月会议记录', '撒打算打算', '22', '2014-06-25', '倒萨');
INSERT INTO `bs_business_hyjl` VALUES ('402881f446e7e4820146e7e7cbae0001', '2014-06-29 21:54:24', '2014-06-30 16:56:24', '倒萨1', '倒萨1', '倒萨1', '倒萨1', '倒萨1', '2014年06月会议记录', '<p>\r\n	倒萨倒<span style=\"background-color:#006600;\">萨倒萨倒</span>萨倒萨111\r\n</p>\r\n<p>\r\n	倒萨的打算打\r\n</p>\r\n<p>\r\n	打算<strong>打算打算发送到飞</strong>袋鼠\r\n</p>\r\n<p>\r\n	发啊是倒萨倒萨&nbsp;\r\n</p>', '11', '2014-07-01', '倒萨1');

-- ----------------------------
-- Table structure for `bs_business_remind`
-- ----------------------------
DROP TABLE IF EXISTS `bs_business_remind`;
CREATE TABLE `bs_business_remind` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `GREEN_START` date DEFAULT NULL,
  `RED_STAERT` date DEFAULT NULL,
  `REMIND_DATE` date DEFAULT NULL,
  `YELLOW_START` date DEFAULT NULL,
  `BUSINESS_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`),
  KEY `FK283B8676AE7AE57` (`BUSINESS_ID`),
  CONSTRAINT `FK283B8676AE7AE57` FOREIGN KEY (`BUSINESS_ID`) REFERENCES `bs_business` (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_business_remind
-- ----------------------------
INSERT INTO `bs_business_remind` VALUES ('402881f446e5e0710146e5e1ad750000', '2014-06-29 12:28:30', null, '1970-06-26', '1970-06-30', '1970-07-03', '1970-06-29', '402881f446e5bcf90146e5bdeb170000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e623cc6d0000', '2014-06-29 13:40:44', null, '1970-01-01', '1970-01-09', '1970-01-10', '1970-01-05', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e623cce20001', '2014-06-29 13:40:44', null, '1970-02-01', '1970-02-09', '1970-02-10', '1970-02-05', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e623ce700002', '2014-06-29 13:40:44', null, '1970-03-01', '1970-03-09', '1970-03-10', '1970-03-05', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e623cea60003', '2014-06-29 13:40:44', null, '1970-04-01', '1970-04-09', '1970-04-10', '1970-04-05', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e623cede0004', '2014-06-29 13:40:44', null, '1970-05-01', '1970-05-09', '1970-05-10', '1970-05-05', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e623cf0a0005', '2014-06-29 13:40:44', null, '1970-06-01', '1970-06-09', '1970-06-10', '1970-06-05', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e623d0130007', '2014-06-29 13:40:45', null, '1970-08-01', '1970-08-09', '1970-08-10', '1970-08-05', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e623d1660008', '2014-06-29 13:40:45', null, '1970-09-01', '1970-09-09', '1970-09-10', '1970-09-05', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e623d1c60009', '2014-06-29 13:40:45', null, '1970-10-01', '1970-10-09', '1970-10-10', '1970-10-05', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e623d1fe000a', '2014-06-29 13:40:45', null, '1970-11-01', '1970-11-09', '1970-11-10', '1970-11-05', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e623d236000b', '2014-06-29 13:40:45', null, '1970-12-01', '1970-12-09', '1970-12-10', '1970-12-05', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e6241047000c', '2014-06-29 13:41:01', null, '1970-01-12', '1970-01-19', '1970-01-20', '1970-01-16', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e6241096000d', '2014-06-29 13:41:01', null, '1970-02-12', '1970-02-19', '1970-02-20', '1970-02-16', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e62410c2000e', '2014-06-29 13:41:01', null, '1970-03-12', '1970-03-19', '1970-03-20', '1970-03-16', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e62410ed000f', '2014-06-29 13:41:01', null, '1970-04-12', '1970-04-19', '1970-04-20', '1970-04-16', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e62411190010', '2014-06-29 13:41:01', null, '1970-05-12', '1970-05-19', '1970-05-20', '1970-05-16', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e62411480011', '2014-06-29 13:41:01', null, '1970-06-12', '1970-06-19', '1970-06-20', '1970-06-16', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e62411740012', '2014-06-29 13:41:01', null, '1970-07-12', '1970-07-19', '1970-07-20', '1970-07-16', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e62411c20013', '2014-06-29 13:41:02', null, '1970-08-12', '1970-08-19', '1970-08-20', '1970-08-16', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e62411ed0014', '2014-06-29 13:41:02', null, '1970-09-12', '1970-09-19', '1970-09-20', '1970-09-16', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e624121b0015', '2014-06-29 13:41:02', null, '1970-10-12', '1970-10-19', '1970-10-20', '1970-10-16', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e62412520016', '2014-06-29 13:41:02', null, '1970-11-12', '1970-11-19', '1970-11-20', '1970-11-16', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e6228d0146e624127d0017', '2014-06-29 13:41:02', null, '1970-12-12', '1970-12-19', '1970-12-20', '1970-12-16', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e7f3cc0146e7f4cde60001', '2014-06-29 22:08:38', null, '1970-01-01', '1970-01-14', '1970-01-15', '1970-01-09', '402881f446e7f3cc0146e7f47b990000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e7f3cc0146e7f6b14f0002', '2014-06-29 22:10:42', null, '1970-05-29', '1970-07-09', '1970-07-10', '1970-07-04', '402881f446e60ffb0146e61091f10000');
INSERT INTO `bs_business_remind` VALUES ('402881f446e7fe520146e7ff01120000', '2014-06-29 22:19:47', null, '1970-06-24', '1970-07-03', '1970-07-10', '1970-06-30', '402881f446e7f3cc0146e7f47b990000');

-- ----------------------------
-- Table structure for `bs_business_xfqcwh`
-- ----------------------------
DROP TABLE IF EXISTS `bs_business_xfqcwh`;
CREATE TABLE `bs_business_xfqcwh` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `BZ` varchar(255) DEFAULT NULL,
  `CJC` varchar(255) DEFAULT NULL,
  `JC` date DEFAULT NULL,
  `MC` varchar(255) DEFAULT NULL,
  `QK` varchar(255) DEFAULT NULL,
  `RQ` date DEFAULT NULL,
  `SL` int(11) DEFAULT NULL,
  `BUSINESS_FORM_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`),
  KEY `FK32886DC26EEDC3B8` (`BUSINESS_FORM_ID`),
  CONSTRAINT `FK32886DC26EEDC3B8` FOREIGN KEY (`BUSINESS_FORM_ID`) REFERENCES `bs_business_form` (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_business_xfqcwh
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_business_zcdygk`
-- ----------------------------
DROP TABLE IF EXISTS `bs_business_zcdygk`;
CREATE TABLE `bs_business_zcdygk` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `BZ` varchar(255) DEFAULT NULL,
  `CSNY` datetime DEFAULT NULL,
  `IDCARD` varchar(255) DEFAULT NULL,
  `JTZZ` varchar(255) DEFAULT NULL,
  `RDNY` datetime DEFAULT NULL,
  `WHCD` varchar(255) DEFAULT NULL,
  `XB` varchar(255) DEFAULT NULL,
  `XM` varchar(255) DEFAULT NULL,
  `BUSINESS_FORM_ID` varchar(255) DEFAULT NULL,
  `PERSON_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`),
  KEY `FK35C240536EEDC3B8` (`BUSINESS_FORM_ID`),
  KEY `FK35C24053F8471802` (`PERSON_ID`),
  CONSTRAINT `FK35C240536EEDC3B8` FOREIGN KEY (`BUSINESS_FORM_ID`) REFERENCES `bs_business_form` (`PID`),
  CONSTRAINT `FK35C24053F8471802` FOREIGN KEY (`PERSON_ID`) REFERENCES `bs_person` (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_business_zcdygk
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_dictionary`
-- ----------------------------
DROP TABLE IF EXISTS `bs_dictionary`;
CREATE TABLE `bs_dictionary` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_dictionary
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_log`
-- ----------------------------
DROP TABLE IF EXISTS `bs_log`;
CREATE TABLE `bs_log` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `MESSAGE` varchar(255) DEFAULT NULL,
  `TIME` datetime DEFAULT NULL,
  `URL` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_log
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_organization`
-- ----------------------------
DROP TABLE IF EXISTS `bs_organization`;
CREATE TABLE `bs_organization` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `GRADE` varchar(255) DEFAULT NULL,
  `LEVEL` int(11) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `TYPE` int(11) DEFAULT NULL,
  `PARENT_ID` varchar(255) DEFAULT NULL,
  `DELETED` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`PID`),
  KEY `FKA5849661203DF975` (`PARENT_ID`),
  CONSTRAINT `FKA5849661203DF975` FOREIGN KEY (`PARENT_ID`) REFERENCES `bs_organization` (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_organization
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_person`
-- ----------------------------
DROP TABLE IF EXISTS `bs_person`;
CREATE TABLE `bs_person` (
  `PID` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) DEFAULT NULL,
  `BIRTHDAY` varchar(255) DEFAULT NULL,
  `CARDID` varchar(255) DEFAULT NULL,
  `CQSJ` varchar(255) DEFAULT NULL,
  `EDUCATION` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `FOLK` varchar(255) DEFAULT NULL,
  `GZDW` varchar(255) DEFAULT NULL,
  `HABIT` varchar(255) DEFAULT NULL,
  `HEALTH` varchar(255) DEFAULT NULL,
  `HH` varchar(255) DEFAULT NULL,
  `HJDSSJW` varchar(255) DEFAULT NULL,
  `HJDZ` varchar(255) DEFAULT NULL,
  `HKXZ` varchar(255) DEFAULT NULL,
  `HYZK` varchar(255) DEFAULT NULL,
  `JD` varchar(255) DEFAULT NULL,
  `JIASHIID` varchar(255) DEFAULT NULL,
  `JZDSSJW` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `SEX` varchar(255) DEFAULT NULL,
  `SFTJ` varchar(255) DEFAULT NULL,
  `SSJW` varchar(255) DEFAULT NULL,
  `TEL` varchar(255) DEFAULT NULL,
  `WLRK` varchar(255) DEFAULT NULL,
  `XZQH` varchar(255) DEFAULT NULL,
  `ZW` varchar(255) DEFAULT NULL,
  `ZZMM` varchar(255) DEFAULT NULL,
  `ENDUPDATEDATE` date DEFAULT NULL,
  `FORM` int(11) DEFAULT NULL,
  `STARTUPDATEDATE` date DEFAULT NULL,
  `USERID` varchar(255) DEFAULT NULL,
  `insertDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_person
-- ----------------------------
INSERT INTO `bs_person` VALUES ('402881f446e7d8880146e7e038fb0001', null, '2014-02-03', '332624198610183151', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '房东', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, null);
INSERT INTO `bs_person` VALUES ('402881f446e7d8880146e7e038fb0002', null, '2014-03-03', '332624198610183152', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '速度', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, null);
INSERT INTO `bs_person` VALUES ('402881f446e7d8880146e7e038fb0003', null, '2014-04-05', '332624198610183153', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '多少', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, null);
INSERT INTO `bs_person` VALUES ('402881f446e7d8880146e7e038fb0004', null, '2014-05-06', '332624198610183154', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '多少', '女', null, null, null, null, null, null, null, null, '1', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `bs_person_confirm`
-- ----------------------------
DROP TABLE IF EXISTS `bs_person_confirm`;
CREATE TABLE `bs_person_confirm` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `PERSONSYID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`),
  KEY `FK2F0C198444C60FD9` (`PERSONSYID`),
  CONSTRAINT `FK2F0C198444C60FD9` FOREIGN KEY (`PERSONSYID`) REFERENCES `bs_person_sy` (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_person_confirm
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_person_sy`
-- ----------------------------
DROP TABLE IF EXISTS `bs_person_sy`;
CREATE TABLE `bs_person_sy` (
  `PID` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) DEFAULT NULL,
  `BIRTHDAY` varchar(255) DEFAULT NULL,
  `CARDID` varchar(255) DEFAULT NULL,
  `CQSJ` varchar(255) DEFAULT NULL,
  `EDUCATION` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `FOLK` varchar(255) DEFAULT NULL,
  `GZDW` varchar(255) DEFAULT NULL,
  `HABIT` varchar(255) DEFAULT NULL,
  `HEALTH` varchar(255) DEFAULT NULL,
  `HH` varchar(255) DEFAULT NULL,
  `HJDSSJW` varchar(255) DEFAULT NULL,
  `HJDZ` varchar(255) DEFAULT NULL,
  `HKXZ` varchar(255) DEFAULT NULL,
  `HYZK` varchar(255) DEFAULT NULL,
  `JD` varchar(255) DEFAULT NULL,
  `JIASHIID` varchar(255) DEFAULT NULL,
  `JZDSSJW` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `SEX` varchar(255) DEFAULT NULL,
  `SFTJ` varchar(255) DEFAULT NULL,
  `SSJW` varchar(255) DEFAULT NULL,
  `TEL` varchar(255) DEFAULT NULL,
  `WLRK` varchar(255) DEFAULT NULL,
  `XZQH` varchar(255) DEFAULT NULL,
  `ZW` varchar(255) DEFAULT NULL,
  `ZZMM` varchar(255) DEFAULT NULL,
  `insertDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_person_sy
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_person_update`
-- ----------------------------
DROP TABLE IF EXISTS `bs_person_update`;
CREATE TABLE `bs_person_update` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `ADDRESS` varchar(255) DEFAULT NULL,
  `BIRTHDAY` varchar(255) DEFAULT NULL,
  `CARDID` varchar(255) DEFAULT NULL,
  `CQSJ` varchar(255) DEFAULT NULL,
  `EDUCATION` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `FOLK` varchar(255) DEFAULT NULL,
  `GZDW` varchar(255) DEFAULT NULL,
  `HABIT` varchar(255) DEFAULT NULL,
  `HEALTH` varchar(255) DEFAULT NULL,
  `HH` varchar(255) DEFAULT NULL,
  `HJDSSJW` varchar(255) DEFAULT NULL,
  `HJDZ` varchar(255) DEFAULT NULL,
  `HKXZ` varchar(255) DEFAULT NULL,
  `HYZK` varchar(255) DEFAULT NULL,
  `JD` varchar(255) DEFAULT NULL,
  `JIASHIID` varchar(255) DEFAULT NULL,
  `JZDSSJW` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `SEX` varchar(255) DEFAULT NULL,
  `SFTJ` varchar(255) DEFAULT NULL,
  `SSJW` varchar(255) DEFAULT NULL,
  `TEL` varchar(255) DEFAULT NULL,
  `WLRK` varchar(255) DEFAULT NULL,
  `XZQH` varchar(255) DEFAULT NULL,
  `ZW` varchar(255) DEFAULT NULL,
  `ZZMM` varchar(255) DEFAULT NULL,
  `UPDATETIME` datetime DEFAULT NULL,
  `PERSONID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`),
  KEY `FK51D19D85DFD6A4ED` (`PERSONID`),
  CONSTRAINT `FK51D19D85DFD6A4ED` FOREIGN KEY (`PERSONID`) REFERENCES `bs_person` (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_person_update
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_resource`
-- ----------------------------
DROP TABLE IF EXISTS `bs_resource`;
CREATE TABLE `bs_resource` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `CODE` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_resource
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_role`
-- ----------------------------
DROP TABLE IF EXISTS `bs_role`;
CREATE TABLE `bs_role` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `CODE` varchar(255) DEFAULT NULL,
  `DELETED` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_role
-- ----------------------------
INSERT INTO `bs_role` VALUES ('4028800546fb36410146fb3678920000', '2014-07-03 15:53:09', null, null, '超级管理员', 'admin', '0');
INSERT INTO `bs_role` VALUES ('4028800546fb36410146fb3678ac0001', '2014-07-03 15:53:09', null, null, '区', 'qu', '0');
INSERT INTO `bs_role` VALUES ('4028800546fb36410146fb3678ac0002', '2014-07-03 15:53:09', null, null, '镇', 'zhen', '0');
INSERT INTO `bs_role` VALUES ('4028800546fb36410146fb3678ad0003', '2014-07-03 15:53:09', null, null, '居委干事', 'ganshi', '0');
INSERT INTO `bs_role` VALUES ('4028800546fb36410146fb3678ad0004', '2014-07-03 15:53:09', null, null, '居委书记', 'shuji', '0');
INSERT INTO `bs_role` VALUES ('4028800546fb36410146fb3899e0000d', '2014-07-03 15:55:29', '2014-07-03 15:55:32', '多少2', '多少2', null, '1');

-- ----------------------------
-- Table structure for `bs_role_authority`
-- ----------------------------
DROP TABLE IF EXISTS `bs_role_authority`;
CREATE TABLE `bs_role_authority` (
  `PID` varchar(255) NOT NULL,
  `AUTHORITY_ID` varchar(255) DEFAULT NULL,
  `ROLE_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`),
  KEY `FK89EEFC68C8AD30A8` (`AUTHORITY_ID`),
  KEY `FK89EEFC68749D036C` (`ROLE_ID`),
  CONSTRAINT `FK89EEFC68749D036C` FOREIGN KEY (`ROLE_ID`) REFERENCES `bs_role` (`PID`),
  CONSTRAINT `FK89EEFC68C8AD30A8` FOREIGN KEY (`AUTHORITY_ID`) REFERENCES `bs_authority` (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_role_authority
-- ----------------------------

-- ----------------------------
-- Table structure for `bs_user`
-- ----------------------------
DROP TABLE IF EXISTS `bs_user`;
CREATE TABLE `bs_user` (
  `PID` varchar(255) NOT NULL,
  `INSERT_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  `ADDRESS` varchar(255) DEFAULT NULL,
  `COMPANY` varchar(255) DEFAULT NULL,
  `DELETED` tinyint(1) DEFAULT NULL,
  `DEPARTMENT` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `FAX` varchar(255) DEFAULT NULL,
  `GENDER` varchar(255) DEFAULT NULL,
  `HOMEPHONE` varchar(255) DEFAULT NULL,
  `LASTLOGINTIME` datetime DEFAULT NULL,
  `LOGINCOUNT` int(11) DEFAULT NULL,
  `MOBILEPHONE` varchar(255) DEFAULT NULL,
  `OFFICE` varchar(255) DEFAULT NULL,
  `OFFICEPHONE` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  `REALNAME` varchar(255) DEFAULT NULL,
  `SORT` int(11) DEFAULT NULL,
  `USERNAME` varchar(255) DEFAULT NULL,
  `ORGANIZATION_ID` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`),
  KEY `FK9D1A2F9F3E7DC4C` (`ORGANIZATION_ID`),
  CONSTRAINT `FK9D1A2F9F3E7DC4C` FOREIGN KEY (`ORGANIZATION_ID`) REFERENCES `bs_organization` (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_user
-- ----------------------------
INSERT INTO `bs_user` VALUES ('4028800546fb36410146fb3678ad0005', '2014-07-03 15:53:09', null, null, null, '0', null, null, null, null, null, null, '0', null, null, null, '123456', '管理员', null, 'admin', null, null);
INSERT INTO `bs_user` VALUES ('4028800546fb36410146fb37ee6b0007', '2014-07-03 15:54:45', '2014-07-03 15:54:56', null, null, '1', null, null, null, null, null, null, '0', null, null, null, '123456', '倒萨的的', null, '11112', null, null);
INSERT INTO `bs_user` VALUES ('402881f446fbf95e0146fbfa22ae0000', '2014-07-03 19:26:52', '2014-07-03 19:26:52', null, null, '1', null, null, null, null, null, null, '0', null, null, null, '123456', '啊啊', null, 'aaa', null, null);
INSERT INTO `bs_user` VALUES ('402881f446fbf95e0146fbfac6d40001', '2014-07-03 19:27:34', null, null, null, '1', null, null, null, null, null, null, '0', null, null, null, '123456', '啊是', null, 'aaa', null, null);
INSERT INTO `bs_user` VALUES ('402881f446fbf95e0146fbfb81a40002', '2014-07-03 19:28:22', null, null, null, '0', null, null, null, null, null, null, '0', null, null, null, '123456', '居委会干事', null, 'gs', null, null);
INSERT INTO `bs_user` VALUES ('402881f446fbf95e0146fbfbdcfc0003', '2014-07-03 19:28:45', '2014-07-04 11:00:29', null, null, '0', null, null, null, null, null, null, '0', null, null, null, '123456', '一居委会书记', null, 'sj1', null, null);
INSERT INTO `bs_user` VALUES ('402881f446fbf95e0146fbfc1aae0004', '2014-07-03 19:29:01', '2014-07-03 21:22:29', null, null, '0', null, null, null, null, null, null, '0', null, null, null, '123456', '一居委会干事', null, 'gs1', null, null);
INSERT INTO `bs_user` VALUES ('402881f446fbf95e0146fbfc472a0005', '2014-07-03 19:29:12', null, null, null, '0', null, null, null, null, null, null, '0', null, null, null, '123456', '二居委会书记', null, 'sj2', null, null);
INSERT INTO `bs_user` VALUES ('402881f446fbf95e0146fbfc77220006', '2014-07-03 19:29:25', null, null, null, '0', null, null, null, null, null, null, '0', null, null, null, '123456', '二居委会干事', null, 'gs2', null, null);

-- ----------------------------
-- Table structure for `bs_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `bs_user_role`;
CREATE TABLE `bs_user_role` (
  `PID` varchar(255) NOT NULL,
  `ROLE_ID` varchar(255) DEFAULT NULL,
  `USER_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`),
  KEY `FK903A89FC749D036C` (`ROLE_ID`),
  KEY `FK903A89FC19C7C74C` (`USER_ID`),
  CONSTRAINT `FK903A89FC19C7C74C` FOREIGN KEY (`USER_ID`) REFERENCES `bs_user` (`PID`),
  CONSTRAINT `FK903A89FC749D036C` FOREIGN KEY (`ROLE_ID`) REFERENCES `bs_role` (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_user_role
-- ----------------------------
INSERT INTO `bs_user_role` VALUES ('4028800546fb36410146fb3679330006', '4028800546fb36410146fb3678920000', '4028800546fb36410146fb3678ad0005');
INSERT INTO `bs_user_role` VALUES ('4028800546fb36410146fb381c68000a', '4028800546fb36410146fb3678ad0004', '4028800546fb36410146fb37ee6b0007');
INSERT INTO `bs_user_role` VALUES ('4028800546fb36410146fb381c69000b', '4028800546fb36410146fb3678ad0003', '4028800546fb36410146fb37ee6b0007');
INSERT INTO `bs_user_role` VALUES ('4028800546fb36410146fb381c69000c', '4028800546fb36410146fb3678ac0002', '4028800546fb36410146fb37ee6b0007');
INSERT INTO `bs_user_role` VALUES ('4028800546ff50190146ff50e1cf0000', '4028800546fb36410146fb3678920000', '402881f446fbf95e0146fbfbdcfc0003');
INSERT INTO `bs_user_role` VALUES ('402881f446fc634b0146fc63fa7d0000', '4028800546fb36410146fb3678920000', '402881f446fbf95e0146fbfc1aae0004');
