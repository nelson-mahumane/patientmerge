package gov.mz.misau.sevice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import gov.mz.misau.model.Patient;
import gov.mz.misau.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{
	
	
	@Autowired
	private PatientRepository patientRepo;
	public Patient createorUpdatePatient(Patient patient) {
		
		return patientRepo.save(patient);
	}
	public Patient findById(Integer Id) {
		
		Optional <Patient> patient =patientRepo.findById(Id);
		return patient.get();
	}
	
	public List<Patient> findAll(){
		
		return patientRepo.findAll();
	}
	public Patient findByGoldenId(Integer goldenId) {
		
		return patientRepo.findByGoldenId(goldenId);
	}	

}
