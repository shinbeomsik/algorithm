
package 프로그래머스풀기레벨1;

import java.util.*;

public class 덧칠하기 {

	public static void main(String[] args) {
		Solution49 sol = new Solution49();
		int n = 8;
		int m = 4;
		int[] section = {  2, 3, 6 };

		int answer = sol.solution(n, m, section);
		System.out.println(answer);

	}
}

class Solution49 {
	public int solution(int n, int m, int[] section) {
		int answer = 0;

		int[] arr = new int[n];

		
		for (int i = 0; i < section.length; i++) {
			arr[section[i] - 1]++;
		}
		
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = i; j < i + m; j++) {
					if (j < arr.length) {
						arr[j]++;
					}
				}
				answer++;
			}
		}

		return answer;
	}
}