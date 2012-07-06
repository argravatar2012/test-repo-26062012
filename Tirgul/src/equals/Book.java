package equals;

public class Book {

	private String author;
	private String title;
	private String content;
	private int numOfPages;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getNumOfPages() {
		return numOfPages;
	}
	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(!(obj instanceof Book)){
			return false;
		}
		Book otherBook = (Book)obj;
		if(this.author.equals(otherBook.getAuthor()) &&
				this.title.equals(otherBook.getTitle())){
			return true;
		}
		
		
		
		
		return false;
	}
}
