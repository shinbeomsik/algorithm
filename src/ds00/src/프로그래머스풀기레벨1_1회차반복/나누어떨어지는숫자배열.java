package 프로그래머스풀기레벨1_1회차반복;

import java.util.*;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		Solution17 sol = new Solution17();
		int[] arr = {}; 
		int divisor = 1;
	 List<Integer> answer = sol.solution(arr, divisor);
		System.out.println(answer);
	}
}

class Solution17 {
	public List<Integer> solution(int[] arr, int divisor) {
		List<Integer> answer = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				answer.add(arr[i]);
			}
		}

		if (answer.size() == 0) {
			answer.add(-1);
		}
		Collections.sort(answer);
		return answer;
	}
}