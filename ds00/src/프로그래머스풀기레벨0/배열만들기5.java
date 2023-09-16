package 프로그래머스풀기레벨0;

import java.util.*;

public class 배열만들기5 {

	public static void main(String[] args) {
		Solution101 sol = new Solution101();
		String[] intStrs = { "0123456789", "9876543210", "9999999999999" };
		int k = 50000;
		int s = 5;
		int l = 5;

		List<Integer> answer = sol.solution(intStrs, k, s, l);
		System.out.println(answer);

	}
}

class Solution101 {
	public List<Integer> solution(String[] intStrs, int k, int s, int l) {
		List<Integer> answer = new ArrayList<>();
		for (int i = 0; i < intStrs.length; i++) {
			intStrs[i] = intStrs[i].substring(s, s + l);
			if (Integer.parseInt(intStrs[i]) > k) {
				answer.add(Integer.parseInt(intStrs[i]));
			}
		}
		return answer;
	}
}