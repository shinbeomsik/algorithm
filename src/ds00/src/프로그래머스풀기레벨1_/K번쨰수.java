package 프로그래머스풀기레벨1_;

import java.util.*;

public class K번쨰수 {

	public static void main(String[] args) {
		Solution40 sol = new Solution40();
		int[] array = {};
		int[][] commands = {};

		int[] answer = sol.solution(array, commands);
		System.out.println(answer);
	}
}

class Solution40 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			List<Integer> arr = new ArrayList<>();

			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				arr.add(array[j]);
			}
			Collections.sort(arr);

			answer[i] = arr.get(commands[i][2] - 1);
		}
		return answer;
	}
}
