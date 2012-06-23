/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.StockTake;

/**
 *
 * @author Yan
 */
public interface StockTakeDAO {
    
    public StockTake getStockTake(Integer id);
    
    public StockTake saveStockTake(StockTake st);
    
}
