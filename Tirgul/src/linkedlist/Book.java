package linkedlist;

public class Book {

	private String title;
	private String auther;
	private int price;
	
	private Book nextBook = null;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book getNextBook() {
		return nextBook;
	}
	public void setNextBook(Book nextBook) {
		this.nextBook = nextBook;
	}
	
}
