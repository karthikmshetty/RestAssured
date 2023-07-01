package pojoClass_Package;

public class Serlz_Pojo_Nested_Object {
	
	String name;
	int age;
	int []phNo;
	Serlz_Pojo_Obj_Spouse spouse;	
	
	
	
	public Serlz_Pojo_Nested_Object(String name, int age,int []phNo, Serlz_Pojo_Obj_Spouse spouse) {
		this.name = name;
		this.age = age;
		this.phNo=phNo;
		this.spouse = spouse;
	}
	
	public Serlz_Pojo_Nested_Object()
	{
		
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



	/**
	 * @return the spouse
	 */
	public Serlz_Pojo_Obj_Spouse getSpouse() {
		return spouse;
	}

	/**
	 * @param spouse the spouse to set
	 */
	public void setSpouse(Serlz_Pojo_Obj_Spouse spouse) {
		this.spouse = spouse;
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
	
	
	

}
