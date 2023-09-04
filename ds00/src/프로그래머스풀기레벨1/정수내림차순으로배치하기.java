
package 프로그래머스풀기레벨1;

import java.util.*;

public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		long n = 118372;

		long answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution12 {
	  public long solution(long n) {
	        long answer = 0;
	        
	        String[] str = Long.toString(n).split("");
	        Arrays.sort(str, Collections.reverseOrder());
	        
	        String answ = "";
	        
	        for(String s : str)
	           answ += s;
	        
	        answer = Long.parseLong(answ);
	        
	        return answer;
	    }
}