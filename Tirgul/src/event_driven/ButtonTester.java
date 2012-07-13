package event_driven;

public class ButtonTester {

	public static void main(String[] args) {
		
		Button button = new Button(100, 300, "Click Me!");
		
		ClickHandler handler = new RegularClickHandler();
		
		button.addClickHandler(handler);
		button.addClickHandler(new OtherClickHandler());
		
		button.addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent clickEvent) {
				System.out.println("On Click - Anonimouse implementation -bla bla");
			}
			
			public void onDoubleClick(ClickEvent clickEvent) {
				System.out.println("On Double-Click - Anonimouse implementation -bla bla");
			}
			
		});
		
		button.click();
		
		//button.doubleClick();
		
	}
}
