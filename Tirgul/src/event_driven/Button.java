package event_driven;

public class Button {
	private int x,y;
	private String text;
	
	ClickHandler[] handlers = new ClickHandler[5];
	
	public Button(int x, int y, String text) {
		super();
		this.x = x;
		this.y = y;
		this.text = text;
	}
	
	public void addClickHandler(ClickHandler clickHandler){
		
		for (int i = 0; i < handlers.length; i++) {
			if(handlers[i]==null){
				handlers[i] = clickHandler;
				break;
			}
		}
	}
	
	public void click(){
		ClickEvent event = new ClickEvent(x, y, this);
		for (int i = 0; i < handlers.length; i++) {
			if(handlers[i]!=null){
				handlers[i].onClick(event);
			}
		}
	}
	
	public void doubleClick(){
		ClickEvent event = new ClickEvent(x, y, this);
		for (int i = 0; i < handlers.length; i++) {
			if(handlers[i]!=null){
				handlers[i].onDoubleClick(event);
			}
		}
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
