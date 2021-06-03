package Assignment1;

import java.util.*;

public class User {//user defined class [1.3]
	
	//predefined class [1.2]
	Scanner sc = new Scanner(System.in);
	
	String userName, email, day, contactNumber;
	int session, pax;
	char paymentMethod;
	double price, rateTaxReduction, totalDonation;
	
	public double calcTotalDonation(double price) {
		return price * this.pax;
	}
	
	public void printMenu() { //overriding
		System.out.println("\t\t\t\t\tM E N U\n"
				+ "\nSession 1 - Breakfast with Bihun goreng\t\t\tPrice for 1 pax: RM 3.00"
				+ "\nSession 2 - Lunch with Nasi putih + ikan + sayur\tPrice for 1 pax: RM 6.50"
				+ "\nSession 3 - Dinner with Nasi goreng kampung\t\tPrice for 1 pax: RM 4.50\n");
	}
	
	public void paymentMethod() {
		System.out.println("Payment Method:"
				+ "\nA. Online banking"
				+ "\nB. Credit/Debit card");
	}
	public double getTotalDonation() {
		return totalDonation;
	}
	
	public User() {//constructor with no argument[1.4]
			System.out.print("Enter name: ");
			userName = sc.next();
			System.out.print("Enter contact number: ");
			contactNumber = sc.next();
			System.out.print("Enter email address: ");
			email = sc.next();
	}
	
	public User(char paymentMethod) {//constructor with 1 argument[1.4]
									 //use for registering virtual run program
		this.paymentMethod = paymentMethod;
	}
	
	public User(String day, int session) {
		//constructor with 2 arguments [1.4] , register participant for soup kitchen program
		this.day = day;
		this.session = session;
	}
	
	public User(int session, int pax, char paymentMethod) {
		//constructor with 3 arguments, use for donating process
		this.session = session;
		this.pax = pax;
		this.paymentMethod = paymentMethod;
		if(session == 1)
			price = 3;
		else if(session == 2)
			price = 6.50;
		else if(session == 3)
			price = 4.50;
		totalDonation = calcTotalDonation(price);
		System.out.printf("Total price: RM%.2f\n", totalDonation);
		if(totalDonation >= 300) {
			rateTaxReduction = 4;
			System.out.println("Rate tax reduction: " +rateTaxReduction+ "%");
		}
		else
			System.out.println("No tax reduction");

	}
	
}
