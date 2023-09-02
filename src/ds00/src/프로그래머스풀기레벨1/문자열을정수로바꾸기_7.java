
package 프로그래머스풀기레벨1;

import java.util.*;

public class 문자열을정수로바꾸기_7 {

	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		String s = "-1234";

		int answer = sol.solution(s);
		System.out.println(answer);

	}
}

class Solution7 {
	 public int solution(String s) {
	        int answer = 0;
	        answer = Integer.parseInt(s);
	        return answer;
	    }
}