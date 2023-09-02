
package 프로그래머스풀기레벨0;
import java.util.*;

public class n번째원소부터 {

	public static void main(String[] args) {
		Solution14 sol = new Solution14();
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 2;

		int[] answer = sol.solution(num_list, n);
		System.out.println(answer);

	}
}

class Solution14 {
	public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1] ;
        for(int i = n-1; i <num_list.length;i++) {
        	answer[i-n+1] = num_list[i];
        }
        return answer;
    }
}