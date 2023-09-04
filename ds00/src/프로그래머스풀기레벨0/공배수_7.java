
package 프로그래머스풀기레벨0;
import java.util.*;

public class 공배수_7 {

	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		int number = 60;
		int n = 40;
		int m = 3;

		int answer = sol.solution(number, n, m);
		System.out.println(answer);

	}
}

class Solution7 {
	 public int solution(int number, int n, int m) {
	        int answer = 0;
	        if(number%n ==0 && number%m==0) {
	        	answer = 1;
	        }
	        return answer;
	    }
}