package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_alerts` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `alertmessage` varchar(255) NOT NULL,
//   `alerttype` varchar(255) NOT NULL,
//   `alertdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
//   `void` tinyint(1) DEFAULT NULL,
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8
/**
 * The object that represents one row in our patientnotes table. This object is
 * used to get data out and to put data into the database via the
 * {@link NoteService} class. <br/> <br/> See the /metadata/Note.hbm.xml file
 * for the mapping from this file to the database table. <br/> <br/>
 *
 */
public class Alert extends BaseOpenmrsData {

    private Integer id;
    private String alertMessage;
    private String alertType;
    private Date alertDate;
    private Integer isVoid;

    public Alert() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlertMessage() {
        return alertMessage;
    }

    public void setAlertMessage(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public Date getAlertDate() {
        return alertDate;
    }

    public void setAlertDate(Date alertDate) {
        this.alertDate = alertDate;
    }

    public Integer getIsVoid() {
        return isVoid;
    }

    public void setIsVoid(Integer isVoid) {
        this.isVoid = isVoid;
    }
}
