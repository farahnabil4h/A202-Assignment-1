package Assignment1;

public class Finance {// user defined class [1.3]
	
	//predefined class[1.2]
	int totalParticipant;
	double totalDonation, registrationFee, programExpenses, otherExpenses;
	
	public double calcTotalRegistrationFee() {
		return this.registrationFee * this.totalParticipant;
	}
	
	public double calcTotalExpenses() {
		return this.programExpenses + this.otherExpenses;
	}
	
	public double calcTotalIncome() {
		return this.totalDonation + this.calcTotalRegistrationFee() - this.calcTotalExpenses();
	}
	
	public Finance() {//constructor with 0 argument [1.4]
		System.out.println("Hope Soup Kitchen's Finance");
	}
	
	public Finance(double fee, int totalParticipant) {//constructor with 2 arguments [1.4]
		this.registrationFee = fee;
		this.totalParticipant = totalParticipant;
		System.out.println("Total participant: " +this.totalParticipant);
		System.out.printf("Total registration fee: RM%.2f\n", this.calcTotalRegistrationFee());
	}

	public int getTotalParticipant() {
		return totalParticipant;
	}

	public void setTotalParticipant(int totalParticipant) {
		this.totalParticipant = totalParticipant;
	}

	public double getTotalDonation() {
		return totalDonation;
	}

	public void setTotalDonation(double totalDonation) {
		this.totalDonation = totalDonation;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}

	public double getProgramExpenses() {
		return programExpenses;
	}

	public void setProgramExpenses(double programExpenses) {
		this.programExpenses = programExpenses;
	}

	public double getOtherExpenses() {
		return otherExpenses;
	}

	public void setOtherExpenses(double otherExpenses) {
		this.otherExpenses = otherExpenses;
	}
	
}
