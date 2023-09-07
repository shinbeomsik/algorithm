
package 프로그래머스풀기레벨0;

import java.util.*;
public class 가위바위보 {

	public static void main(String[] args) {
		Solution62 sol = new Solution62();
		String rsp = "205";

		String answer = sol.solution(rsp);
		System.out.println(answer);

	}
}  

class Solution62 {
	 public String solution(String rsp) {
	        String answer = "";
	        String[] arr = rsp.split("");
	        for(int i=0;i<arr.length;i++) {
	        	if(arr[i].equals("0")) {
	        		arr[i]  = "5";
	        	}else if(arr[i].equals("5")) {
	        		arr[i] = "2";
	        	}else {
	        		arr[i] = "0";
	        	}
	        }
	        
	        answer = String.join("",arr);
	        
			/*
			 * for(int i=0;i<arr.length;i++) { answer = answer + arr[i]; }
			 */   //이렇게 풀었지만 join하는법이 더 좋음 
	        return answer;
	    }
}