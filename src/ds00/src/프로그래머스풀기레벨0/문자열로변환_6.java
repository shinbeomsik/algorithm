
package 프로그래머스풀기레벨0;
import java.util.*;

public class 문자열로변환_6 {

	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		int n = 70;

		String answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution6 {
	  public String solution(int n) {
	        String answer = "";
	        answer = "" + n; 
	       
	        return answer;
	    }
}