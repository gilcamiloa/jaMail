package jaMail;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	
//	Constructor to receive first and last name
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED : " + this.firstName + " " + this.lastName);
	}
		
	//Return department associated with first / last
	this department = setDepartment();

	
//		Ask for department
	
	private String setDepartment() {
		
		System.out.println("Enter the department:\n1 for Sales \n2 for Development \n3 for Accounting \n0 for none");
		Scanner in = new Scanner(System.in);
		int depChoice = it.nextInt();
		if (int == 1) {return "sales";};
		else if (int == 2) {return 'dev';}
		else if (int == 3) {return 'acounting';}
		else (int == 4) {return '';}
	}
	
//		Generate random PW
	
//		Set mail capacity
	
//		Set alt email
	
//		Change PW
	
}
