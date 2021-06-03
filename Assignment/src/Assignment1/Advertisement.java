package Assignment1;

public class Advertisement {//user defined class [1.3]
	
	//predefined class [1.2]
	String reward, prize;
	double rateTaxReduction; 
	
	public void socialMedia() { 
		System.out.println("For more updates, find us on:"
				+ "\nInstagram - \thttps://www.instagram.com/hopesoupkitchen/"
				+ "\nTwitter - \thttps://twitter.com/hopesoupkitchen");
	}
	
	public void website() {
		System.out.println("For more informations, visit: "
				+ "\nMain page:\thttps://hopesoupkitchen.com/"
				+ "\nDonation page:\thttps://hopesoupkitchen.com/donation/"
				+ "\nProgram page:\thttps://hopesoupkitchen.com/available-programs/");
	
	}

	public Advertisement() { //constructor with no argument [1.4]
		website();
		socialMedia();
	}
	
	public Advertisement(double taxReduction) {	//constructor with 1 argument [1.4]
												//donation & program soup kitchen
		this.rateTaxReduction = taxReduction;
		System.out.println("\nFor donation RM300 and above, " +taxReduction+ "% of tax reduction will be given.");
	}
	
	public Advertisement(String prize , String reward) {//constructor with 2 arguments [1.4]
														//program virtual run
		this.prize = prize;
		this.reward = reward;
		System.out.println("For the Hope Virtual Run competition, the top three winners will be "
				+ "\ngiven " +prize+ " each and all participants will receive an E-certificate." );
		
	}
}
