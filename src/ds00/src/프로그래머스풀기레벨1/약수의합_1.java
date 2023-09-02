
package 프로그래머스풀기레벨1;

import java.util.*;

public class 약수의합_1 {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		int n = 5;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution1 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				answer = answer + i;
			}
		}
		return answer;
	}
}