package com.leetcode.easy;

public class Easy28ImplementSubString {
	public int strStr(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		}

		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {

				for (int j = 0; j < needle.length(); j++) {
					if (haystack.charAt(i + j) != needle.charAt(j)) {
						break;
					} else {
						if (j == needle.length() - 1) {
							return i;
						}
						continue;
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Easy28ImplementSubString xxx = new Easy28ImplementSubString();
		xxx.strStr("hello", "ll");
		// something call KMP algorith
	}

}
