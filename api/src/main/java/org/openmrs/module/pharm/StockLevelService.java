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
public interface StockLevelService extends OpenmrsService {
    
    public StockLevel saveStockLevel(StockLevel sl);
    
    public StockLevel getStockLevel(Integer id);
    
}
