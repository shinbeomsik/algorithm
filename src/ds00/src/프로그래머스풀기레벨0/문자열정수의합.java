
package 프로그래머스풀기레벨0;
import java.util.*;

public class 문자열정수의합 {

	public static void main(String[] args) {
		Solution22 sol = new Solution22();
		String num_str = "15";

		int answer = sol.solution(num_str);
		System.out.println(answer);

	}
}

class Solution22 {
	 public int solution(String num_str) {
	        int answer = 0;
	        String[] s = num_str.split("");
	        
	        for(int i=0; i<num_str.split("").length; i++) {
	        	answer = answer + Integer.parseInt(s[i]);
	        }
	        return answer;
	    }
}