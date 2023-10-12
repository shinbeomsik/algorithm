package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 콜라츠수열만들기 {

	public static void main(String[] args) {
		Solution114 sol = new Solution114();
		int n = 70;

		List<Integer> answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution114 {
	 public List<Integer> solution(int n) {
	        List<Integer> answer = new ArrayList<>();
	        
	        while(n!=1){
	            answer.add(n);
	            if(n%2==0){
	                n = n/2;
	            }else{
	                n = 3*n + 1;
	            }
	        }
	        answer.add(1);
	        return answer;
	    }
}