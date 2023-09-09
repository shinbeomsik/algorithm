
package 프로그래머스풀기레벨0;

import java.util.*;
public class 대문자와소문자 {

	public static void main(String[] args) {
		Solution64 sol = new Solution64();
		String my_string = "abCdEfghIJ";

		String answer = sol.solution(my_string);
		System.out.println(answer);

	}
}  

class Solution64 {
	  public String solution(String my_string) {
	        String answer = "";
	        char[] arr =my_string.toCharArray();
	        for(int i=0;i<arr.length;i++) {
	        	if(arr[i] > 'Z') {
	        		arr[i] = Character.toUpperCase(arr[i]);
	        	}else{
	        		arr[i] = Character.toLowerCase(arr[i]);
	        	}
	        }
	        answer = String.valueOf(arr);
	        return answer;
	    }
}