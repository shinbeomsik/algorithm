
package 프로그래머스풀기레벨0;

import java.util.*;

public class 뒤에서5등까지 {

	
	public static void main(String[] args) {
		Solution55 sol = new Solution55();
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};

		int[] answer = sol.solution(num_list);
		System.out.println(answer);

	}
}  

class Solution55 {
	 public int[] solution(int[] num_list) {
	        int[] answer = new int[5];
	        Arrays.sort(num_list);
	        for(int i=0; i<5; i++) {
	        	answer[i] = num_list[i];
	        }
	        return answer;
	    }
}