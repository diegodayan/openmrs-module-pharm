package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_atccode` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `name` varchar(255) NOT NULL,
//   `code` varchar(255) NOT NULL,
//   `mims` varchar(255) DEFAULT NULL,
//   PRIMARY KEY (`id`),
//   UNIQUE KEY `pharm_name` (`name`),
//   UNIQUE KEY `pharm_code` (`code`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8$$
public class AtcCode extends BaseOpenmrsData {

    private Integer id;
    private String name;
    private String code;
    private String mims;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMims() {
        return mims;
    }

    public void setMims(String mims) {
        this.mims = mims;
    }
}
