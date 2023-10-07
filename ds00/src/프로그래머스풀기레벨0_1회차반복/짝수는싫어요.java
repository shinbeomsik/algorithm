package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		Solution38 sol = new Solution38();
		int n = 70;

		List<Integer> answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution38 {
	  public List<Integer> solution(int n) {
	        List<Integer> answer = new ArrayList<>();
	        
	        for(int i=1;i<=n;i++){
	            if(i%2 != 0){
	                answer.add(i);
	            }
	        }
	        
	        return answer;
	    }
}