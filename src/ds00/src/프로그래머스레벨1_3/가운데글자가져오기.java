package 프로그래머스레벨1_3;


public class 가운데글자가져오기 {
	   
}

class Solution17 {
	 public String solution(String s) {
	        String answer = "";
	        if(s.length()%2==0){
		            answer = s.substring(s.length()/2-1,s.length()/2+1);
		        }else{
		            answer = s.substring(s.length()/2,s.length()/2+1);
		        }
	        return answer;
	    }
}