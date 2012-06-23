/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;

import java.util.Date;


//            CREATE TABLE `pharm_stock` (
//            `id` int(4) NOT NULL AUTO_INCREMENT,
//            `drug` int(11) NOT NULL,
//            `batchnumber` varchar(255) DEFAULT NULL,
//            `datereceived` datetime DEFAULT NULL,
//            `stockcenter` int(11) NOT NULL,
//            `expirydate` datetime DEFAULT NULL,
//            `modified` char(1) DEFAULT NULL,
//            `shelfnumber` varchar(255) DEFAULT NULL,
//            `unitsreceived` int(11) DEFAULT NULL,
//            `manufacturer` varchar(255) DEFAULT NULL,
//            `hasunitsremaining` char(1) DEFAULT NULL,
//            `unitprice` decimal(10,2) DEFAULT NULL,
//            PRIMARY KEY (`id`),
//            KEY `pharm_stock_drug` (`drug`),
//            KEY `pharm_stock_stockcenter_fkey` (`stockcenter`),
//            CONSTRAINT `pharm_stock_drug` FOREIGN KEY (`drug`) REFERENCES `pharm_drug` (`id`),
//            CONSTRAINT `pharm_stock_stockcenter_fkey` FOREIGN KEY (`stockcenter`) REFERENCES `pharm_stockcenter` (`id`)
//            ) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class Stock {
    
    private Integer id;
    private Integer unitsReceived;
    private Drug drug;
    private String batchNumber;
    private String modified;
    private String shelfNumber;    
    private String manufacturer;
    private String hasUnitsRemaining;    
    private Date dateReceived;
    private Date expiryDate;
    private StockCenter stockCenter;
    private Double unitPrice;

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
     * @return the unitsReceived
     */
    public Integer getUnitsReceived() {
        return unitsReceived;
    }

    /**
     * @param unitsReceived the unitsReceived to set
     */
    public void setUnitsReceived(Integer unitsReceived) {
        this.unitsReceived = unitsReceived;
    }

    /**
     * @return the drug
     */
    public Drug getDrug() {
        return drug;
    }

    /**
     * @param drug the drug to set
     */
    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    /**
     * @return the batchNumber
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * @param batchNumber the batchNumber to set
     */
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    /**
     * @return the modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * @param modified the modified to set
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * @return the shelfNumber
     */
    public String getShelfNumber() {
        return shelfNumber;
    }

    /**
     * @param shelfNumber the shelfNumber to set
     */
    public void setShelfNumber(String shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the hasUnitsRemaining
     */
    public String getHasUnitsRemaining() {
        return hasUnitsRemaining;
    }

    /**
     * @param hasUnitsRemaining the hasUnitsRemaining to set
     */
    public void setHasUnitsRemaining(String hasUnitsRemaining) {
        this.hasUnitsRemaining = hasUnitsRemaining;
    }

    /**
     * @return the dateReceived
     */
    public Date getDateReceived() {
        return dateReceived;
    }

    /**
     * @param dateReceived the dateReceived to set
     */
    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    /**
     * @return the expiryDate
     */
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate the expiryDate to set
     */
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return the stockCenter
     */
    public StockCenter getStockCenter() {
        return stockCenter;
    }

    /**
     * @param stockCenter the stockCenter to set
     */
    public void setStockCenter(StockCenter stockCenter) {
        this.stockCenter = stockCenter;
    }

    /**
     * @return the unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
}
