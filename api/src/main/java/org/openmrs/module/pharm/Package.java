package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_package` (
//   `id` int(11) NOT NULL,
//   `dateleft` datetime DEFAULT NULL,
//   `datereceived` datetime DEFAULT NULL,
//   `modified` char(1) DEFAULT NULL,
//   `packageid` varchar(255) DEFAULT NULL,
//   `packdate` datetime DEFAULT NULL,
//   `pickupdate` datetime DEFAULT NULL,
//   `prescription` int(11) DEFAULT NULL,
//   `weekssupply` int(11) DEFAULT NULL,
//   `datereturned` datetime DEFAULT NULL,
//   `stockreturned` tinyint(1) DEFAULT NULL,
//   `packagereturned` tinyint(1) DEFAULT NULL,
//   `reasonforpackagereturn` varchar(255) DEFAULT NULL,
//   `clinic` int(11) DEFAULT NULL,
//   `drugtypes` varchar(20) DEFAULT NULL,
//   PRIMARY KEY (`id`),
//   KEY `pharm_package_clinic_fkey` (`clinic`),
//   CONSTRAINT `pharm_package_clinic_fkey` FOREIGN KEY (`clinic`) REFERENCES `pharm_clinic` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class Package extends BaseOpenmrsData {

    private Integer id;
    private Date dateLeft;
    private Date dateReceived;
    private String modified;    
    private String packageId;
    private Date packageDate;
    private Date pickupDate;
    private Integer prescription;
    private Integer weeksSupply;
    private Date dateReturned;
    private Byte stockReturned;    
    private Byte packageReturned;    
    private String reasonForPackageReturn;
    private Integer clinic;
    private String drugTypes;
    
    public Package() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateLeft() {
        return dateLeft;
    }

    public void setDateLeft(Date dateLeft) {
        this.dateLeft = dateLeft;
    }    
    
    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }    
    
    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public Date getPackageDate() {
        return packageDate;
    }

    public void setPackageDate(Date packageDate) {
        this.packageDate = packageDate;
    }    
    
    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }    
    
    public Integer getPresciption() {
        return prescription;
    }

    public void setPrescription(Integer prescription) {
        this.prescription = prescription;
    }

    public Integer getWeeksSupply() {
        return weeksSupply;
    }

    public void setWeeksSupply(Integer weeksSupply) {
        this.weeksSupply = weeksSupply;
    }
    
    public Date getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }    
    
    public Byte getStockReturned() {
        return stockReturned;
    }

    public void setStockReturned(Byte stockReturned) {
        this.stockReturned = stockReturned;
    }    
    
    public Byte getPackageReturned() {
        return packageReturned;
    }

    public void setPackageReturned(Byte packageReturned) {
        this.packageReturned = packageReturned;
    }    
    
    public String getReasonForPackageReturn() {
        return reasonForPackageReturn;
    }

    public void setReasonForPackageReturn(String reasonForPackageReturn) {
        this.reasonForPackageReturn = reasonForPackageReturn;
    }
    
    public Integer getClinic() {
        return clinic;
    }

    public void setClinic(Integer clinic) {
        this.clinic = clinic;
    }
    
    public String getDrugTypes() {
        return drugTypes;
    }

    public void getDrugTypes(String drugTypes) {
        this.drugTypes = drugTypes;
    }
}
