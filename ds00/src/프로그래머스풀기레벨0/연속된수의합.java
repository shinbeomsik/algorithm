package 프로그래머스풀기레벨0;

import java.util.*;
public class 연속된수의합 {

	public static void main(String[] args) {
		Solution155 sol = new Solution155();
		int num = 5;
		int total = 5;

		int[] answer = sol.solution(num, total);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution155 {
	public static int[] solution(int num, int total) {
		int[] answer = new int[num];
		int middle = total / num;
		answer[0] = middle;
		int idx = 1;
		for (int i = 1; i < num; i += 2) {
			answer[i] = middle + idx;
			if (i + 1 < answer.length) {
				answer[i + 1] = middle - idx;
			}
			idx++;
		}

		Arrays.sort(answer);
		return answer;
	}

}