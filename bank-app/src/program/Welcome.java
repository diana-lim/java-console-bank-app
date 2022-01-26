package program;

import java.util.Scanner;

public class Welcome {
	
	Welcome()
	{
		
	}
	
	public void welcomeDisplay() 
	{
		System.out.println("Welcome to Bank of Diana!");
		System.out.println("\n");
		System.out.println("Please select an option below:");
		System.out.println("\n");
		System.out.println("A: Register");
		System.out.println("B: Login");
		
		
		char response;
		Scanner scanner = new Scanner(System.in);
		response = scanner.next().charAt(0);
		
		switch(response)
		{
		
		case 'A':
			Register user = new Register();
			user.displayRegister();
			break;
			
		case 'B':
			Login users = new Login();
			users.displayLogin();
			break;
		
		default:
			System.out.println("Please enter a valid option:");
			//There might be an issue after this default.
			//How do I direct the user back to the prompt?	
		}
		
		Welcome welcome = new Welcome();
		
	}

}
