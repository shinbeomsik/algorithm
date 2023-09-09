
package 프로그래머스풀기레벨0;

import java.util.Arrays;

public class 암호해독 {

	public static void main(String[] args) {
		Solution63 sol = new Solution63();
		String cipher = "t he dark";
		int code = 2;

		String answer = sol.solution(cipher, code);
		System.out.println(answer);

	}
}  

class Solution63 {
	  public String solution(String cipher, int code) {
	        String answer = "";
	        String[] arr = cipher.split("");
	        
	        for(int i=0; i<arr.length;i++) {
	        	if((i+1)%code == 0) {
	        		answer =answer + arr[i];
	        	}
	        }
	        return answer;
	    }
}
