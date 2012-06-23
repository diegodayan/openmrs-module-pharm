/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;

/**
 *
 * @author Yan
 */
public interface StockTakeService extends OpenmrsService {
    
    public StockTake saveStockTake(StockTake st);
    
    public StockTake getStockTake(Integer id);
    
}
