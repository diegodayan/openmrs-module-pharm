package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.BaseOpenmrsData;
import org.openmrs.Patient;

// CREATE TABLE `pharm_campaign` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `description` varchar(255) DEFAULT NULL,
//   `duration` int(11) DEFAULT NULL,
//   `name` varchar(35) NOT NULL DEFAULT '',
//   `startdate` datetime DEFAULT NULL,
//   `status` varchar(20) NOT NULL DEFAULT '',
//   `timesperday` int(11) DEFAULT NULL,
//   `type` varchar(20) NOT NULL DEFAULT '',
//   `version` bigint(20) NOT NULL,
//   `mobilisrid` bigint(20) DEFAULT NULL,
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8
public class Campaign extends BaseOpenmrsData {

    private Integer id;
    private String description;
    private Integer duration;
    private String name;
    private Date startDate;
    private String status;
    private Integer timesPerDay;
    private String type;
    private Integer version;
    private Integer mobilisrid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTimesPerDay() {
        return timesPerDay;
    }

    public void setTimesPerDay(Integer timesPerDay) {
        this.timesPerDay = timesPerDay;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getMobilisrid() {
        return mobilisrid;
    }

    public void setMobilisrid(Integer mobilisrid) {
        this.mobilisrid = mobilisrid;
    }
}
