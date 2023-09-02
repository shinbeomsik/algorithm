
package 프로그래머스풀기레벨0;
import java.util.*;

public class 뒤에서5등 {

	public static void main(String[] args) {
		Solution31 sol = new Solution31();
		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

		int[] answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution31 {
	 public int[] solution(int[] num_list) {
	        int[] answer = new int[num_list.length-5];
	        Arrays.sort(num_list);
	        for(int  i =0; i<answer.length;i++) {
	        	answer[i] = num_list[num_list.length-i-1];
	        }
	        Arrays.sort(answer);
	        return answer;
	    }
}