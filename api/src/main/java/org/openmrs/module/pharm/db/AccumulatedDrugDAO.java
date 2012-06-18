package org.openmrs.module.pharm.db;

import org.openmrs.Patient;
import org.openmrs.module.pharm.AccumulatedDrug;
import org.openmrs.module.pharm.AccumulatedDrugService;

/**
 * This is the DAO interface. This is never used by the developer, but instead
 * the {@link NoteService} calls it (and developers call the NoteService)
 */
public interface AccumulatedDrugDAO {

    AccumulatedDrug getAccumulatedDrug(Integer id);

    AccumulatedDrug saveAccumulatedDrug(AccumulatedDrug ad);
}
