/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;

import java.util.Date;


//            CREATE TABLE `pharm_stocktake` (
//            `id` int(4) NOT NULL AUTO_INCREMENT,
//            `enddate` datetime DEFAULT NULL,
//            `startdate` datetime DEFAULT NULL,
//            `stocktakenumber` varchar(255) DEFAULT NULL,
//            `open` tinyint(1) DEFAULT NULL,
//            PRIMARY KEY (`id`)
//            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class StockTake {
    
    private Integer id;
    private Date endDate;
    private Date startDate;
    private String stockTakeNumber;
    private Integer open;

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
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the stockTakeNumber
     */
    public String getStockTakeNumber() {
        return stockTakeNumber;
    }

    /**
     * @param stockTakeNumber the stockTakeNumber to set
     */
    public void setStockTakeNumber(String stockTakeNumber) {
        this.stockTakeNumber = stockTakeNumber;
    }

    /**
     * @return the open
     */
    public Integer getOpen() {
        return open;
    }

    /**
     * @param open the open to set
     */
    public void setOpen(Integer open) {
        this.open = open;
    }
    
}
