package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class A2의영역 {

	public static void main(String[] args) {
		Solution156 sol = new Solution156();
		int[] arr = {};

		List<Integer> answer = sol.solution(arr);
		System.out.println(answer);

	}
}

class Solution156 {
	public List<Integer> solution(int[] arr) {
		List<Integer> answer = new ArrayList<>();
		List<Integer> krr = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				krr.add(i);
			}
		}
		if (krr.size() != 0) {
			for (int i = krr.get(0); i <= krr.get(krr.size() - 1); i++) {
				answer.add(arr[i]);
			}
		} else {
			answer.add(-1);
		}
		return answer;
	}
}