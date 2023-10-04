package 프로그래머스풀기레벨0;

import java.util.*;

public class 특이한정렬 {

	public static void main(String[] args) {
		Solution169 sol = new Solution169();
		int[] numlist = { 10000, 20, 36, 47, 40, 6, 10, 7000 };
		int n = 30;

		int[] answer = sol.solution(numlist, n);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution169 {
	public int[] solution(int[] numlist, int n) {
		int[] answer = new int[numlist.length];
		double[] order = new double[numlist.length];

		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] - n < 0) {
				// n을 뺏을 때 음수 값인 경우, +0.5를 해서 같은 거리에 있는 양수 값보다 정렬을 했을 시 뒤로 밀리도록 함
				order[i] = ((int) Math.abs(numlist[i] - n)) + 0.5;
			} else {
				order[i] = numlist[i] - n;
			}
		}

		System.out.println(Arrays.toString(order));
		Arrays.sort(order); // 오름차순 정렬
		System.out.println(Arrays.toString(order));

		for (int i = 0; i < numlist.length; i++) {
			if (order[i] % 1 != 0) {
				answer[i] = n - (int) order[i];
				System.out.println("<" + i + "> !=");
			} else {
				answer[i] = (int) order[i] + n;
				System.out.println("<" + i + ">");
			}
		}

		return answer;
	}
}