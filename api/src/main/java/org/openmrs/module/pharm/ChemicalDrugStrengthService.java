package org.openmrs.module.pharm;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.ChemicalDrugStrengthServiceImpl;

public interface ChemicalDrugStrengthService extends OpenmrsService {

    public ChemicalDrugStrength saveChemicalDrugStrength(ChemicalDrugStrength cds);

    public ChemicalDrugStrength getChemicalDrugStrength(Integer id);
}
