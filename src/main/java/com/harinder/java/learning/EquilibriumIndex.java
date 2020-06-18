package com.harinder.java.learning;

public class EquilibriumIndex {

	
	public static void main(String[] args) {
		int[] arr = {-1, 3, -4, 5, 1, -6, 2, 1};
		findEquilibriumIndex(arr);
	}

	private static void findEquilibriumIndex(int[] arr) {
		int sumTotal = 0;
		for (int i = 0; i < arr.length; i++) {
			sumTotal += arr[i];
			System.out.println(sumTotal);
		}
		int leftSum = 0;
		for (int i = 0; i < arr.length; i++) {
			leftSum = sumTotal - arr[i];
			System.out.println("Left Sum = " + leftSum);
			if (leftSum == sumTotal - leftSum) {
				System.out.println("Equilibrium Point = " + i);
			}
		}
	}
}