package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount MyAccount = new BankAccount();
		BankAccount MySecondAccount = new BankAccount();
		
		MyAccount.depositMoneyCurrentAccount(500.000);
		MySecondAccount.depositMoneySavingsAccount(200.000);
		System.out.println("Total number of accounts is: "+BankAccount.getNumberOfAccounts());
		MyAccount.withdrawMoney(100.000);
		MySecondAccount.withdrawMoney(50.000);
		System.out.println(MyAccount.getCurrentAccountBalance());
		System.out.println(MySecondAccount.getSavingsAccountBalance());
		System.out.println("Total money is: "+BankAccount.getTotalMoney());
	}

}
