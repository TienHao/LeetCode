package com.leetcode.easy;

public class Easy26RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		if(nums==null){
			return 0;
		}
		int length=1;
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]!=nums[i+1]){
				nums[length]=nums[i+1];
				length++;
			}
		}
		return length;
	}

	public static void main(String[] args) {
		Easy26RemoveDuplicatesFromSortedArray xxx = new Easy26RemoveDuplicatesFromSortedArray();
		xxx.removeDuplicates(new int[] { 1, 1, 4 });
		System.out.println(xxx);
	}

}
