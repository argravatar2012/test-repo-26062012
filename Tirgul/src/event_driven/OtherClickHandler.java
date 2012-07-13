package event_driven;

public class OtherClickHandler implements ClickHandler{

	public void onClick(ClickEvent clickEvent) {
		if(clickEvent.getSource() instanceof Button){
			Button b = (Button) clickEvent.getSource();
			System.out.println(b.getText());
			System.out.println(b.getX()*b.getY());
		}
	}

	public void onDoubleClick(ClickEvent clickEvent) {
		// TODO Auto-generated method stub
		
	}

}
