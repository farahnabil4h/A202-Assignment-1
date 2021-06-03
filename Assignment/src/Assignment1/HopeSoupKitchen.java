package Assignment1;

public class HopeSoupKitchen {//super class & user define class [1.3]
	
	//predefine class [1.2]
	String name, location, contactNumber;
	int foundedYear;

	public void printOrganisationInfo() {
		foundedYear = 2018;
		System.out.println("Establishment year: " +foundedYear
				+ "\nOur main mission is to ensure that food, as one of the basic"
				+"\nnecessities, is available to everyone especially those needed."
				+ "\n----------------------------------------------------------------");
	}
	
	public HopeSoupKitchen() {//constructor with no argument [1.4]
		printOrganisationInfo();
	}
	
	public HopeSoupKitchen(String name) {//constructor 1 with argument [1.4]
		this.name = name;
		System.out.println("Organisation Information"
				+ "\n----------------------------------------------------------------"
				+ "\nOrganisation name: " +this.name);
	}
	
	public HopeSoupKitchen(String location, String number) {//constructor 2 with arguments [1.4]
		this.location = location;
		this.contactNumber = number;
		System.out.println("Location: " +this.location
							+"\nContact number: " +this.contactNumber);
	}
	
}
