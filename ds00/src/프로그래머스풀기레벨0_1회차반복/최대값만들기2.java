package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 최대값만들기2 {

	public static void main(String[] args) {
		Solution106 sol = new Solution106();
		int[] numbers = {};

		int answer = sol.solution(numbers);
		System.out.println(answer);

	}
}

class Solution106 {
	 public int solution(int[] numbers) {
	        int answer = 0;
	        Arrays.sort(numbers);
	        
	        if(numbers[0]*numbers[1] > numbers[numbers.length-1]*numbers[numbers.length-2]){
	            answer = numbers[0]*numbers[1];
	        }else {
	            answer =numbers[numbers.length-1]*numbers[numbers.length-2];
	        }
	            
	        return answer;
	    }
}