package com.leetcode.easy;

public class Easy66PlusOne {
	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {

			if (digits[i] != 9) {
				digits[i] = digits[i] + 1;
				break;
			} else {
				digits[i] = 0;
				if (i == 0) {
					int[] result = new int[digits.length + 1];
					for (int j = 0; j < digits.length; j++) {
						result[j + 1] = digits[j];
					}
					result[0] = 1;
					return result;
				}

			}
		}
		return digits;
	}

	public static void main(String[] args) {
		
	}

}
