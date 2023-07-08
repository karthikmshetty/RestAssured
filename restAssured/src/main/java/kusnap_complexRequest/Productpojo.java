package kusnap_complexRequest;

import java.util.List;

public class Productpojo {
	
	private String category;
	private String subCategory;
	private String product;
	private String availability;
	private String manufacturer;
	List<Description> description;
	
	public Productpojo(String category, String subCategory, String product, String availability, String manufacturer,
			List<Description> description)
	{
		this.category = category;
		this.subCategory = subCategory;
		this.product = product;
		this.availability = availability;
		this.manufacturer = manufacturer;
		this.description = description;
	}
	

	
	

}
