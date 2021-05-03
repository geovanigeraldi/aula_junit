package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import aula_junit.entities.Account;
import aula_junit.entities.Financial;
import tests.Factory.AccountFactory;

public class FinancialTests {

	@Test
	public void entranceShouldTwentyPercenteTotalAmount() {
		double totalAmount = 1000.0;		
		double entranceValue = totalAmount - (totalAmount*0.2);
		double expectedValue = 200.00;
		double renda = 100.0;
		
		Financial f = new Financial(1L, totalAmount, entranceValue, null, renda);
		Assertions.assertEquals(expectedValue, f.entry());
	}

	@Test
	public void quotaValueShouldEightyPercenteTotalAmountSplitedPerMouths() {
		double totalAmount = 1000.0;		
		double entranceValue = totalAmount - (totalAmount*0.2);
		Integer mounths = 12;
		double expectedValue = 66.66666666666667;
		double renda = 100.0;
		
		Financial f = new Financial(1L, totalAmount, entranceValue, mounths, renda);
		Assertions.assertEquals(expectedValue, f.quota());
	}

	@Test
	public void quotaValueShouldLessHalfRenda() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			double totalAmount = 2000.0;		
			double entranceValue = totalAmount - (totalAmount*0.2);
			Integer mounths = 12;
			double expectedValue = 66.66666666666667;
			double renda = 100.0;
			
			Financial f = new Financial(1L, totalAmount, entranceValue, mounths, renda);
		});
	}
	
}