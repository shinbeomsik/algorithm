
package 프로그래머스풀기레벨0;
import java.util.*;

public class 마지막두원소 {

	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] num_list = {5, 2, 1, 7, 5};

		int[] answer = sol.solution(num_list);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution23 {
	  public int[] solution(int[] num_list) {
	        int[] answer = new int[num_list.length+1];
	        for(int i =0; i<num_list.length;i++) {
	        	answer[i] = num_list[i];
	        }
	        if(num_list[num_list.length-2] < num_list[num_list.length-1]) {
	        	answer[num_list.length] = num_list[num_list.length-1]-num_list[num_list.length-2];
	        }else {
	        	answer[num_list.length] = num_list[num_list.length-1]*2;
	        }
	        return answer;
	    }
}