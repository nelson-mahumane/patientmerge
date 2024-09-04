package gov.mz.misau.sevice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import gov.mz.misau.model.Patient;
import gov.mz.misau.util.ProbabilityCalculator;

@Service
public class MergeIm implements Merge{
	public static final int AVERAGE=5;
	
	public List<Patient> mergeForOne(Patient patient, List<Patient> patients){		
		List<Patient> mergedPatients=new ArrayList<>();
		mergedPatients.add(patient);
		
		for(Patient patientList: patients) {
			
		if(ProbabilityCalculator.calc(patient,patientList)>AVERAGE) {
			patientList.setGoldenId(patient.getId());
			mergedPatients.add(patientList);
		}
		}
				
		return mergedPatients;
	}
	
	public List<Patient> mergeForAll(List<Patient> patients){
		List<Patient> mergedPatients=new ArrayList<>();
		
		for (Patient patient1 : patients) {
			
			for (Patient patient2 : patients) {
				
				if(ProbabilityCalculator.calc(patient1, patient2)>AVERAGE && !mergedPatients.contains(patient2)) {
					patient2.setGoldenId(patient1.getId());	
				mergedPatients.add(patient2);
				}
			}
			
		}
			
		
		return mergedPatients;
}
}