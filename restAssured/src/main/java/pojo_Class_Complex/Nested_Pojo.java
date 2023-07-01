package pojo_Class_Complex;

import java.util.List;

public class Nested_Pojo {

	
	String []name;
	String []email;
	int empId;
	int phone;
	int salary;
	Adress adress;
	List<Spouse> spouses;
	
	public Nested_Pojo(String[] name, String[] email, int empId, int phone, int salary, Adress adress, List<Spouse> spouses) 
	{

		this.name = name;
		this.email = email;
		this.empId = empId;
		this.phone = phone;
		this.salary = salary;
		this.adress = adress;
		this.spouses = spouses;
	}

	/**
	 * @return the name
	 */
	public String[] getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String[] name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String[] getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String[] email) 
	{
		this.email = email;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the phone
	 */
	public int getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the adress
	 */
	public Adress getAdress() {
		return adress;
	}

	/**
	 * @param adress the adress to set
	 */
	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	/**
	 * @return the spouse
	 */
	public List<Spouse> getSpouse() {
		return spouses;
	}

	/**
	 * @param spouse the spouse to set
	 */
	public void setSpouse(List<Spouse> spouses) {
		this.spouses = spouses;
	}
	
	
	
}
