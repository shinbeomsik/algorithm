package 프로그래머스레벨1_5;


public class 자연수뒤집어배열로만들기 {
			  
}

class Solution5 {
	 public int[] solution(long n) {
	        int[] answer = {};
	        String k = Long.toString(n);
	        String[] arr = k.split("");
	        
	        answer = new int[arr.length];
	        
	        for(int i=0; i<arr.length; i++){
	            answer[i] = Integer.parseInt(arr[arr.length-1-i]);
	        }
	        
	        return answer;
	    }
}