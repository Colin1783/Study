package access;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.deposit(-1000);
		account.deposit(10000000);
		account.withdraw(15000000);
		account.withdraw(5000000);
		System.out.println(STR."현재 잔액은 \{account.getBalance()}원입니다.");
	}
}
