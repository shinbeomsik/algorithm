package 프로그래머스풀기레벨0;

import java.util.*;
public class 분수의덧셈 {

	public static void main(String[] args) {
		Solution154 sol = new Solution154();
		int numer1 = 2;
		int denom1 = 2;
		int numer2 = 2; 
		int denom2 = 2;

		int[] answer = sol.solution(numer1, denom1, numer2, denom2);
		System.out.println(Arrays.toString(answer));

	}
}  

class Solution154 {
	 public int[] solution(int numer1, int denom1, int numer2, int denom2) {
	        int[] answer = new int[2];
	        int[] arr = new int[2];
	        
	       if(denom1%denom2 ==0) {
	    	   arr[1] = denom1;
	    	   arr[0] = numer1 + numer2*(denom1/denom2) ;
	       }else if(denom2%denom1 ==0) {
	    	   arr[1] = denom2;
	    	   arr[0] = numer1*(denom2/denom1) + numer2  ;
	       }else {
	    	   arr[1] = denom1*denom2;
	    	   arr[0] = numer1*denom2 + numer2*denom1;
	       }
	        int count = 0;
	      for(int i=1; i<=arr[1];i++) {
	    	  if(arr[0]%i ==0 && arr[1]%i ==0) {
	    		  answer[0] = arr[0]/i;
	    		  answer[1] = arr[1]/i;
	    		  count++;
	    	  }
	      }
	      System.out.println(count);
	        return answer;
	    }
}