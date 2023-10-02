package 프로그래머스풀기레벨0;

import java.util.*;

public class 배열만들기4 {

	public static void main(String[] args) {
		Solution163 sol = new Solution163();
		int[] arr = { 5, 3, 4, 1, 2 };

		List<Integer> stk = sol.solution(arr);
		System.out.println(stk);

	}
}

class Solution163 {
	public List<Integer> solution(int[] arr) {

		List<Integer> krr = new ArrayList<>();
		int count = 0;

		while (count != arr.length) {
			if (krr.size() == 0) {
				krr.add(arr[count]);
				count++;
			} else {
				if (krr.get(krr.size() - 1) < arr[count]) {
					krr.add(arr[count]);
					count++;
				} else {
					krr.remove(krr.size() - 1);
				}
			}
		}
		return krr;
	}
}