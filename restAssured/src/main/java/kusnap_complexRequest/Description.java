package kusnap_complexRequest;

public class Description {
	
	private String features;
	private String color[];
	private int price;
	
	public Description(String features, String[] color, int price) {
		this.features = features;
		this.color = color;
		this.price = price;
	}

	/**
	 * @return the features
	 */
	public String getFeatures() {
		return features;
	}

	/**
	 * @param features the features to set
	 */
	public void setFeatures(String features) {
		this.features = features;
	}

	/**
	 * @return the color
	 */
	public String[] getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String[] color) {
		this.color = color;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
