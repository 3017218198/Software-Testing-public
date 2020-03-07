package com.tju.lab01;

public class Money {

	// total: one 50, one 20, one 10, two 5, three 1
	
	public Money() {
		super();
		// TODO Auto-generated constructor stub
	}

	// possible amount using money less than or equal 1 yuan, max is 3
	public static boolean possibleForOne(int money) {
		if (money == 1 || money == 2 || money == 3) {
			return true;
		} else {
			return false;
		}
	}

	// possible amount using money less than or equal 5 yuan. max is 13
	public static boolean possibleForFive(int money) {
		if (money > 10) {
			return possibleForOne(money - 10);
		} else if (money > 5) {
			return possibleForOne(money - 5);
		} else {
			return possibleForOne(money);
		}
	}

	// possible amount using money less than or equal 10 yuan. max is 23
	public static boolean possibleForTen(int money) {
		if (money > 13) {
			return possibleForFive(money - 10);
		} else {
			return possibleForFive(money);
		}
	}

	// possible amount using money less than or equal 20 yuan. max is 43
	public static boolean possibleForTwenty(int money) {
		if (money > 23) {
			return possibleForTen(money - 20);
		} else {
			return possibleForTen(money);
		}
	}

	public static boolean possibleAmount(int x) {
		// if x>93, return false
		if (x > 93) {
			return false;
		}

		// if x>50, there must be a 50 yuan in x
		else if (x > 50) {
			x = x - 50; // the rest is x-50 yuan
			return possibleForTwenty(x);
		} 
		
		// if x<50, use function possibleForTwenty() to judge
		else {
			return possibleForTwenty(x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
