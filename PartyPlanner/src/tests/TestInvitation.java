package tests;

import party.Invitation;

public class TestInvitation {

	public static void main(String[] args) {
		Invitation invitation = new Invitation("Assaf", "Moshe");
		invitation.setLocation("Hanamal");
		invitation.setDay(2);
		invitation.setMonth(7);
		invitation.setYear(2012);
		invitation.setFee(250.5F);
		//invitation.print();
		
		invitation.setDiscount();
		
		int random = (int)(Math.random()*11);
		System.out.println(invitation);
	}
}
