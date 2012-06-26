public class Person
{
	private int height = 180;	
	private int weight;	
	private int age = 25;
	private String name = "Assaf";
	
	public void sayHi()
	{
		System.out.println("Hi!");
	}
	
	public void setAge(int a){
		age = a;	
	}
	
	public int getAge(){
		doInternal();
		return age;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	
	private void doInternal(){
		
	}
}
