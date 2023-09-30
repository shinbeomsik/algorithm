
package 프로그래머스풀기레벨1;

import java.util.*;

public class 과일장수 {

	public static void main(String[] args) {
		Solution44 sol = new Solution44();
		int k = 3;
		int m = 4;
		int[] score = { 1, 2, 3, 1, 2, 3, 1 };

		int answer = sol.solution(k, m, score);
		System.out.println(answer);

	}
}

class Solution44 {
	public int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score);

		if (score.length % m == 0) {
			for (int i = 0; i < score.length; i = i + m) {
				List<Integer> arr = new ArrayList<>();
				for (int j = i; j < i + m; j++) {
					arr.add(score[j]);
				}
				answer = answer + arr.get(0) * m;
			}
		} else {
			for (int i = 0; i < score.length; i = i + m) {
				List<Integer> arr = new ArrayList<>();
				for (int j = i; j < i + m; j++) {
					if(score.length-1-j<0) {
						break;
					}
					arr.add(score[score.length - 1 - j]);
				}
				if (arr.size() == m) {
					answer = answer + arr.get(m-1) * m;
				}
			}
		}

		return answer;
	}
}