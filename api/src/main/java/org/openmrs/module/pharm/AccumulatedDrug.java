package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_accumulateddrugs` (
//   `id` int(11) NOT NULL,
//   `withpackage` int(11) NOT NULL,
//   `pillcount` int(11) NOT NULL,
//   PRIMARY KEY (`id`),
//   KEY `pharm_pillcount_fkey` (`pillcount`),
//   CONSTRAINT `pharm_pillcount_fkey` FOREIGN KEY (`pillcount`) REFERENCES `pharm_pillcount` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8
/**
 *
 *
 */
public class AccumulatedDrug extends BaseOpenmrsData {

    private Integer id;
    private Integer withPackage;
    private Integer pillCount;

    public AccumulatedDrug() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWithPackage() {
        return withPackage;
    }

    public void setWithPackage(Integer withPackage) {
        this.withPackage = withPackage;
    }

    public Integer getPillCount() {
        return pillCount;
    }

    public void setPillCount(Integer pillCount) {
        this.pillCount = pillCount;
    }
}