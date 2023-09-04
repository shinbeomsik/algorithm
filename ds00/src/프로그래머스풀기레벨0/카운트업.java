
package 프로그래머스풀기레벨0;
import java.util.*;

public class 카운트업 {

	public static void main(String[] args) {
		Solution19 sol = new Solution19();
		int start = 3;
		int end = 10;

		int[] answer = sol.solution(start, end);
		System.out.println(answer);

	}
}

class Solution19 {
	public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        for(int i =0; i<answer.length; i++) {
        	answer[i] = start +i;
        }
        return answer;
    }
}