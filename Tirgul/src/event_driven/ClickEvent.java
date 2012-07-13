package event_driven;

public class ClickEvent {
	private int x,y;
	private Object source;
	
	public ClickEvent(int x, int y, Object source) {
		super();
		this.x = x;
		this.y = y;
		this.source = source;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Object getSource() {
		return source;
	}
	
	
	
}
