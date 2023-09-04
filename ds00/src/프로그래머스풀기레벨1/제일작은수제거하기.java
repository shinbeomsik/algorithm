
package 프로그래머스풀기레벨1;

import java.util.*;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		Solution15 sol = new Solution15();
		int[] arr = {1};

		int[] answer = sol.solution(arr);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution15 {
	   public int[] solution(int[] arr) {
	        int[] answer = new int[arr.length-1];
	        int min = arr[0];
	        if (arr.length==1) {
	        	return new int[] {-1};
	        }
	        
	        if(arr.length>1) {
	        	for(int i=0; i<arr.length;i++) {
	        		if(min >arr[i]) {
	        			min = arr[i];
	        		}
	        	}
	        }
	        
	        int index = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != min) {
	                answer[index] = arr[i]; 
	                index++; 
	            }
	        }
	        return answer;
	    }
}