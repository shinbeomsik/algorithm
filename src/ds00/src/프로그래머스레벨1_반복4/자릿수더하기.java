package 프로그래머스레벨1_반복4;


public class 자릿수더하기 {
	   
}

class Solution3 {
	 public int solution(int n) {
	        int answer = 0;
	        
	        String[] arr = Integer.toString(n).split("");
	        
	        for(int i=0;i<arr.length;i++){
	            answer = answer + Integer.parseInt(arr[i]);
	        }
	        return answer;
	    }
}