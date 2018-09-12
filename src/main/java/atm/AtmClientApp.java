package atm;

import java.util.Scanner;

public class AtmClientApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter initial balance:");
		double initialBalance = input.nextDouble();
		input.nextLine(); // throw the rest of the line away

		Atm myAtm = new Atm(initialBalance);
		System.out.println("Your balance is " + myAtm.balance);

		input.close();
	}
}
