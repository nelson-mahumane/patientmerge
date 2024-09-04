package gov.mz.misau.util;

import gov.mz.misau.model.Patient;



public class ProbabilityCalculator {
		
	public static int calc(Patient p1, Patient p2) {
		int probability=0;
		    if(p1.getFirstName().equalsIgnoreCase(p2.getFirstName())
			&& p1.getFamilyName().equalsIgnoreCase(p2.getFamilyName())
			&& p1.getMiddleName().equalsIgnoreCase(p2.getMiddleName())
			&& p1.getGender().equals(p2.getGender())
			&& p1.getDateOfBirth().compareTo(p2.getDateOfBirth())==0
			&& p1.getContact().equals(p2.getContact()))
		    	probability=10;
		    else if(p1.getFirstName().equalsIgnoreCase(p2.getFirstName())
			&& p1.getFamilyName().equalsIgnoreCase(p2.getFamilyName())
			&& p1.getMiddleName().equalsIgnoreCase(p2.getMiddleName())
			&& p1.getGender().equals(p2.getGender())
			&& p1.getDateOfBirth().compareTo(p2.getDateOfBirth())==0)
		    	probability=8;
		    	
		    else if(p1.getFirstName().equalsIgnoreCase(p2.getFirstName())
					&& p1.getFamilyName().equalsIgnoreCase(p2.getFamilyName())
					&& p1.getMiddleName().equalsIgnoreCase(p2.getMiddleName())
					&& p1.getGender().equals(p2.getGender()))
					
				    	probability=7;
		    else if(p1.getFirstName().equalsIgnoreCase(p2.getFirstName())
					&& p1.getFamilyName().equalsIgnoreCase(p2.getFamilyName())
					&& p1.getMiddleName().equalsIgnoreCase(p2.getMiddleName()))
		    	probability=5;
		    
		    else if(p1.getFirstName().equalsIgnoreCase(p2.getFirstName())
					&& p1.getFamilyName().equalsIgnoreCase(p2.getFamilyName()))
		    	probability=3;
		    
		    else if(p1.getFirstName().equalsIgnoreCase(p2.getFirstName()))
		    	probability=1;
		    
		    
		  				
		
		return probability;
	}
	
	

}
