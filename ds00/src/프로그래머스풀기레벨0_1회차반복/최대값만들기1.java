package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 최대값만들기1 {

	public static void main(String[] args) {
		Solution29 sol = new Solution29();
		int[] numbers = {};

		int answer = sol.solution(numbers);
		System.out.println(answer);

	}
}

class Solution29 {
	 public int solution(int[] numbers) {
	        int answer = 0;
	        Arrays.sort(numbers);
	        answer = numbers[numbers.length-1] * numbers[numbers.length-2] ;
	        return answer;
	    }
}