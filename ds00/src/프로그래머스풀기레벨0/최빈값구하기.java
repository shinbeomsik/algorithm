package 프로그래머스풀기레벨0;

import java.util.*;

public class 최빈값구하기 {

	public static void main(String[] args) {
		Solution168 sol = new Solution168();
		int[] array = { 1 };
		int answer = sol.solution(array);
		System.out.println(answer);

	}
}

class Solution168 {
	public int solution(int[] array) {
		int[] arr = new int[1000];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= array[i]; j++) {
				if (array[i] == j) {
					arr[j]++;
					break;
				}
			}
		}

		int max = 0;
		int cc = 0;
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				answer = i;
				cc = 1;
			} else if (max == arr[i]) {
				cc++;
			}
		}

		if (cc > 1) {
			answer = -1;
		}

		return answer;
	}
}
//System.out.println(Arrays.toString(arr));