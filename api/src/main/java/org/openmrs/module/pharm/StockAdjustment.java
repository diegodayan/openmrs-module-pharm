/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;

import java.util.Date;


//            CREATE TABLE `pharm_stockadjustment` (
//            `id` int(4) NOT NULL AUTO_INCREMENT,
//            `capturedate` datetime DEFAULT NULL,
//            `stock` int(11) NOT NULL,
//            `notes` varchar(255) DEFAULT NULL,
//            `stocktake` int(11) DEFAULT NULL,
//            `stockcount` int(11) DEFAULT NULL,
//            `adjustedvalue` int(11) DEFAULT NULL,
//            `finalised` tinyint(1) DEFAULT NULL,
//            PRIMARY KEY (`id`),
//            KEY `pharm_stocktake_fkey` (`stocktake`),
//            CONSTRAINT `pharm_stocktake_fkey` FOREIGN KEY (`stocktake`) REFERENCES `pharm_stocktake` (`id`)
//            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class StockAdjustment {
    
    private Integer id;
    private Date dateTime;
    private Stock stock;
    private Note notes;
    private StockTake stockTake;
    private Integer stockCount;
    private Integer adjustedValue;
    private Integer finalised;

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
     * @return the dateTime
     */
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime the dateTime to set
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @return the stock
     */
    public Stock getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(Stock stock) {
        this.stock = stock;
    }

    /**
     * @return the notes
     */
    public Note getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(Note notes) {
        this.notes = notes;
    }

    /**
     * @return the stockTake
     */
    public StockTake getStockTake() {
        return stockTake;
    }

    /**
     * @param stockTake the stockTake to set
     */
    public void setStockTake(StockTake stockTake) {
        this.stockTake = stockTake;
    }

    /**
     * @return the stockCount
     */
    public Integer getStockCount() {
        return stockCount;
    }

    /**
     * @param stockCount the stockCount to set
     */
    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    /**
     * @return the adjustedValue
     */
    public Integer getAdjustedValue() {
        return adjustedValue;
    }

    /**
     * @param adjustedValue the adjustedValue to set
     */
    public void setAdjustedValue(Integer adjustedValue) {
        this.adjustedValue = adjustedValue;
    }

    /**
     * @return the finalised
     */
    public Integer getFinalised() {
        return finalised;
    }

    /**
     * @param finalised the finalised to set
     */
    public void setFinalised(Integer finalised) {
        this.finalised = finalised;
    }
    
}
