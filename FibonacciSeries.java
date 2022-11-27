package com.bridgelabz.day6;

//Fibonacci series is a special type of series in which the next term is the sum of the previous two terms. For example, if 0 and 1 are the two previous terms in a series, then the next term will be 1(0+1).
public class FibonacciSeries {

	public static void main(String[] args) {
		printFibonacciNumbers(7);
	}

	static void printFibonacciNumbers(int n) {
		int f1 = 0, f2 = 1, i;

		if (n < 1)
			return;
		System.out.print(f1 + " ");
		for (i = 1; i < n; i++) {
			System.out.print(f2 + " ");
			int next = f1 + f2;
			f1 = f2;
			f2 = next;
		}
	}

}
