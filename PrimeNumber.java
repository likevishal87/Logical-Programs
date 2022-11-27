package com.bridgelabz.day6;

import java.util.Scanner;

//Prime Number
//Just like the Perfect number, the Prime number is also a special type of number. When the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime number. 0 and 1 are not counted as prime numbers. All the even numbers can be divided by 2, so 2 is the only even prime minister.
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (isPrime(num))
			System.out.println("true");

		else
			System.out.println("false");
	}

	static boolean isPrime(int n) {

		if (n <= 1)
			return false;

		else if (n == 2)
			return true;

		else if (n % 2 == 0)
			return false;

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;

	}

}
