package program;

import java.util.Scanner;

public class Login {

	void Login()
	{
		
	}
	
	void displayLogin()
	{
		try(Scanner scanner = new Scanner(System.in)){
			
			System.out.println("----------------------");
			System.out.println("Logging in as an employee or a customer?");
			System.out.println("\n");
			System.out.println("A: Employee");
			System.out.println("B: Customer");
			String accntType = scanner.nextLine();
			
			System.out.println("Username: ");
			String uname = scanner.nextLine();
			
			System.out.println("Password: ");
			String password = scanner.nextLine();
			
			
			
			if("B".equals(accntType) && "dlim".equals(uname) && "password".equals(password)) {
				
				BankAccount user = new BankAccount();
				user.accountDisplay();
				
			}
			else if("A".equals(accntType) && "dlim".equals(uname) && "password".equals(password)) {
				
				EmployeePortal employee = new EmployeePortal();
				employee.portalDisplay();
			}
			else {
				System.out.println("Invalid credentials. Please press Enter try again.");
				String read = scanner.nextLine();
				Login backTo = new Login();
				backTo.displayLogin();
			}
		}
		
//		System.out.println("---------------------------");
//		System.out.println("Please login below:");
//		System.out.println("\n");
//		System.out.println("Username:");
//		String uname;
//		Scanner scanner = new Scanner(System.in);
//		uname = scanner.next();
//		System.out.println("Password:");
//		String password;
//		Scanner scanner2 = new Scanner(System.in);
//		password = scanner2.next();
	}
}
