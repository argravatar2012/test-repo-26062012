package event_driven;

public class RegularClickHandler implements ClickHandler{

	public void onClick(ClickEvent clickEvent) {
		System.out.println("Handeling Click");
	}

	public void onDoubleClick(ClickEvent clickEvent) {
		System.out.println("Handeling Double-Click");
	}

}
