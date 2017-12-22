package com.leetcode.easy;

public class Easy27RemoveElement {

	public int removeElement(int[] nums, int val) {
		if (nums == null) {
			return 0;
		}

		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[result]=nums[i];
				result++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Easy27RemoveElement xxx = new Easy27RemoveElement();
		xxx.removeElement(new int[] { 1, 3, 2, 1, 4 }, 1);
	}

}
