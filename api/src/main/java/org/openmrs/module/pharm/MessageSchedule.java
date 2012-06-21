package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_messageschedule` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `description` varchar(255) DEFAULT NULL,
//   `messagetype` varchar(255) NOT NULL,
//   `scheduledate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
//   `daystoschedule` int(11) DEFAULT NULL,
//   `scheduledsuccessfully` tinyint(1) DEFAULT '1',
//   `senttoalerts` tinyint(1) DEFAULT '0',
//   `messagenumber` int(11) DEFAULT NULL,
//   `language` varchar(50) DEFAULT NULL,
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class MessageSchedule extends BaseOpenmrsData {

    private Integer id;
    private String description;
    private String messageType;
    private Date scheduleDate;
    private Integer daysToSchedule;
    private Byte scheduleSuccessfully;    
    private Byte sendToAlerts;    
    private Integer messageNumber;
    private String language;
    
    public MessageSchedule() {
    }

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
    
    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }    
    
    public Integer getDaysToSchedule() {
        return daysToSchedule;
    }

    public void setDaysToSchedule(Integer daysToSchedule) {
        this.daysToSchedule = daysToSchedule;
    }
    
    public Byte getScheduleSuccessfully() {
        return scheduleSuccessfully;
    }

    public void setScheduleSuccessfully(Byte scheduleSuccessfully) {
        this.scheduleSuccessfully = scheduleSuccessfully;
    }    
    
    public Byte getSendToAlerts() {
        return sendToAlerts;
    }

    public void setSendToAlerts(Byte sendToAlerts) {
        this.sendToAlerts = sendToAlerts;
    }    
    
    public Integer getMessageNumber() {
        return messageNumber;
    }

    public void setMessageNumber(Integer messageNumber) {
        this.messageNumber = messageNumber;
    }
    
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
