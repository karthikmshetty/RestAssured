package genericUtility;

import java.util.Random;

public class JavaUtility {
	
	public int random()
	{
		Random ran = new Random();
		int ranNum=ran.nextInt(500);
		return ranNum;
	}

}
