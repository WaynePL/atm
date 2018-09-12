package atm;

public class Atm {

	String requiredPin;
	double balance;

	public Atm(double initialBalance) {
		balance = initialBalance;
	}

	public boolean allowAccess(String enteredPin) {
		return false;
	}

}