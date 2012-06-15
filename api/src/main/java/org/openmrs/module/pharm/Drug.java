package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

public class Drug extends BaseOpenmrsData {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer intgr) {
        this.id = intgr;
    }
}
