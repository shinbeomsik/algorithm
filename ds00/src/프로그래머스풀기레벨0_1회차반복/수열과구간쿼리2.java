package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 수열과구간쿼리2 {

	public static void main(String[] args) {
		Solution188 sol = new Solution188();
		int[] arr = {}; 
		int[][] queries = {};

		int[] answer = sol.solution(arr, queries);
		System.out.println(answer);

	}
}

class Solution188 {
	 public int[] solution(int[] arr, int[][] queries) {
	        int[] answer = new int[queries.length];
	        
	        for(int i=0;i<queries.length;i++){
	            for(int j =0; j<queries[i].length;j++){
	                List<Integer> krr  = new ArrayList<>();
	                for(int k=queries[i][0]; k<=queries[i][1];k++){
	                    krr.add(arr[k]);
	                
	                }
	                Collections.sort(krr);
	                for(int q=0;q<krr.size(); q++){
	                    if(krr.get(q) > queries[i][2]){
	                        answer[i] = krr.get(q);
	                        break;
	                    }else{
	                        answer[i] = -1;
	                    }
	                }
	            }
	     
	        }
	        
	        return answer;
	    }
}