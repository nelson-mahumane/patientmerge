package gov.mz.misau.sevice;

import java.util.List;

import gov.mz.misau.model.Patient;



public interface PatientService {	
	public Patient createorUpdatePatient(Patient Patient);
	public Patient findById(Integer Id);
	public List<Patient> findAll();
	public Patient findByGoldenId(Integer goldenId);	

}
