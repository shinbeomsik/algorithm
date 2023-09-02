
package 프로그래머스풀기레벨0;
import java.util.*;

public class 정수찾기 {

	public static void main(String[] args) {
		Solution17 sol = new Solution17();
		int[] num_list = {1, 2, 3, 4, 5};
	    int n = 20;

		int answer = sol.solution(num_list, n);
		System.out.println(answer);

	}
}

class Solution17 {
	 public int solution(int[] num_list, int n) {
	        int answer = 0;
	        for(int i=0; i < num_list.length; i++) {
	        	if(num_list[i] == n) {
	        		answer =1;
	        	}
	        }
	        return answer;
	    }
}