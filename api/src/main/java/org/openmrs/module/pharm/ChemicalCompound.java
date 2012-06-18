package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_chemicalcompound` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `name` varchar(255) NOT NULL,
//   `acronym` varchar(255) DEFAULT NULL,
//   PRIMARY KEY (`id`),
//   UNIQUE KEY `pharm_name` (`name`),
//   UNIQUE KEY `pharm_acronym` (`acronym`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8
public class ChemicalCompound extends BaseOpenmrsData {

    private Integer id;
    private String name;
    private String acronym;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }
}
