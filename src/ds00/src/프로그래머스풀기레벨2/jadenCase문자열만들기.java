
package 프로그래머스풀기레벨2;

import java.util.Arrays;

public class jadenCase문자열만들기 {

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		String s = "3people unFollowed me";

		String answer = sol.solution(s);
		System.out.println(answer);

	}
}

class Solution5 {
	public String solution(String s) {
		StringBuffer sb = new StringBuffer();
		s = s.toLowerCase();
		sb.append(Character.toUpperCase(s.charAt(0)));
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				sb.append(" ");
			} else if (s.charAt(i - 1) == ' ') {
				sb.append(Character.toUpperCase(s.charAt(i)));
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
}