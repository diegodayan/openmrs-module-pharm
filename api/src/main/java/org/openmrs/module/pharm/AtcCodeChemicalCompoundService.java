package org.openmrs.module.pharm;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.AtcCodeChemicalCompoundServiceImpl;

public interface AtcCodeChemicalCompoundService extends OpenmrsService {

    public AtcCodeChemicalCompound saveAtcCodeChemicalCompound(AtcCodeChemicalCompound atccc);

    public AtcCodeChemicalCompound getAtcCodeChemicalCompound(Integer id);
}
