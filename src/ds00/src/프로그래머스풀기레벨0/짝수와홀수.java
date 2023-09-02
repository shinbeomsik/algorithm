
package 프로그래머스풀기레벨0;
import java.util.*;

public class 짝수와홀수 {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int num = 3;

		String answer = sol.solution(num);
		System.out.println(answer);

	}
}

class Solution4 {
	   public String solution(int num) {
	        String answer = "";
	        if(num%2==0) {
	        	answer = "Even";
	        }else {
	        	answer = "Odd";
	        }
	        return answer;
	    }
}