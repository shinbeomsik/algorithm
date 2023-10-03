package 프로그래머스풀기레벨0;

import java.util.*;

public class 배열만들기2 {

	public static void main(String[] args) {
		Solution167 sol = new Solution167();
		int l = 10;
		int r = 20;

		int[] answer = sol.solution(l, r);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution167 {
	public int[] solution(int l, int r) {
		List<Integer> arr = new ArrayList<>();

		for (int i = l; i <= r; i++) {
			String str = String.valueOf(i);
			if (str.matches("[05]+")) {
				arr.add(i);
			}
		}

		int[] answer = new int[arr.size()];
		if (arr.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			for (int i = 0; i < arr.size(); i++) {
				answer[i] = arr.get(i).intValue();
			}
		}
		return answer;
	}
}