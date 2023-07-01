package pojoClass_Package;

public class Serlz_Pojo_EmployeeWithArray {
	private String name;
	private int age;
	private int phNo[];
	
	
	
	public Serlz_Pojo_EmployeeWithArray(String name,int age,int phNo[])
	{
		this.name=name;
		this.age=age;
		this.phNo=phNo;
	}
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the phNo
	 */
	public int[] getPhNo() {
		return phNo;
	}
	/**
	 * @param phNo the phNo to set
	 */
	public void setPhNo(int[] phNo) {
		this.phNo = phNo;
	}
	
	public Serlz_Pojo_EmployeeWithArray()
	{
		
	}

}
