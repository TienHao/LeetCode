package com.leetcode.easy;

public class Easy53MaximumSubarray {
	public int maxSubArray(int[] nums) {

		int sum = nums[0];
		int maxsum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > 0) {
				if (sum < 0) {
					sum = 0;
				}
				sum = sum + nums[i];
				if (sum > maxsum) {
					maxsum = sum;
				}
			} else {
				sum = sum + nums[i];
				if (sum <= 0) {
					sum = 0;
					if ( nums[i] > maxsum){
						maxsum = nums[i];
					}
				}
			}
		}

		return maxsum;

	}

	public static void main(String[] args) {
		Easy53MaximumSubarray test = new Easy53MaximumSubarray();
		System.out.println(test.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
		System.out.println(test.maxSubArray(new int[] { -2, -1 }));
	}

}
