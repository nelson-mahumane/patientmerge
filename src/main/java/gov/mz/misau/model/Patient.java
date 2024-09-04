/**
 * 
 */
package gov.mz.misau.model;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * 
 */
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String middleName;
	private String familyName;
	private Date  dateOfBirth;
	public enum Gender {

        M,F 
    }
	private Gender gender; 
	private String Contact;
	private int  goldenId;
	public Patient(String firstName, String middleName, String familyName, Date dateOfBirth, Gender gender,
			String contact) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.familyName = familyName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		Contact = contact;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public int getGoldenId() {
		return goldenId;
	}
	public void setGoldenId(int goldenId) {
		this.goldenId = goldenId;
	}
	
	
	

}
