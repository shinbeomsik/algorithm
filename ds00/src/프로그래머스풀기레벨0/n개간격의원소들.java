
package 프로그래머스풀기레벨0;
import java.util.*;

public class n개간격의원소들 {

	public static void main(String[] args) {
		Solution20 sol = new Solution20();
		int[] num_list = {4, 2, 6, 1, 7, 6};
		int n = 6;

		int[] answer = sol.solution(num_list, n);
		System.out.println(answer);

	}
}

class Solution20 {
	  public int[] solution(int[] num_list, int n) {
	        int[] answer = new int[(num_list.length + n - 1) / n];
	        int index = 0;
	        for (int i = 0; i < num_list.length; i += n) {
	            answer[index++] = num_list[i];
	        }
	        
	        return answer;
	    }
}