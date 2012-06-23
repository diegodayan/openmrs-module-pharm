package org.openmrs.module.pharm.db;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.module.pharm.Alert;
import org.openmrs.module.pharm.AlertService;

/**
 * This is the DAO interface. This is never used by the developer, but instead
 * the {@link NoteService} calls it (and developers call the NoteService)
 */
public interface AlertDAO {

    Alert getAlert(Integer id);

    Alert saveAlert(Alert alert);
}
