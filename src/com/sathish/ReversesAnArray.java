package com.sathish;

/**
 * 
 * @author Sathish
 *
 */
public class ReversesAnArray {

	public static void main(String[] args) {
		int[] array = { 10, 23, 54, 7, 4, 9, 34 };
		int[] reversedArray = null;
		reversedArray = reverse(array);
		for (int arrElement : reversedArray) {
			System.out.print(arrElement + "\t");
		}
	}

	public static int[] reverse(int[] array) {
		//loop the array by half
		for (int i = 0; i < array.length / 2; i++) {
			int fromLast = array.length - i - 1;
			int temp = array[i];
			array[i] = array[fromLast];
			array[fromLast] = temp;
		}
		return array;
	}
}
