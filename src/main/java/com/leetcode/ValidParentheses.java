package com.leetcode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(isValid("{[]}"));
	}

	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				st.push(c);
				continue;
			} else if (st.isEmpty()) {
				return false;
			}
			switch (c) {
			case '}':
				if (!st.peek().equals('{'))
					return false;
				st.pop();
				break;

			case ')':
				if (!st.peek().equals('('))
					return false;
				st.pop();
				break;

			case ']':
				if (!st.peek().equals('['))
					return false;
				st.pop();
				break;
			}
		}
		return (st.isEmpty());
	}
}
