package com.emailApplication;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String email;
	private String alternativeemail;
	private int defaultPassowrdLength = 10;
	private String company = "Eknon";
	private String password;
	private String department;
	private int mailCapacity= 500;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		

		System.out.println("Creating Email for " + this.firstName + " " + this.lastName);

		// print the department name
		this.department = employeeDepartment();
		System.out.println("Department is:- " + this.department);
		// print the email address

		System.out.println("New email created: " + this.firstName.toLowerCase() + "." + this.lastName.toLowerCase()
				+ "@" + this.department.toLowerCase() + "." + company.toLowerCase() + ".com");
		// set random password

		this.password = empPassword(defaultPassowrdLength);
		System.out.println("your temporary password is:- " + this.password);
		
	

	}

	// getting input by the department and select the department
	public String employeeDepartment() {

		System.out.println("Please select the department");
		System.out.println("Please select number:\n1 for Sales department\n2 for Development\n3 for Accounting"
				+ "\n0 for no department");
		Scanner scan = new Scanner(System.in);
		
		int selectDepartment = scan.nextInt();
		
		//if (selectDepartment == 0) {return "NO Email";	}

		if (selectDepartment == 1) {return "Sales";}
		else if (selectDepartment == 2) {return "Development";	}
		else if (selectDepartment == 3) {	return "Accounting ";}
		else { return "wrong code";}
		
	}

	// generate random passcode

	private String empPassword(int length) {

		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordset.length());
			password[i] = passwordset.charAt(random);

		}
		return new String(password);
	}
	
	// set email capacity
	
	public void setmailboxcapacity (int capacity) {
		this.mailCapacity = capacity;
		
		
	}
	
	// set alternative email
	
	public void setChangeEmail(String altEmail) {
		this.alternativeemail = altEmail;
	}
	
	public void setChangePassword(String password) {
		this.password = password;
			
	}
	
	public int getmailboxcapacity() { return mailCapacity;}
	public String getAlternativeEmail() { return alternativeemail;}
	public String getPassword () {return password;}
	

}
