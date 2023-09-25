package 프로그래머스풀기레벨0;

import java.util.*;
public class 전국대회선발고사 {

	public static void main(String[] args) {
		Solution146 sol = new Solution146();
		int[] rank = { 3, 7, 2, 5, 4, 6, 1 };
		boolean[] attendance = { false, true, true, true, true, false, false };

		int answer = sol.solution(rank, attendance);
		System.out.println(answer);

	}
}

class Solution146 {
	public int solution(int[] rank, boolean[] attendance) {
		int answer = 0;
		int sort[] = new int[rank.length];
		for (int i = 0; i < rank.length; i++) {
			if (attendance[i]) {
				sort[i] = rank[i];
			} else {
				rank[i] = Integer.MAX_VALUE;
			}
		}
		Arrays.sort(rank);

		for (int i = 0; i < sort.length; i++) {
			if (rank[0] == sort[i]) {
				answer += i * 10000;
			} else if (rank[1] == sort[i]) {
				answer += i*100;
			} else if (rank[2] == sort[i]) {
				answer += i;
			}
		}

		return answer;
	}
}