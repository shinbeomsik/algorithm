package 프로그래머스레벨1_반복4;

import java.util.*;
public class 문자열내마음대로정렬하기 {
	   
}

class Solution40 {
	 public String[] solution(String[] strings, int n) {
	        String[] answer = new String[strings.length];
	        
	        String[] arr = new String[strings.length];
	        
	        for(int i=0; i<strings.length; i++){
	            arr[i] = strings[i].substring(n,n+1) + strings[i];
	         }
	        
	        Arrays.sort(arr);
	        
	        for(int i=0;i<strings.length; i++){
	            answer[i] = arr[i].substring(1);
	        }
	        
	        return answer;
	    }
}