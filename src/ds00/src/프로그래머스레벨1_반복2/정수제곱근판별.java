package 프로그래머스레벨1_반복2;


public class 정수제곱근판별 {
	   
}

class Solution10 {
	 public long solution(long n) {
	        long answer = 0;
	        double k = Math.sqrt(n);
	        if(k == (int)k){
	            answer = (long)(k+1)*(long)(k+1);
	        }else{
	            answer = -1;
	        }
	        return answer;
	    }
}