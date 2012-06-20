package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_nationalclinics` (
//   `id` int(11) NOT NULL,
//   `province` varchar(255) NOT NULL,
//   `district` varchar(255) NOT NULL,
//   `subdistrict` varchar(255) NOT NULL,
//   `facilityname` varchar(255) NOT NULL,
//   `facilitytype` varchar(255) NOT NULL,
//   PRIMARY KEY (`id`),
//   UNIQUE KEY `pharm_unique_facilities` (`facilityname`,`subdistrict`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class NationalClinics extends BaseOpenmrsData {

    private Integer id;
    private String province;
    private String district;
    private String subdistrict;
    private String facilityName;
    private String facilityType;
    
    public NationalClinics() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    
    public String getSubdistrict() {
        return subdistrict;
    }

    public void setSubdistrict(String subdistrict) {
        this.subdistrict = subdistrict;
    }
    
    public String getFacilityName() {
        return facilityName;
    }

    public void getFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }
    
    public String getFacilityType() {
        return facilityType;
    }

    public void getFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }
}
