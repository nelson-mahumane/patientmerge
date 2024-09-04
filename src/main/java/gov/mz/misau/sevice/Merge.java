package gov.mz.misau.sevice;

import java.util.List;

import gov.mz.misau.model.Patient;

public interface Merge {
	
public List<Patient> mergeForOne(Patient patient, List<Patient> patients);
public List<Patient> mergeForAll(List<Patient> patients);

}
