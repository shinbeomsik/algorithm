package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class n개간격의원소들 {

	public static void main(String[] args) {
		Solution72 sol = new Solution72();
		int n = 70;
		int[] num_list = {};

		List<Integer> answer = sol.solution(num_list, n);
		System.out.println(answer);

	}
}

class Solution72 {
	  public List<Integer> solution(int[] num_list, int n) {
	        List<Integer> answer = new ArrayList<>();
	 
	        for(int i=0;i<num_list.length;i =i + n){
	            answer.add(num_list[i]);
	       
	        }
	        return answer;
	    }
}