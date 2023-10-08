package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class n번째원소부터 {

	public static void main(String[] args) {
		Solution73 sol = new Solution73();
		int n = 70;
		int[] num_list = {};
		List<Integer> answer = sol.solution(num_list, n);
		System.out.println(answer);

	}
}

class Solution73 {
	   public List<Integer> solution(int[] num_list, int n) {
	        List<Integer> answer = new ArrayList<>();
	        
	        for(int i=n-1;i<num_list.length;i++){
	            answer.add(num_list[i]);
	        }
	        
	        return answer;
	    }
}