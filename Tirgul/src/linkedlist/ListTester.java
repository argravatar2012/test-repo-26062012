package linkedlist;

public class ListTester {

	public static void main(String[] args) {
		ListManager listManager = new ListManager();
		
		Book myBook = new Book();
		listManager.add(myBook);
		
		listManager.removeLast();
	}
}
