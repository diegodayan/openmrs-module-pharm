package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_doctor` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `emailaddress` varchar(255) DEFAULT NULL,
//   `firstname` varchar(255) DEFAULT NULL,
//   `lastname` varchar(255) DEFAULT NULL,
//   `mobileno` varchar(255) DEFAULT NULL,
//   `modified` char(1) DEFAULT NULL,
//   `telephoneno` varchar(255) DEFAULT NULL,
//   `active` tinyint(1) DEFAULT NULL,
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class Doctor extends BaseOpenmrsData {

    private Integer id;
    private String emailAddress;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String modified;
    private String telephoneNo;
    private Byte active;
    
    public Doctor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getMobileNo() {
        return mobileNo;
    }

    public void getMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    
    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }    
    
    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }    
}
