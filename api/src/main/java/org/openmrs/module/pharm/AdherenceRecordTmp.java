package org.openmrs.module.pharm;

import java.util.Date;

// CREATE TABLE `pharm_adherencerecordtmp` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `adherencereason` varchar(255) DEFAULT NULL,
//   `countdate` datetime DEFAULT NULL,
//   `dayscarriedover` int(11) DEFAULT NULL,
//   `daysinhand` int(11) DEFAULT NULL,
//   `dayssincevisit` int(11) DEFAULT NULL,
//   `dayssupplied` int(11) DEFAULT NULL,
//   `pawcno` varchar(255) DEFAULT NULL,
//   `pillcountid` int(11) DEFAULT NULL,
//   `cluser` varchar(255) DEFAULT NULL,
//   `invalid` tinyint(1) DEFAULT NULL,
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8$$
/**
 *
 * @author Diego Dayan
 */
public class AdherenceRecordTmp {

    private Integer id;
    private String adherenceReason;
    private String pawcno;
    private String cluser;
    private Date countDate;
    private Integer daysCarriedOver;
    private Integer daysInHand;
    private Integer daysSinceVisit;
    private Integer daysSupplied;
    private Integer pillCountId;
    private Integer invalid;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the adherenceReason
     */
    public String getAdherenceReason() {
        return adherenceReason;
    }

    /**
     * @param adherenceReason the adherenceReason to set
     */
    public void setAdherenceReason(String adherenceReason) {
        this.adherenceReason = adherenceReason;
    }

    /**
     * @return the countDate
     */
    public Date getCountDate() {
        return countDate;
    }

    /**
     * @param countDate the countDate to set
     */
    public void setCountDate(Date countDate) {
        this.countDate = countDate;
    }

    /**
     * @return the daysCarriedOver
     */
    public Integer getDaysCarriedOver() {
        return daysCarriedOver;
    }

    /**
     * @param daysCarriedOver the daysCarriedOver to set
     */
    public void setDaysCarriedOver(Integer daysCarriedOver) {
        this.daysCarriedOver = daysCarriedOver;
    }

    /**
     * @return the daysInHand
     */
    public Integer getDaysInHand() {
        return daysInHand;
    }

    /**
     * @param daysInHand the daysInHand to set
     */
    public void setDaysInHand(Integer daysInHand) {
        this.daysInHand = daysInHand;
    }

    /**
     * @return the daysSinceVisit
     */
    public Integer getDaysSinceVisit() {
        return daysSinceVisit;
    }

    /**
     * @param daysSinceVisit the daysSinceVisit to set
     */
    public void setDaysSinceVisit(Integer daysSinceVisit) {
        this.daysSinceVisit = daysSinceVisit;
    }

    /**
     * @return the daysSupplied
     */
    public Integer getDaysSupplied() {
        return daysSupplied;
    }

    /**
     * @param daysSupplied the daysSupplied to set
     */
    public void setDaysSupplied(Integer daysSupplied) {
        this.daysSupplied = daysSupplied;
    }

    /**
     * @return the pawcno
     */
    public String getPawcno() {
        return pawcno;
    }

    /**
     * @param pawcno the pawcno to set
     */
    public void setPawcno(String pawcno) {
        this.pawcno = pawcno;
    }

    /**
     * @return the pillCountId
     */
    public Integer getPillCountId() {
        return pillCountId;
    }

    /**
     * @param pillCountId the pillCountId to set
     */
    public void setPillCountId(Integer pillCountId) {
        this.pillCountId = pillCountId;
    }

    /**
     * @return the cluser
     */
    public String getCluser() {
        return cluser;
    }

    /**
     * @param cluser the cluser to set
     */
    public void setCluser(String cluser) {
        this.cluser = cluser;
    }

    /**
     * @return the invalid
     */
    public Integer getInvalid() {
        return invalid;
    }

    /**
     * @param invalid the invalid to set
     */
    public void setInvalid(Integer invalid) {
        this.invalid = invalid;
    }
}
