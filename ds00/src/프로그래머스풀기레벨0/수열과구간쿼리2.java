package 프로그래머스풀기레벨0;

import java.util.*;

public class 수열과구간쿼리2 {

	public static void main(String[] args) {
		Solution165 sol = new Solution165();
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};

		int[] answer = sol.solution(arr, queries);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution165 {
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];

		for (int i = 0; i < queries.length; i++) {
			List<Integer> brr = new ArrayList<>();
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				if (arr[j] > queries[i][2]) {
					brr.add(arr[j]);
					Collections.sort(brr);
				} else {
					answer[i] = -1;
				}
				if(brr.size() !=0) {
				answer[i] = brr.get(0).intValue();
				}
			}
		}
		return answer;
	}
}