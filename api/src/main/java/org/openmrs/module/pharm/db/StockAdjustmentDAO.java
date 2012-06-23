/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.StockAdjustment;

/**
 *
 * @author Yan
 */
public interface StockAdjustmentDAO {
    
    public StockAdjustment getStockAdjustment(Integer id);
    
    public StockAdjustment saveStockAdjustment(StockAdjustment sa);
    
}
