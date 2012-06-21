package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_patient` (
//   `id` int(11) NOT NULL,
//   `accountstatus` tinyint(1) DEFAULT NULL,
//   `cellphone` varchar(255) DEFAULT NULL,
//   `dateofbirth` datetime DEFAULT NULL,
//   `clinic` int(11) NOT NULL,
//   `firstnames` varchar(255) DEFAULT NULL,
//   `homephone` varchar(255) DEFAULT NULL,
//   `lastname` varchar(255) DEFAULT NULL,
//   `modified` char(1) DEFAULT NULL,
//   `patientid` varchar(255) NOT NULL,
//   `province` varchar(255) DEFAULT NULL,
//   `sex` char(1) DEFAULT NULL,
//   `workphone` varchar(255) DEFAULT NULL,
//   `address1` varchar(255) DEFAULT NULL,
//   `address2` varchar(255) DEFAULT NULL,
//   `address3` varchar(255) DEFAULT NULL,
//   `nextofkinname` varchar(255) DEFAULT NULL,
//   `nextofkinphone` varchar(255) DEFAULT NULL,
//   `race` varchar(255) DEFAULT NULL,
//   PRIMARY KEY (`id`),
//   KEY `pharm_patient_clinic` (`clinic`),
//   CONSTRAINT `pharm_patient_clinic` FOREIGN KEY (`clinic`) REFERENCES `pharm_clinic` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class Patient extends BaseOpenmrsData {

    private Integer id;
    private Byte accountStatus;    
    private String cellPhone;
    private Date dateOfBirth;
    private Integer clinic;
    private String firstNames;    
    private String homePhone;
    private String lastName;    
    private String modified;    
    private String patientId;
    private String province;
    private String sex;
    private String workPhone;
    private String address1;
    private String address2;
    private String address3;    
    private String nextOfKinName;
    private String nextOfKinPhone;    
    private String race;
    
    public Patient() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Byte accountStatus) {
        this.accountStatus = accountStatus;
    }    
        
    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public Integer getClinic() {
        return clinic;
    }

    public void setClinic(Integer clinic) {
        this.clinic = clinic;
    }    

    public String getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }    

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }    
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }
    
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void getWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }
    
    public String getAddress1() {
        return address1;
    }

    public void getAddress1(String address1) {
        this.address1 = address1;
    }
    
    public String getAddress2() {
        return address2;
    }

    public void getAddress2(String address2) {
        this.address2 = address2;
    }
    
    public String getAddress3() {
        return address3;
    }

    public void getAddress3(String address3) {
        this.address3 = address3;
    }
    
    public String getNextOfKinName() {
        return nextOfKinName;
    }

    public void setNextOfKinName(String nextOfKinName) {
        this.nextOfKinName = nextOfKinName;
    }

    public String getNextOfKinPhone() {
        return nextOfKinPhone;
    }

    public void getNextOfKinPhone(String nextOfKinPhone) {
        this.nextOfKinPhone = nextOfKinPhone;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
