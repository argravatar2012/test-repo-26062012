package linkedlist;

public class ListManager {
	private Book first; //Very important
	
	public void add(Book book){
		//Check if is first
		if(first == null){
			first = book;
			return;
		}
		
		Book currentBook = first;
		while(currentBook.getNextBook()!=null){
			currentBook = currentBook.getNextBook();
		}
		//current book is the last book
		currentBook.setNextBook(book);
		book.setNextBook(null);
				
	}
	
	public void removeLast(){
		
	}
}
