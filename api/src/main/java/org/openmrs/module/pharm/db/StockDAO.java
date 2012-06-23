/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.Stock;

/**
 *
 * @author Yan
 */
public interface StockDAO {
    
    public Stock getStock(Integer id);
    
    public Stock saveStock(Stock stock);
    
}
