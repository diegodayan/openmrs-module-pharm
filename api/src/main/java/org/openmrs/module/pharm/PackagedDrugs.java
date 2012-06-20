package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_packageddrugs` (
//   `id` int(11) NOT NULL,
//   `amount` int(11) DEFAULT NULL,
//   `stock` int(11) NOT NULL,
//   `parentpackage` int(11) NOT NULL,
//   `modified` char(1) DEFAULT NULL,
//   `packageddrugsindex` int(11) DEFAULT NULL,
//   PRIMARY KEY (`id`),
//   KEY `pharm_package_parent` (`parentpackage`),
//   CONSTRAINT `pharm_package_parent` FOREIGN KEY (`parentpackage`) REFERENCES `pharm_package` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class PackagedDrugs extends BaseOpenmrsData {

    private Integer id;
    private Integer amount;
    private Integer stock;
    private Integer parentPackage;
    private String modified;
    private Integer packagedDrugsIndex;
    
    public PackagedDrugs() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
    public Integer getParentPackage() {
        return parentPackage;
    }

    public void setParentPackage(Integer parentPackage) {
        this.parentPackage = parentPackage;
    }
    
    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public Integer getPackagedDrugsIndex() {
        return packagedDrugsIndex;
    }

    public void setPackagedDrugsIndex(Integer packagedDrugsIndex) {
        this.packagedDrugsIndex = packagedDrugsIndex;
    }
}
