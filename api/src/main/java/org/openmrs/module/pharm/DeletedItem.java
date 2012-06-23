package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_deleteditem` (
// `id` int(4) NOT NULL AUTO_INCREMENT,
//  `deleteditemid` int(11) DEFAULT NULL,
//  `itemtype` varchar(255) DEFAULT NULL,
//  `invalid` tinyint(1) DEFAULT NULL,
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8$$
public class DeletedItem extends BaseOpenmrsData {

    private Integer id; // the primary key colum

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
