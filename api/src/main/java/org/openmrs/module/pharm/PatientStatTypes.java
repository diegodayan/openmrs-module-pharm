package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_patientstattypes` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `statname` varchar(30) DEFAULT NULL,
//   `statformat` varchar(1) DEFAULT NULL,
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class PatientStatTypes extends BaseOpenmrsData {

    private Integer id;
    private String statName;
    private String statFormat;
    
    public PatientStatTypes() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }
    
    public String getStatFormat() {
        return statFormat;
    }

    public void setStatFormat(String statFormat) {
        this.statFormat = statFormat;
    }
}
