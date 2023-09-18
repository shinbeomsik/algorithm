package 프로그래머스풀기레벨0;

import java.util.*;
public class 배열의길이를2의거듭제곱으로만들기 {

	public static void main(String[] args) {
		Solution114 sol = new Solution114();
		int[] arr = {1, 2, 3, 4, 5, 6};

		int[] answer = sol.solution(arr);
		System.out.println(Arrays.toString(answer));

	}
}  

class Solution114 {
	   public int[] solution(int[] arr) {
	        int len = arr.length;
	        
	        int pow = 0;
	        while(len > Math.pow(2, pow)) {
	            pow++;
	        }
	        
	        int[] answer = new int[(int)Math.pow(2, pow)];
	        for(int i = 0; i < len; i++) {
	            answer[i] = arr[i];
	        }
	        return answer;
	    }
}