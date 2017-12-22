package com.leetcode.easy;

public class Easy38CountAndSay {
	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}else {
			String raw = countAndSay(n - 1);
			StringBuffer result = new StringBuffer();
			char previous = raw.charAt(0);
			int count = 1;
			for (int i = 1; i < raw.length(); i++) {
				if (raw.charAt(i) == previous) {
					count++;
				} else {
					result.append(count).append(previous);
					previous = raw.charAt(i);
					count = 1;
				}
			}
			
			result.append(count).append(previous);
			return result.toString();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
