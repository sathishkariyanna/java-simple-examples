package com.sathish;

/**
 * 
 * @author Sathish
 *
 */
public class Recusive {

	public static void main(String[] args) {
		int result = f(4);
		System.out.println("result:" + result);
	}

	public static int f(int n) {

		if (n <= 1) {
			return 1;
		}
		return f(n - 1) + f(n - 1);
	}
}
