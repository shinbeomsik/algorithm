package 프로그래머스레벨1_3;


public class x만큼간격이있는n개의숫자 {
	   
}

class Solution3 {
	 public long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        
	        for(int i=0; i<answer.length; i++){
	            answer[i] = (long)x + (long)x*i;
	        }
	        
	        return answer;
	    }
}