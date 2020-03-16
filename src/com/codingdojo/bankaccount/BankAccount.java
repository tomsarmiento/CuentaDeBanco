package com.codingdojo.bankaccount;
import java.util.Random;
public class BankAccount {
	private String account_number;
	private double current_account_balance;
	private double savings_account_balance;
	private static int numberOfAccounts;
	private static double totalMoney; // el dinero total del banco? o watefok?
	
	//incrementa el numero de cuentas creadas cada vez que la clase es instanciada
	public BankAccount(){
		randomAccountNumber();
		numberOfAccounts++;
	}
	
	// generador de numero de cuenta bancaria
	private void randomAccountNumber() {
		Random numAleatorio = new Random();
		String str = "";
		for(int i=0; i<10; i++) {
				int n = numAleatorio.nextInt(10);
				str+=n;
		}
		account_number=str;
	}
	
	//getters
	public double getCurrentAccountBalance() {
		return current_account_balance;
	}
	
	public double getSavingsAccountBalance() {
		return savings_account_balance;
	}
	
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
	public String getAccountNumber() {
		return account_number;
	}
	
	public static double getTotalMoney() {
		return totalMoney;
	}
	
	// métodos
	
	public void depositMoneyCurrentAccount(double money) {
		current_account_balance+=money;
		totalMoney+=money;
	}
	
	public void depositMoneySavingsAccount(double money) {
		savings_account_balance+=money;
		totalMoney+=money;
	}
	
	public void withdrawMoney(double money) {
		if(current_account_balance<money) {
			System.out.println("You don't have enough money in your current account!");
		}
		else {
			current_account_balance-=money;
			totalMoney-=money;
			System.out.println("Money successfully withdrawn!");
		}
	}
	
}
