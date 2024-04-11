package oop.ex;

public class Account {
	int balance = 100000;

	int deposit (int amount) {
		balance += amount;
		System.out.println(STR."\{amount}원을 입금합니다. 현재 잔고는 \{balance}입니다.");
		return balance;
	}

	int withdrawal (int amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println(STR."\{amount}원을 출금합니다.현재 잔고는 \{balance}입니다.");
			return balance;
		} else {
			System.out.println("잔액이 부족합니다.");
		}
		return balance;
	}

	int checkBalance () {
		System.out.println(STR."현재 잔고는 \{balance}원 입니다.");
		return balance;
	}
}
