package inheritance;

public class Human extends Mammel{

	private int legs;
	
	public Human(){
		//Option 1
		super(2, 120, 80);
		
		//Option 2
		super.legs = 2;
		super.avgWeight = 80;
		super.maxAge = 120;
		
		//Option 3
		this.legs = 2;
		this.avgWeight = 80;
		this.maxAge = 120;
		
		//Option 4
		legs = 3;
		avgWeight = 80;
		maxAge = 120;

	}
	
	public void sayHello(){
		System.out.println("Shalom, I have "+super.legs+" legs!!!");
	}
}
