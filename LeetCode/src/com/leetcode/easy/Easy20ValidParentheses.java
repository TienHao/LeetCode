package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Easy20ValidParentheses {

	public boolean isValid(String s) {
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}

		return isValid(list, 0);
	}

	public boolean isValid(List<Character> xxx, int start) {
		if (xxx.size() % 2 != 0) {
			return false;
		}
		int nextStart = -1;
		if (start > 0) {
			if ((xxx.get(start - 1) == '(' && xxx.get(start) == ')')
					|| (xxx.get(start - 1) == '[' && xxx.get(start) == ']')
					|| (xxx.get(start - 1) == '{' && xxx.get(start) == '}')) {
				xxx.remove(start - 1);
				xxx.remove(start - 1);
				nextStart = start - 1;
			} else {
				for (int i = start; i < xxx.size() - 1; i++) {
					if ((xxx.get(i) == '(' && xxx.get(i + 1) == ')')||(xxx.get(i) == '[' && xxx.get(i + 1) == ']')||(xxx.get(i) == '{' && xxx.get(i + 1) == '}')) {
						xxx.remove(i);
						xxx.remove(i);
						nextStart = i;
						break;
					}
				}
			}

		} else {
			for (int i = 0; i < xxx.size() - 1; i++) {
				if ((xxx.get(i) == '(' && xxx.get(i + 1) == ')')||(xxx.get(i) == '[' && xxx.get(i + 1) == ']')||(xxx.get(i) == '{' && xxx.get(i + 1) == '}')) {
					xxx.remove(i);
					xxx.remove(i);
					nextStart = i;
					break;
				}
			}
		}

		if (xxx.size() == 0) {
			return true;
		}else{
			if(nextStart==-1||nextStart==xxx.size()){
				return false;
			}else{
				return isValid(xxx, nextStart);								
			}
		}
	}

	public static void main(String[] args) {
		Easy20ValidParentheses xxx = new Easy20ValidParentheses();
		System.out.println(xxx.isValid("}}(]}}){)(])](}{{}[]"));
	}
}
