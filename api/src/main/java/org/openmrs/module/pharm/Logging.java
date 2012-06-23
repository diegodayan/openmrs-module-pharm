package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_logging` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `itemid` varchar(255) DEFAULT NULL,
//   `modified` char(1) DEFAULT NULL,
//   `transactiondate` datetime DEFAULT NULL,
//   `transactiontype` varchar(255) DEFAULT NULL,
//   `idart_user` int(11) NOT NULL,
//   `message` varchar(255) DEFAULT NULL,
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class Logging extends BaseOpenmrsData {

    private Integer id;
    private String itemId;
    private String modified;
    private Date transactionDate;
    private String transactionType;
    private Integer idartUser;
    private String message;
    
    public Logging() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }
    
    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }    
    
    public Integer getIdartUser() {
        return idartUser;
    }

    public void setIdartUser(Integer idartUser) {
        this.idartUser = idartUser;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
