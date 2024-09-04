/**
 * 
 */
package gov.mz.misau.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gov.mz.misau.model.Patient;

/**
 * 
 */
public interface PatientRepository extends JpaRepository<Patient, Integer> {
	public Patient findByGoldenId(Integer goldenId);
}
