package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;
// CREATE TABLE `pharm_databasechangeloglock` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `LOCKED` tinyint(1) NOT NULL,
//   `LOCKGRANTED` datetime DEFAULT NULL,
//   `LOCKEDBY` varchar(255) DEFAULT NULL,
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8$$
public class DatabaseChangeLogLock extends BaseOpenmrsData {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
