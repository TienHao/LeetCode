package com.leetcode.easy;

public class Easy58LengthOfLastWord {
	public int lengthOfLastWord(String s) {

		int lastWordStart = -1;
		int lastWordEnd = -1;
		char previous = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (' ' != s.charAt(i)) {
				if (previous == ' ') {
					lastWordStart = i;
				}
			}
			if (' ' == s.charAt(i)) {
				if (previous != ' ') {
					lastWordEnd = i;
				}
			}
			previous = s.charAt(i);
		}

		if (lastWordStart < lastWordEnd) {
			return lastWordEnd - lastWordStart;
		} else if (lastWordStart > lastWordEnd) {
			return s.length() - lastWordStart;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		Easy58LengthOfLastWord text = new Easy58LengthOfLastWord();
		System.out.println(text.lengthOfLastWord("Hello World"));
	}

}
