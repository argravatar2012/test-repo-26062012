package equals;

public class Tester {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setAuthor("Moshe");
		b1.setTitle("My great life");
		b1.setContent("Once upon a time ...");
		b1.setNumOfPages(669);
		
		Book b2 = new Book();
		b2.setAuthor("Moshe");
		b2.setTitle("My great life");
		b2.setContent("Once upon a time ...");
		b2.setNumOfPages(800);
		
		boolean isEqual = b1 == b2;
		System.out.println("isEqual="+isEqual);
		
		isEqual = b1.equals(b2);
		System.out.println("equals()="+isEqual);
		
	}
}
