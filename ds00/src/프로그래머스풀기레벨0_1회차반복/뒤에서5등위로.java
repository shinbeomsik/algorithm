package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 뒤에서5등위로 {

	public static void main(String[] args) {
		Solution85 sol = new Solution85();
		int[] num_list = {};

		int[] answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution85 {
	  public int[] solution(int[] num_list) {
	        int[] answer = new int[num_list.length-5];
	        
	        Arrays.sort(num_list);
	        
	        for(int i=0;i<answer.length;i++){
	            answer[i] = num_list[5 + i];
	        }
	        
	        return answer;
	    }
}