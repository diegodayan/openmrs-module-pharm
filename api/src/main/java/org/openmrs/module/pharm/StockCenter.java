/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;


//            CREATE TABLE `pharm_stockcenter` (
//            `id` int(4) NOT NULL AUTO_INCREMENT,
//            `stockcentername` varchar(255) DEFAULT NULL,
//            `preferred` tinyint(1) DEFAULT NULL,
//            PRIMARY KEY (`id`),
//            UNIQUE KEY `pharm_unique_stockcentername` (`stockcentername`)
//            ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class StockCenter {
    
    private Integer id;
    private String stockCenterName;
    private Integer preferred;

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
     * @return the stockCenterName
     */
    public String getStockCenterName() {
        return stockCenterName;
    }

    /**
     * @param stockCenterName the stockCenterName to set
     */
    public void setStockCenterName(String stockCenterName) {
        this.stockCenterName = stockCenterName;
    }

    /**
     * @return the preferred
     */
    public Integer getPerferred() {
        return preferred;
    }

    /**
     * @param perferred the preferred to set
     */
    public void setPerferred(Integer perferred) {
        this.preferred = perferred;
    }
    
    
}
