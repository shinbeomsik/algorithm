package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 중앙값구하기 {

	public static void main(String[] args) {
		Solution39 sol = new Solution39();
		int[] array = {};

		int answer = sol.solution(array);
		System.out.println(answer);

	}
}

class Solution39 {
	 public int solution(int[] array) {
	        int answer = 0;
	        Arrays.sort(array);
	        answer = array[(array.length-1)/2];
	        return answer;
	    }
}