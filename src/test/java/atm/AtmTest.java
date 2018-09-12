package atm;

import org.junit.Assert;
import org.junit.Test;

public class AtmTest {

	@Test
	public void shouldDoSomething() {
		// arrange
		Atm underTest = new Atm(23456.00);
		// act
		double balance = underTest.balance;
		// assert
		Assert.assertEquals(23456.00, balance, 0.005);
	}
}