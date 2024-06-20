package 프로그래머스레벨1_5;


public class 문자열내p와y의개수 {
			  
}

class Solution1 {
	 boolean solution(String s) {
	        boolean answer = true;

	        s = s.toUpperCase();
	        
	        int countp = 0;
	        int county = 0;

	        for(int i=0; i<s.length();i++){
	            if(s.charAt(i) == 'P'){
	                countp++;
	            }else if(s.charAt(i) == 'Y'){
	                county++;
	            }
	        }
	        if(countp != county){
	            answer = false;
	        }
	        return answer;
	    }
}