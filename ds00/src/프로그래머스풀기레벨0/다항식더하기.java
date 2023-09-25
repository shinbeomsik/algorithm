package 프로그래머스풀기레벨0;

import java.util.*;
public class 다항식더하기 {

	public static void main(String[] args) {
		Solution149 sol = new Solution149();
		String polynomial = "3x + 7 + x";

		String answer = sol.solution(polynomial);
		System.out.println(answer);

	}
}  

class Solution149 {
	public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        System.out.println(Arrays.toString(arr));
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i].contains("x")) {
        		
        	}else if(arr[i].equals("+")) {
        		
        	}else {
        		
        	}
        }
        
        return answer;
    }
}