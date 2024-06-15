package 프로그래머스레벨1_3;
import java.util.*;

public class 두정수사이의합 {
	   
}

class Solution9 {
	  public long solution(int a, int b) {
	        long answer = 0;
	        
	        int[] arr = new int[2];
	        arr[0] = a;
	        arr[1] = b;
	        
	        Arrays.sort(arr);
	        
	        for(int i= arr[0] ; i<=arr[1];i++){
	            answer = answer + i;
	        }
	        return answer;
	    }
}