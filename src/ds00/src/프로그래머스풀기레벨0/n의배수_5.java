
package 프로그래머스풀기레벨0;
import java.util.*;

public class n의배수_5 {

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		int num = 98;	
		int n = 2;

		int answer = sol.solution(num, n);
		System.out.println(answer);

	}
}

class Solution5 {
    public int solution(int num, int n) {
        int answer = 0;
        if(num%n ==0) {
        	answer = 1;
        }else {
        	answer =0;
        }
        return answer;
    }
}