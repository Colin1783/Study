package oop.ex;

public class AccountMain {
	public static void main(String[] args) {
		Account myAccount = new Account();
		myAccount.deposit(1000000);
		myAccount.withdrawal(1500000);
		myAccount.withdrawal(1100000);
		myAccount.deposit(10000000);
		myAccount.checkBalance();
	}
}
