package gov.mz.misau.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import gov.mz.misau.model.Patient;
/**
 * Generate a datasource for CSV excel for jasper report
 */
public class ListGenerator {
	
	public static List patientDataMap(List<Patient> patients) {
			
		ArrayList listMap = new ArrayList();
		for(Patient patient: patients) {
			 HashMap map = new HashMap();
		map.put("firstName", patient.getFirstName()) ;
		map.put("middleName", patient.getMiddleName());
		map.put("familyName", patient.getFamilyName());
		map.put("gender", patient.getGender());
		map.put("contact", patient.getContact());
		map.put("dateOfBirth", patient.getDateOfBirth());
		map.put("goldenId", patient.getGoldenId());
		map.put("id", patient.getId());
		listMap.add(map);	
		}
			
		return listMap;
	}

}
