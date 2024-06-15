package 프로그래머스풀기레벨1_1회차반복;

import java.util.*;

public class 문자열내림차순으로배치하기 {

	public static void main(String[] args) {
		Solution32 sol = new Solution32();
		String s= "";
		long a = 0;
		String answer = sol.solution(s);
		System.out.println(answer);

	} 
}

class Solution32 {
	 public String solution(String s) {
	        String answer = "";
	        
	        String[] arr = s.split("");
	        String[] brr = new String[arr.length];
	        Arrays.sort(arr);
	        for(int i=0;i<arr.length;i++){
	            brr[i] = arr[arr.length-1-i];
	        }
	        answer = String.join("",brr);
	        return answer;
	    }
}