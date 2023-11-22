package 프로그래머스레벨1_반복;

import java.util.*;

public class 제일작은수제거하기 {
}

class Solution19 {
	public List<Integer> solution(int[] arr) {
		List<Integer> answer = new ArrayList<>();
		int[] brr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			brr[i] = arr[i];
		}

		Arrays.sort(brr);

		if (arr.length == 1) {
			answer.add(-1);
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != brr[0]) {
					answer.add(arr[i]);
				}
			}
		}
		return answer;
	}
}