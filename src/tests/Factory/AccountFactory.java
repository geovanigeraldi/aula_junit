package tests.Factory;

import aula_junit.entities.Account;

public class AccountFactory {

	public static Account createEmptyAccount() {
		return new Account(1l, 0.0);
	}
	
	public static Account createAccount(double initialAmount) {
		return new Account(1l, initialAmount);
	}
	
}