package pojo_Class_Complex;

public class Adress {

	
	private String dNo;
    private	String street;
	private String city;
	
	public Adress(String dNo, String street, String city) 
	{
		this.dNo = dNo;
		this.street = street;
		this.city = city;
	}

	/**
	 * @return the dNo
	 */
	public String getdNo() {
		return dNo;
	}

	/**
	 * @param dNo the dNo to set
	 */
	public void setdNo(String dNo) {
		this.dNo = dNo;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
