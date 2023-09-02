
package 프로그래머스풀기레벨0;
import java.util.*;

public class n번째원소까지 {

	public static void main(String[] args) {
		Solution16 sol = new Solution16();
		int[] num_list = {2, 1, 6};
		int n = 1;

		int[] answer = sol.solution(num_list, n);
		System.out.println(answer);

	}
}

class Solution16 {
	  public int[] solution(int[] num_list, int n) {
	        int[] answer = new int[n];
	        for(int i=0; i<n;i++) {
	        	answer[i] = num_list[i];
	        }
	        return answer;
	    }
}