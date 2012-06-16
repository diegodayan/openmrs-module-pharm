package org.openmrs.module.pharm.db;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.module.pharm.ChemicalDrugStrength;
import org.openmrs.module.pharm.ChemicalDrugStrengthService;

public interface ChemicalDrugStrengthDAO {

    ChemicalDrugStrength getChemicalDrugStrength(Integer id);

    ChemicalDrugStrength saveChemicalDrugStrength(ChemicalDrugStrength cds);
}
