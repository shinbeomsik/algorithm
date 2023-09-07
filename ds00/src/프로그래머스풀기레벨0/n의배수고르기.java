
package 프로그래머스풀기레벨0;

import java.util.*;
public class n의배수고르기 {

	public static void main(String[] args) {
		Solution61 sol = new Solution61();
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

		List<Integer> answer = sol.solution(n, numlist);
		System.out.println(answer);

	}
}  

class Solution61 {
	 public List<Integer> solution(int n, int[] numlist) {
	        List<Integer> answer = new ArrayList<>();
	        
	        for(int i = 0; i < numlist.length; i++) {
	        	if(numlist[i]%n == 0) {
	        		answer.add(numlist[i]);
	        	}
	        }
	        return answer;
	    }
}