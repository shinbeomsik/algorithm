package 프로그래머스레벨1_반복4;

import java.util.*;
public class 정수내림차순으로배치하기 {
	   
}

class Solution6 {
	 public long solution(long n) {
	        long answer = 0;
	        String[] arr = Long.toString(n).split("");
	        Arrays.sort(arr);
	        String[] arr2 = new String[arr.length];
	        
	        for(int i=0; i<arr.length; i++){
	            arr2[i] = arr[arr.length-1-i];
	        }
	        
	        answer = Long.parseLong(String.join("",arr2));
	        return answer;
	    }
}