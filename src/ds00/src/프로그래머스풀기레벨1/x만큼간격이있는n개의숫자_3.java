
package 프로그래머스풀기레벨1;

import java.util.*;

public class x만큼간격이있는n개의숫자_3 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int x = 2;
		int n = 5;

		long[] answer = sol.solution(x, n);
		System.out.println(answer);

	}
}

class Solution3 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] = x + x*i;
		}
		return answer;
	}
}