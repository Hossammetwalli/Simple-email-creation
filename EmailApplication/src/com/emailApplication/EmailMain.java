package com.emailApplication;

public class EmailMain {

	public static void main(String[] args) {
		Email mail = new Email("John", "Smith");
		mail.setChangeEmail("Hossam.Metwalli@eknon.com");
		System.out.println(mail.getAlternativeEmail());
		mail.setChangePassword("Hossam123");
		System.out.println();
		

	}

}
