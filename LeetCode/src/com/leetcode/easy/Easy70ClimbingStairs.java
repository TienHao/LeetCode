package com.leetcode.easy;

public class Easy70ClimbingStairs {

	public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
	}

	public static void main(String[] args) {
		Easy70ClimbingStairs test = new Easy70ClimbingStairs();
		System.out.println(test.climbStairs(44));
	}

}
