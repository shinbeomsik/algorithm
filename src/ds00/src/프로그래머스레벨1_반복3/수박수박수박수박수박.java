package 프로그래머스레벨1_반복3;


public class 수박수박수박수박수박 {
	   
}

class Solution18 {
	  public String solution(int n) {
	        String answer = "";
	        for(int i=1;i<=n;i++){
	            if(i%2==0){
	                answer = answer + "박";
	            }else{
	                answer = answer + "수";
	            }
	        }
	        return answer;
	    }
}