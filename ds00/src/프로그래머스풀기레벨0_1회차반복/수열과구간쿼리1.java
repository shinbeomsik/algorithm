package 프로그래머스풀기레벨0_1회차반복;



public class 수열과구간쿼리1 {

	public static void main(String[] args) {
		Solution137 sol = new Solution137();
		int[] arr = {}; 
		int[][] queries = {};

		int[] answer = sol.solution(arr, queries);
		System.out.println(answer);

	}
}

class Solution137 {
	 public int[] solution(int[] arr, int[][] queries) {
	        int[] answer = new int[arr.length];
	        for(int i=0;i<queries.length;i++){
	            for(int j=queries[i][0] ; j<=queries[i][1];j++){
	                arr[j]++;
	            }
	        }
	        answer = arr;
	        return answer;
	    }
}