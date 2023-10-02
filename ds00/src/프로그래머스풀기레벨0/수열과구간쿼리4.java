package 프로그래머스풀기레벨0;

import java.util.*;

public class 수열과구간쿼리4 {

	public static void main(String[] args) {
		Solution162 sol = new Solution162();
		int[] arr = {0, 1, 2, 4, 3}; 
		int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};

		int[] answer = sol.solution(arr, queries);
		System.out.println(Arrays.toString(answer));

	}
}  

class Solution162 {
	 public int[] solution(int[] arr, int[][] queries) {
	        int[] answer = arr;
	        
	        for(int i=0;i<queries.length;i++) {
	        	for(int j=queries[i][0]; j<=queries[i][1]; j++) {
	        		if(j%queries[i][2] ==0) {
	        			answer[j]++;
	        		}
	        	}
	        }
	        return answer;
	    }
}