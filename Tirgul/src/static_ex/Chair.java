package static_ex;

public class Chair {

	private String color;
	
	private static int numOfChairs = 0;
	public static final int MIN_PRICE = 100;
	
	public Chair(){
		//Count instances
		Chair.numOfChairs++;
	}
	public Chair(String color){
		this();
		this.color = color;
	}
	
	public static int getNumOfChairs(){
		return numOfChairs;
	}
	
}
