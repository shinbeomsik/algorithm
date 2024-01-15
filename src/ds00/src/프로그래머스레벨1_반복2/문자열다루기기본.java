package 프로그래머스레벨1_반복2;


public class 문자열다루기기본 {
	   
}

class Solution27 {
	  public boolean solution(String s) {
	        boolean answer = false;
	        
	        if (s.matches("^[0-9]+$")) {
	            if(s.length()==4 || s.length()==6)
	            answer = true;
	         } 
	        return answer;
	    }
}