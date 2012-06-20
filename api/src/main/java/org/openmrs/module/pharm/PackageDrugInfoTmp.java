package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_packagedruginfotmp` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `amountpertime` varchar(255) DEFAULT NULL,
//   `batchnumber` varchar(255) DEFAULT NULL,
//   `clinic` varchar(255) DEFAULT NULL,
//   `dispensedate` datetime DEFAULT NULL,
//   `dispensedqty` int(11) DEFAULT NULL,
//   `drugname` varchar(255) DEFAULT NULL,
//   `expirydate` datetime DEFAULT NULL,
//   `formlanguage1` varchar(255) DEFAULT NULL,
//   `formlanguage2` varchar(255) DEFAULT NULL,
//   `formlanguage3` varchar(255) DEFAULT NULL,
//   `notes` varchar(255) DEFAULT NULL,
//   `packageindex` int(11) DEFAULT NULL,
//   `patientid` varchar(255) DEFAULT NULL,
//   `patientfirstname` varchar(255) DEFAULT NULL,
//   `specialinstructions1` varchar(255) DEFAULT NULL,
//   `specialinstructions2` varchar(255) DEFAULT NULL,
//   `stockid` int(11) DEFAULT NULL,
//   `timesperday` int(11) DEFAULT NULL,
//   `cluser` int(11) NOT NULL,
//   `weekssupply` int(11) DEFAULT NULL,
//   `sidetreatment` tinyint(1) DEFAULT NULL,
//   `packageddrug` int(11) NOT NULL,
//   `invalid` tinyint(1) DEFAULT NULL,
//   `qtyinhand` varchar(255) DEFAULT NULL,
//   `summaryqtyinhand` varchar(255) DEFAULT NULL,
//   `qtyinlastbatch` varchar(255) DEFAULT NULL,
//   `patientlastname` varchar(255) DEFAULT NULL,
//   `prescriptionduration` int(11) DEFAULT NULL,
//   `dateexpectedstring` varchar(255) DEFAULT NULL,
//   `senttoekapa` tinyint(1) DEFAULT NULL,
//   `packageid` varchar(255) DEFAULT NULL,
//   `firstbatchinprintjob` tinyint(1) DEFAULT '0',
//   `numberoflabels` int(11) DEFAULT '0',
//   `dispensedforlaterpickup` tinyint(1) DEFAULT '0',
//   PRIMARY KEY (`id`),
//   KEY `pharm_packageddrugtmp_packageddrug` (`packageddrug`),
//   KEY `pharm_packageddrugtmp_cluser` (`cluser`),
//   CONSTRAINT `pharm_packageddrugtmp_cluser` FOREIGN KEY (`cluser`) REFERENCES `pharm_users` (`id`),
//   CONSTRAINT `pharm_packageddrugtmp_packageddrug` FOREIGN KEY (`packageddrug`) REFERENCES `pharm_packageddrugs` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class PackageDrugInfoTmp extends BaseOpenmrsData {

    private Integer id;
    private String amountPerTime;
    private String batchNumber;
    private String clinic;
    private Date dispenseDate;
    private Integer dispensedQty;
    private String drugName;
    private Date expiryDate;
    private String formLanguage1;
    private String formLanguage2;
    private String formLanguage3;    
    private String notes;
    private Integer packageIndex;
    private String patientId;
    private String patientFirstName;
    private String specialInstructions1;    
    private String specialInstructions2;
    private Integer stockId;
    private Integer timesPerDay;
    private Integer clUser;
    private Integer weeksSupply;
    private Byte sideTreatment;
    private Integer packagedDrug;    
    private Byte invalid;
    private String qtyInHand;
    private String summaryQtyInHand;
    private String qtyInLastBatch;
    private String patientLastName;
    private Integer prescriptionDuration;
    private String dateExpectedString;
    private Byte sentToEkapa;
    private String packageId;
    private Byte firstBatchInPrintJob;
    private String numberOfLabels;
    private Byte dispensedForLaterPickup;
    
    public PackageDrugInfoTmp() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAmountPerTime() {
        return amountPerTime;
    }

    public void setAmountPerTime(String amountPerTime) {
        this.amountPerTime = amountPerTime;
    }
    
    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }
    
    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }    

    public Date getDispenseDate() {
        return dispenseDate;
    }

    public void setDispenseDate(Date dispenseDate) {
        this.dispenseDate = dispenseDate;
    }    
    
    public Integer getDispensedQty() {
        return dispensedQty;
    }

    public void setDispensedQty(Integer dispensedQty) {
        this.dispensedQty = dispensedQty;
    }
    
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }    

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }        

    public String getFormLanguage1() {
        return formLanguage1;
    }

    public void setFormLanguage1(String formLanguage1) {
        this.formLanguage1 = formLanguage1;
    }
    
    public String getFormLanguage2() {
        return formLanguage2;
    }

    public void setFormLanguage2(String formLanguage2) {
        this.formLanguage2 = formLanguage2;
    }
    
    public String getFormLanguage3() {
        return formLanguage3;
    }

    public void setFormLanguage3(String formLanguage3) {
        this.formLanguage3 = formLanguage3;
    }    

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }    
    
    public Integer getPackageIndex() {
        return packageIndex;
    }

    public void setPackageIndex(Integer packageIndex) {
        this.packageIndex = packageIndex;
    }
    
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }    
    
    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }    
    
    public String getSpecialInstructions1() {
        return specialInstructions1;
    }

    public void setSpecialInstructions1(String specialInstructions1) {
        this.specialInstructions1 = specialInstructions1;
    }    
    
    public String getSpecialInstructions2() {
        return specialInstructions2;
    }

    public void setSpecialInstructions2(String specialInstructions2) {
        this.specialInstructions2 = specialInstructions2;
    }    
    
    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }    
    
    public Integer getTimesPerDay() {
        return timesPerDay;
    }

    public void setTimesPerDay(Integer timesPerDay) {
        this.timesPerDay = timesPerDay;
    }
    
    public Integer getClUser() {
        return clUser;
    }

    public void setClUser(Integer clUser) {
        this.clUser = clUser;
    }    
    
    public Integer getWeeksSupply() {
        return weeksSupply;
    }

    public void setWeeksSupply(Integer weeksSupply) {
        this.weeksSupply = weeksSupply;
    }
    
    public Byte getSideTreatment() {
        return sideTreatment;
    }

    public void setSideTreatment(Byte sideTreatment) {
        this.sideTreatment = sideTreatment;
    }    
    
    public Integer getPackagedDrug() {
        return packagedDrug;
    }

    public void setPackagedDrug(Integer packagedDrug) {
        this.packagedDrug = packagedDrug;
    }    

    public Byte getInvalid() {
        return invalid;
    }

    public void setInvalid(Byte invalid) {
        this.invalid = invalid;
    }    
    
    public String getQtyInHand() {
        return qtyInHand;
    }

    public void setQtyInHand(String qtyInHand) {
        this.qtyInHand = qtyInHand;
    }
    
    public String getSummaryQtyInHand() {
        return summaryQtyInHand;
    }

    public void setSummaryQtyInHand(String summaryQtyInHand) {
        this.summaryQtyInHand = summaryQtyInHand;
    }
    
    public String getQtyInLastBatch() {
        return qtyInLastBatch;
    }

    public void setQtyInLastBatch(String qtyInLastBatch) {
        this.qtyInLastBatch = qtyInLastBatch;
    }    
    
    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }    
    
    public Integer getPrescriptionDuration() {
        return prescriptionDuration;
    }

    public void setPrescriptionDuration(Integer prescriptionDuration) {
        this.prescriptionDuration = prescriptionDuration;
    }
    
    public String getDateExpectedString() {
        return dateExpectedString;
    }

    public void getDateExpectedString(String dateExpectedString) {
        this.dateExpectedString = dateExpectedString;
    }    
    
    public Byte getSentToEkapa() {
        return sentToEkapa;
    }

    public void setSentToEkapa(Byte sentToEkapa) {
        this.sentToEkapa = sentToEkapa;
    }    

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public Byte getFirstBatchInPrintJob() {
        return firstBatchInPrintJob;
    }

    public void setFirstBatchInPrintJob(Byte firstBatchInPrintJob) {
        this.firstBatchInPrintJob = firstBatchInPrintJob;
    }
    
    public String getNumberOfLabels() {
        return numberOfLabels;
    }

    public void setNumberOfLabels(String numberOfLabels) {
        this.numberOfLabels = numberOfLabels;
    }    

    public Byte getDispensedForLaterPickup() {
        return dispensedForLaterPickup;
    }

    public void setDispensedForLaterPickup(Byte dispensedForLaterPickup) {
        this.dispensedForLaterPickup = dispensedForLaterPickup;
    }    
}
