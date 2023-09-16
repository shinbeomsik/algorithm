package 프로그래머스풀기레벨0;


public class 수열과구간쿼리3 {

	public static void main(String[] args) {
		Solution103 sol = new Solution103();
		int[] arr = {0, 1, 2, 3, 4}; 
		int[][] queries = {{0, 3},{1, 2},{1, 4}};
		
		int[] answer = sol.solution(arr, queries);
		System.out.println(answer);

	}
}  

class Solution103 {
	 public int[] solution(int[] arr, int[][] queries) {
	        for ( int[] query : queries ) {
	            int s = query[ 0 ];
	            int e = query[ 1 ];
	            int result = arr[s];
	            arr[s] = arr[e];
	            arr[e] = result; 
	        }
	        return arr;
	    }
}