
package 프로그래머스풀기레벨1;

import java.util.*;

public class 두정수사이의합_9 {

	public static void main(String[] args) {
		Solution9 sol = new Solution9();
		int a= 3;
		int b= 5;

		long answer = sol.solution(a, b);
		System.out.println(answer);

	}
}

class Solution9 {
	  public long solution(int a, int b) {
	        long answer = 0;
	        if (a <= b) {
	            for (int i = a; i <= b; i++)
	                answer += i;
	        } else {
	            for (int i = b; i <= a; i++)
	                answer += i;
	        }
	 
	        return answer;
	    }
}