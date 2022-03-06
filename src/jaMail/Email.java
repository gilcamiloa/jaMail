package jaMail;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	
	
//	Constructor to receive first and last name
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED : " + this.firstName + " " + this.lastName);
		
	//Return department associated with first / last
	this.department = setDepartment();
	System.out.println("Department: " + this.department);
	
	//Call a method that returns a random password
	this.password = randomPassword(defaultPasswordLength);
	System.out.println("Your password is " + this.password);
	
	}
//		Ask for department
	
	private String setDepartment() {
		
		System.out.println("DEPARTMENT CODES \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \n\nEnter the department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "dev";}
		else if (depChoice == 3) {return "acounting";}
		else {return "";}
	}
	
//		Generate random PW
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+=-";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			System.out.println(rand);
			System.out.println(passwordSet.charAt(rand));
			
		}
		return new String(password);
	}
	
//		Set mail capacity
	
//		Set alt email
	
//		Change PW
	
}
