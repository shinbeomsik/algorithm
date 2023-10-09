package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 뒤에서5등까지 {

	public static void main(String[] args) {
		Solution95 sol = new Solution95();
		int[] num_list = {};

		int[] answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution95 {
	  public int[] solution(int[] num_list) {
	        int[] answer = new int[5];
	        Arrays.sort(num_list);
	        
	        for(int i=0;i<5;i++){
	            answer[i] = num_list[i];
	        }
	        
	        return answer;
	    }
}