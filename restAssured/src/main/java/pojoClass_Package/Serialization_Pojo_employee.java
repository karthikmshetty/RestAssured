package pojoClass_Package;

public class Serialization_Pojo_employee {
	private String name;
	private int salary;
	private int age;
	
	public Serialization_Pojo_employee(String name,int salary,int age)
	{
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	
	//To trigger the de-serialization
	public Serialization_Pojo_employee()
	{		
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
	
	
		
	}
	


