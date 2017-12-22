package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Easy14LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length > 0) {
			Set<String> set = new HashSet<String>();
			int shortLength = strs[0].length();
			String shortest = strs[0];
			for (String str: strs) {
				set.add(str);
				if(str.length()<shortLength){
					shortest = str;
					shortLength = str.length();
				}
			}
			for (int j = 0; j < shortLength; j++) {
				char prefix = shortest.charAt(j);
				for (String ccc:set) {		
					if(ccc.charAt(j)!=prefix){
						return  shortest.substring(0,j);
					}
				}
			}
			return shortest;
		}
		return "";
	}

	public static void main(String[] args) {
		Easy14LongestCommonPrefix xx = new Easy14LongestCommonPrefix();
		String prefix = xx.longestCommonPrefix(new String[] { "caa", "", "a", "acb" });
		System.out.println(prefix);
	}

}
