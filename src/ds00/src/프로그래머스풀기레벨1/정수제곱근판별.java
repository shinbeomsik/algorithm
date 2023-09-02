
package 프로그래머스풀기레벨1;

import java.util.*;

public class 정수제곱근판별 {

	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		long n = 400000000;

		long answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution11 {
	 public long solution(long n) {
	        long answer = -1;
	        for(long i=1; i <= n; i++) {
	        	if(i*i ==n) {
	        		answer = (i+1)*(i+1);
	        		break;
	        	}
	        }
	        return answer;
	    }
}