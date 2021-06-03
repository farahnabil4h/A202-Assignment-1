package Assignment1;

public class ProgramDescription { //user defined class [1.3]
	
	//predefined class [1.2]
	String programName, location, time, day, date;
	double programFee;
	
	public void printProgramAvailable() {
		System.out.println("\nSince our country is currently undergoing PKP, below are the only ongoing programs:"
				+ "\n1. Soup Kitchen"
				+ "\n2. Hope Virtual Run\n");
	}
	
	public void printMenu() { 	//overriding
								//shows the food menu available for participants in soup kitchen program
		System.out.println("M E N U"
				+ "\nSession 1 - Breakfast with Bihun goreng"
				+ "\nSession 2 - Lunch with Nasi putih + ikan + sayur"
				+ "\nSession 3 - Dinner with Nasi goreng kampung\n");
	}
	
	ProgramDescription(){//constructor with no argument [1.4] 
		printProgramAvailable();
	}
	
	ProgramDescription(String date, double fee){ //constructor with 2 arguments [1.4]
	/*only use for program virtual run because in program soup kitchen, the program is on going (no specific date)
	 and the participants are those needed (no fee will be charge)*/
		this.date = date;
		this.programFee = fee;
		System.out.println("Date:     " +this.date);
		System.out.printf("Fee:      RM%.2f\n", this.programFee);
		System.out.println("\n----------------------------------------------------------------");
	}
	
	ProgramDescription(String name, String location, String time, String day){	//constructor with 4 arguments [1.4]
																				//use in both programs
		this.programName = name;
		this.location = location;
		this.time = time;
		this.day = day;
		System.out.println("Program Details:"
				+ "\nName:     " +this.programName
				+ "\nLocation: " +this.location
				+ "\nTime:     " +this.time
				+ "\nDay:      " +this.day);
		
	}

}
