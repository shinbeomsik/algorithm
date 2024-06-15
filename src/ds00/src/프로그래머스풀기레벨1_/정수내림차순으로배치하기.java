package 프로그래머스풀기레벨1_1회차반복;

import java.util.*;

public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		long n = 70;

		long answer = sol.solution(n);
		System.out.println(answer);
	} 
}

class Solution11 {
	 public long solution(long n) {
	        long answer = 0;
	        String k = Long.toString(n);
	        
	        String[] arr = k.split("");
	        
	        int[] brr = new int[arr.length];
	        
	        for(int i=0;i<arr.length;i++){
	            brr[i] = Integer.parseInt(arr[i]);
	        }
	        
	        Arrays.sort(brr);
	        
	        for(int i=0;i<brr.length;i++){
	            arr[i] = Integer.toString(brr[brr.length-1-i]);
	        }
	        k = String.join("",arr);
	        
	        answer = Long.parseLong(k);
	        return answer;
	    }
}