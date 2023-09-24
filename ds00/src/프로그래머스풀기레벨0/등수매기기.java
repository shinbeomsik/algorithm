package 프로그래머스풀기레벨0;

import java.util.*;

public class 등수매기기 {

	public static void main(String[] args) {
		Solution144 sol = new Solution144();
		int[][] score = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } };

		int[] answer = sol.solution(score);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution144 {
	public int[] solution(int[][] score) {
		List<Integer> arr = new ArrayList<>();
		int[] answer = new int[score.length];
		
		for (int i = 0; i < answer.length; i++) {
			arr.add((score[i][0] + score[i][1]));
			answer[i] = (score[i][0] + score[i][1]);
		}
		Collections.sort(arr);
		Collections.reverse(arr);

		for (int i = 0; i < answer.length; i++) {
			answer[i] = arr.indexOf(answer[i]) + 1;
		}

		return answer;
	}
}