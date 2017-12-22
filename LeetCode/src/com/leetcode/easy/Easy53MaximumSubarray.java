package com.leetcode.easy;

public class Easy53MaximumSubarray {
	public int maxSubArray(int[] nums) {
		
//
//		for(int i=1;i<nums.length;i++){
//			nums[i]=nums[i-1]+nums[i];
//		}
//		int max=nums[0];
//		for(int i=1;i<nums.length;i++){
//			if(nums[i]>max){
//				max = nums[i];
//			}
//		}
//		
//		return max;
		
		
		int newPosition=0;
		boolean positive=false;
		for(int i=1;i<nums.length;i++){
			if(nums[i]>0){
				if(positive){//++
					nums[newPosition]=nums[newPosition]+nums[i];
				}else{//-+
					newPosition++;
					nums[newPosition]=nums[i];
				}
			}else{
				if(positive){//+-
					newPosition++;
					nums[newPosition]=nums[i];
				}else{//--
					nums[newPosition]=nums[newPosition]+nums[i];
				}
			}
		}
		
		for(int i=0;i<=newPosition;i++){
			
		}
		return 0;
	}

	public static void main(String[] args) {

	}

}
