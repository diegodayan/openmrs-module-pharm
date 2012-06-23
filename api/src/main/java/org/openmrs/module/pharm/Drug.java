package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_drug` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `form` int(11) NOT NULL,
//   `dispensinginstructions1` varchar(255) DEFAULT NULL,
//   `dispensinginstructions2` varchar(255) DEFAULT NULL,
//   `modified` char(1) DEFAULT NULL,
//   `name` varchar(255) DEFAULT NULL,
//   `packsize` int(11) DEFAULT NULL,
//   `sidetreatment` char(1) DEFAULT NULL,
//   `defaultamnt` double DEFAULT NULL,
//   `defaulttimes` int(11) DEFAULT NULL,
//   `stockcode` varchar(50) DEFAULT NULL,
//   `atccode_id` int(11) DEFAULT NULL,
//   PRIMARY KEY (`id`),
//   KEY `pharm_drug_form` (`form`),
//   KEY `pharm_fk_drug_atccode` (`atccode_id`),
//   CONSTRAINT `pharm_drug_form` FOREIGN KEY (`form`) REFERENCES `pharm_form` (`id`),
//   CONSTRAINT `pharm_fk_drug_atccode` FOREIGN KEY (`atccode_id`) REFERENCES `pharm_atccode` (`id`)
//   ) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class Drug extends BaseOpenmrsData {

    private Integer id;
    private Integer form;
    private String dispensingInstructions1;
    private String dispensingInstructions2;
    private String modified;
    private String name;
    private Integer packSize;
    private String sideTreatment;
    private Double defaultAmnt;
    private Integer defaultTimes;
    private String stockCode;
    private Integer atcCodeId;  

    public Drug() {
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getForm() {
        return form;
    }

    public void setForm(Integer form) {
        this.form = form;
    }    
    
    public String getDispensingInstructions1() {
        return dispensingInstructions1;
    }

    public void setDispensingInstructions1(String dispensingInstructions1) {
        this.dispensingInstructions1 = dispensingInstructions1;
    }    
    
    public String getDispensingInstructions2() {
        return dispensingInstructions2;
    }

    public void setDispensingInstructions2(String dispensingInstructions2) {
        this.dispensingInstructions2 = dispensingInstructions2;
    }    

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;    
    }
    
    public Integer getPackSize() {
        return packSize;
    }

    public void setPackSize(Integer packSize) {
        this.packSize = packSize;
    }
    
    public void setSideTreatment(String sideTreatment) {
        this.sideTreatment = sideTreatment;
    }

    public String getSideTreatment() {
        return sideTreatment;
    }    

    public Double getDefaultAmount() {
        return defaultAmnt;
    }

    public void setDefaultAmount(Double defaultAmnt) {
        this.defaultAmnt = defaultAmnt;
    }    

    public Integer getDefaultTimes() {
        return defaultTimes;
    }

    public void setDefaultTimes(Integer defaultTimes) {
        this.defaultTimes = defaultTimes;
    }    
    
    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;    
    }
    
    public Integer getAtcCodeId() {
        return atcCodeId;
    }

    public void setAtcCodeId(Integer atcCodeId) {
        this.atcCodeId = atcCodeId;
    }    
}