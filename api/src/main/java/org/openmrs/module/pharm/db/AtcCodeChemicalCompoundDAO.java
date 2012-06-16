package org.openmrs.module.pharm.db;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.module.pharm.AtcCodeChemicalCompound;
import org.openmrs.module.pharm.AtcCodeChemicalCompoundService;

public interface AtcCodeChemicalCompoundDAO {

    AtcCodeChemicalCompound getAtcCodeChemicalCompound(Integer id);

    AtcCodeChemicalCompound saveAtcCodeChemicalCompound(AtcCodeChemicalCompound atccc);
}
