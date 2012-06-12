package org.openmrs.module.pharm.db;

import java.util.List;

import org.openmrs.Patient;
import org.openmrs.module.pharm.PharmDrug;
import org.openmrs.module.pharm.PharmDrugService;

/**
 * This is the DAO interface. This is never used by the developer, but instead
 * the {@link NoteService} calls it (and developers call the NoteService)
 */
public interface PharmDrugDAO {

    PharmDrug getPharmDrug(Integer id);

    PharmDrug getPharmDrugByUuid(String uuid);

    List<PharmDrug> getPharmDrugs(Patient patient);

    PharmDrug savePharmDrug(PharmDrug note);

    PharmDrug deletePharmDrug(PharmDrug note);
}
