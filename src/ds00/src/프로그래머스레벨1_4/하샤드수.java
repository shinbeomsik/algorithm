package 프로그래머스레벨1_4;


public class 하샤드수 {
	   
}

class Solution9 {
	  public boolean solution(int x) {
	        boolean answer = true;
	        String[] arr = Integer.toString(x).split("");
	        
	        int plus = 0;
	        
	        for(int i=0;i<arr.length;i++){
	            plus = plus + Integer.parseInt(arr[i]);
	        }
	        
	        if(x%plus !=0){
	            answer = false;
	        }
	        return answer;
	    }
}