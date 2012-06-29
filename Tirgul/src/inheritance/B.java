package inheritance;

public class B extends A{
	
	public B(){
		this("Hello World");
	}
	
	public B(String str){
		super("From B");
		System.out.println("In B:"+str);
	}
	
	
	

}
