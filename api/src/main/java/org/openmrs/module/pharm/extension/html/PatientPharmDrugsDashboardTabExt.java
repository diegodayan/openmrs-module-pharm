package org.openmrs.module.pharm.extension.html;

import org.openmrs.module.Extension;
import org.openmrs.module.web.extension.PatientDashboardTabExt;

public class PatientPharmDrugsDashboardTabExt extends PatientDashboardTabExt {

    @Override
    public Extension.MEDIA_TYPE getMediaType() {
        return Extension.MEDIA_TYPE.html;
    }

    @Override
    public String getPortletUrl() {
        return "patientPharmDrugs";
    }

    @Override
    public String getRequiredPrivilege() {
        return "Patient Dashboard - View Example Section";
    }

    @Override
    public String getTabId() {
        return "PatientPharmDrugs";
    }

    @Override
    public String getTabName() {
        return "PharmDrug";
    }
}
