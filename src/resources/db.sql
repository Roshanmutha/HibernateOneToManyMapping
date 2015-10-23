CREATE TABLE `department` (
  `department_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=115 DEFAULT CHARSET=latin1;

CREATE TABLE `employee` (
  `employee_id` bigint(10) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(50) DEFAULT NULL,
  `lastname` varchar(50) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `cell_phone` varchar(15) DEFAULT NULL,
  `department_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `FK_DEPT` (`department_id`),
  CONSTRAINT `FK_DEPT` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
