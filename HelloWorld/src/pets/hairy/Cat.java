package pets.hairy;

public class Cat {

	
	private int age; //This is the cat's age in years
	private String name;
	
	public Cat(){
		/*
		 * עברית בהערות זה חולירע
		 */
		System.out.println("Creating new Cat");
	}
	
	public Cat(int defaultAge){
		System.out.println("Creating new Cat with [int] age:"+defaultAge);
		setAge(defaultAge);
	}
	public Cat(int defaultAge, String name){
		System.out.println("Creating new Cat with [int] age:"+defaultAge);
		setAge(defaultAge);
		this.name = name;
	}
	
	public Cat(Cat c){
		this.age = c.age;
		this.name = c.name;
	}
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int a) {
		age = a;
	}
	
	public void eatMouse(Mouse mouse){
		System.out.println("Yummmmm - eating "+mouse.getName());
	}
	
}
