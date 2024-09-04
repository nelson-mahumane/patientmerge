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
		
		for(Patient patientList: patients) {
			
		if(ProbabilityCalculator.calc(patient,patientList)>AVERAGE)
			patientList.setGoldenId(patient.getId());
			mergedPatients.add(patientList);
			
		}
				
		return mergedPatients;
	}
	
	public List<Patient> mergeForAll(List<Patient> patients){
		
		
		
		return new ArrayList();

}
}