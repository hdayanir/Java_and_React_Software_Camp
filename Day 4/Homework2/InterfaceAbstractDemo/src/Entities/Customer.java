package Entities;
import Abstract.Entity;

public class Customer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String nationalyid;
	
	public Customer(int id, String firstName, String lastName, String dateOfBirth, String nationalyid) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalyid = nationalyid;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalyid() {
		return nationalyid;
	}

	public void setNationalyid(String nationalyid) {
		this.nationalyid = nationalyid;
	}

	public Customer() {
		//super();
	}

	
	

	
	
	
}
