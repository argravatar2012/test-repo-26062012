package pets.hairy;

public class Mouse {

	private String name = "Mickey";
	
	public Mouse(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}


	public void suicide(){
		Cat killer = new Cat();
		killer.eatMouse(this);
	}
}
