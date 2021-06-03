package Assignment1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HopeSoupKitchen hsk = new HopeSoupKitchen("Hope Soup Kitchen");
		HopeSoupKitchen soupkitchen = new HopeSoupKitchen("Jalan Sultanah, Alor Setar", "04123456789");
		HopeSoupKitchen info = new HopeSoupKitchen();
		
		System.out.print("Login in as:"
				+ "\n1. User"
				+ "\n2. Admin"
				+ "\nEnter your choice: ");
		int login = sc.nextInt();
		
		if (login == 1)
		{
	
			ProgramDescription program = new ProgramDescription();
			ProgramDescription program1 = new ProgramDescription("Soup Kitchen", "Jalan Sultanah, Alor Setar", "9am until 8pm", "Monday to Saturday");
			program1.printMenu();
			ProgramDescription program2 = new ProgramDescription("Hope Virtual Run", "Home or anywhere you are", "10am until 1pm", "Saturday");
			ProgramDescription p2 = new ProgramDescription("17 July 2021", 10);
			
			System.out.print("Which action would you like to proceed:"
					+ "\n1. Registering for program Soup Kitchen"
					+ "\n2. Registering for program Hope Virtual Run"
					+ "\n3. Donating"
					+ "\nEnter action: ");
			int action = sc.nextInt();
			User user = new User();
			
			if(action == 1) {
			
				user.printMenu();
				System.out.print("Enter day: ");
				String day = sc.next();
				System.out.print("Enter session: ");
				int session = sc.nextInt();
				User participant1 = new User(day, session);
				System.out.println("\n----------------------------------------------------------------"
						+ "\nRegistered Details: ");
				
				System.out.println("Name: " +user.userName);
				System.out.println("Contact number: " +user.contactNumber);
				System.out.println("Email: " +user.email);
				System.out.println("Day: " +participant1.day);
				System.out.println("Session: " +participant1.session);
				
			}
			
			else if(action == 2) {
				double fee = 10;
				System.out.printf("Total fee: RM%.2f\n" ,fee);
				user.paymentMethod();
				System.out.print("Enter payment method: ");
				char paymentMethod = sc.next().charAt(0);
				User participant2 = new User(paymentMethod);
				System.out.println("\n----------------------------------------------------------------"
						+ "\nRegistered Details: ");
				System.out.println("Name: " +user.userName);
				System.out.println("Contact number: " +user.contactNumber);
				System.out.println("Email: " +user.email);
				if (paymentMethod == 'A' || paymentMethod == 'a')
					System.out.println("Payment method: Online banking");
				else if (paymentMethod == 'B' || paymentMethod == 'b')
					System.out.println("Payment method: Credit/Debit card");
				
			}
			
			else if (action == 3) {
				user.printMenu();
				System.out.print("Would you like to donate using the menu set price or your own price?"
						+ "\n1. Menu price "
						+ "\n2. Own price"
						+ "\nEnter choice: ");
				int choice = sc.nextInt();
				if (choice == 1) {
					
					System.out.print("Enter session: ");
					int session = sc.nextInt();
					System.out.print("Enter pax: ");
					int pax = sc.nextInt();
					user.paymentMethod();
					System.out.print("Enter payment method: ");
					char paymentMethod = sc.next().charAt(0);
					User donator = new User(session, pax, paymentMethod);
					System.out.println("\n----------------------------------------------------------------"
							+ "\nRegistered Details: ");
					System.out.println("Name: " +user.userName);
					System.out.println("Contact number: " +user.contactNumber);
					System.out.println("Email: " +user.email);
					System.out.printf("Total donation: RM%.2f\n", donator.getTotalDonation());
					
				}
				else if (choice == 2) {
					System.out.print("Enter total donation: RM");
					double donation = sc.nextDouble();
					user.paymentMethod();
					System.out.print("Enter payment method: ");
					char paymentMethod = sc.next().charAt(0);
					if(donation >= 300) {
						double rateTaxReduction = 4;
						System.out.println("Rate tax reduction: " +rateTaxReduction+ "%");
					}
					else
						System.out.println("No tax reduction");
					System.out.println("\n----------------------------------------------------------------"
							+ "\nRegistered Details: ");
					System.out.println("Name: " +user.userName);
					System.out.println("Contact number: " +user.contactNumber);
					System.out.println("Email: " +user.email);
					System.out.printf("Total donation: RM%.2f\n", donation);
				}
				
			}
			System.out.println("\n----------------------------------------------------------------");
			
			Advertisement donation = new Advertisement(4);
			Advertisement virtualRun = new Advertisement("medal", "E-certificate");
			Advertisement link = new Advertisement();
			
			}
			
		
		
		else if (login == 2) {
			
			Finance f = new Finance();
			Finance finance = new Finance(10, 100);
			finance.setProgramExpenses(7500);
			finance.setOtherExpenses(1000);
			finance.setTotalDonation(15000);
			
			System.out.printf("Total donation: RM%.2f\n" , finance.getTotalDonation());
			System.out.printf("Total expenses fee: RM%.2f\n" , finance.calcTotalExpenses());
			System.out.printf("Total Income: RM%.2f\n" , finance.calcTotalIncome());
	
		}
		
		else { 
			System.out.println("Invalid!");
			System.exit(0);
		}
	}
}
	


