
package 프로그래머스풀기레벨0;

import java.util.*;

public class 접도사인지확인하기 {

	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		String my_string = "banana";
		String is_prefix = "bak";
		int answer = sol.solution(my_string, is_prefix);
		System.out.println(answer);

	}
}

class Solution34 {
	public int solution(String my_string, String is_prefix) {
		int answer = 0;
		int b = 0;
		char[] a1 = my_string.toCharArray();
		char[] a2 = is_prefix.toCharArray();
		if (a2.length > a1.length) {
			return answer;
		}

		for (int i = 0; i < a2.length; i++) {
			if (a1[i] != a2[i]) {
				b += a1[i] - a2[i];
			}
		}

		if (b == 0) {
			answer = 1;
		}

		return answer;
	}
}