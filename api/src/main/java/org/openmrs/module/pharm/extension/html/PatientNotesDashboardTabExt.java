package org.openmrs.module.pharm.extension.html;

import org.openmrs.module.Extension;
import org.openmrs.module.web.extension.PatientDashboardTabExt;

public class PatientNotesDashboardTabExt extends PatientDashboardTabExt {

    @Override
    public Extension.MEDIA_TYPE getMediaType() {
        return Extension.MEDIA_TYPE.html;
    }

    @Override
    public String getPortletUrl() {
        return "patientNotes";
    }

    @Override
    public String getRequiredPrivilege() {
        return "Patient Dashboard - View Example Section";
    }

    @Override
    public String getTabId() {
        return "PatientNotes";
    }

    @Override
    public String getTabName() {
        return "Notes";
    }
}
