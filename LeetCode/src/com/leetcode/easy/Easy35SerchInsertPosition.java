package com.leetcode.easy;

public class Easy35SerchInsertPosition {
	public int searchInsert(int[] nums, int target) {

		if (target > nums[nums.length - 1]) {
			return nums.length;
		}
		if (target <= nums[0]) {
			return 0;
		}
		int upper = nums.length - 1;
		int lower = 0;

		while ((upper - lower) > 1) {
			int compared = nums[(upper + lower) / 2];
			if (compared > target) {
				upper = (upper + lower) / 2;
			} else if (compared < target) {
				lower = (upper + lower) / 2;
			} else {
				return (upper + lower) / 2;
			}
		}
		if (target == nums[lower]) {
			return lower;
		} else {
			return upper;
		}
	}

	public static void main(String[] args) {
		Easy35SerchInsertPosition xxx = new Easy35SerchInsertPosition();
		int result = xxx.searchInsert(new int[] { 1, 3, 5, 6 }, 2);
		System.out.println(result);
	}

}
