package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class n의배수고르기 {

	public static void main(String[] args) {
		Solution100 sol = new Solution100();
		int n = 70;
		 int[] numlist = {};
		List<Integer> answer = sol.solution(n, numlist);
		System.out.println(answer);

	}
}

class Solution100 {
	   public List<Integer> solution(int n, int[] numlist) {
	        List<Integer> answer = new ArrayList<>();
	        
	        for(int i=0;i<numlist.length;i++){
	            if(numlist[i]%n ==0){
	                answer.add(numlist[i]);
	            }
	        }
	        return answer;
	    }
}