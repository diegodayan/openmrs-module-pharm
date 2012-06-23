package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_databasechangelog` (
//   `ID` varchar(63) NOT NULL,
//   `AUTHOR` varchar(63) NOT NULL,
//   `FILENAME` varchar(200) NOT NULL,
//   `DATEEXECUTED` datetime NOT NULL,
//   `ORDEREXECUTED` int(11) NOT NULL,
//   `EXECTYPE` varchar(10) NOT NULL,
//   `MD5SUM` varchar(35) DEFAULT NULL,
//   `DESCRIPTION` varchar(255) DEFAULT NULL,
//   `COMMENTS` varchar(255) DEFAULT NULL,
//   `TAG` varchar(255) DEFAULT NULL,
//   `LIQUIBASE` varchar(20) DEFAULT NULL,
//   PRIMARY KEY (`ID`,`AUTHOR`,`FILENAME`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8$$
public class DatabaseChangeLog extends BaseOpenmrsData {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
