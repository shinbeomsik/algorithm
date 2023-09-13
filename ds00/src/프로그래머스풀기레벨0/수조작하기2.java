package 프로그래머스풀기레벨0;

import java.util.*;
public class 수조작하기2 {

	public static void main(String[] args) {
		Solution86 sol = new Solution86();
		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

		String answer = sol.solution(numLog);
		System.out.println(answer);

	}
}  

class Solution86 {
	public String solution(int[] numLog) {
        String answer = "";
        
        for(int i=1; i<numLog.length;i++) {
        	if( (numLog[i] - numLog[i-1]) == 1 ) {
        		answer = answer + "w";
        	}else if( (numLog[i] - numLog[i-1]) == -1) {
        		answer = answer + "s";
        	}else if( (numLog[i] - numLog[i-1]) == 10) {
        		answer = answer + "d";
        	}else if( (numLog[i] - numLog[i-1]) == -10) {
        		answer = answer + "a";
        	}
        	
        }
        
        return answer;
    }
}