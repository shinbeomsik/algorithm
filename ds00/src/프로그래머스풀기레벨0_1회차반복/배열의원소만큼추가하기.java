package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 배열의원소만큼추가하기 {

	public static void main(String[] args) {
		Solution92 sol = new Solution92();
		int[] arr= {};

		List<Integer>  answer = sol.solution(arr);
		System.out.println(answer);

	}
}

class Solution92 {
	 public List<Integer> solution(int[] arr) {
	        List<Integer> answer = new ArrayList<>();
	        
	        for(int i=0;i<arr.length;i++){
	            for(int j=0;j<arr[i];j++){
	                answer.add(arr[i]);
	            }
	        }
	        return answer;
	    }
}