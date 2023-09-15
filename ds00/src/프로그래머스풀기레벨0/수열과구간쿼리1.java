package 프로그래머스풀기레벨0;


public class 수열과구간쿼리1 {

	public static void main(String[] args) {
		Solution96 sol = new Solution96();
		int[] arr = {0, 1, 2, 3, 4}; 
		int[][] queries = {{0, 1},{1, 2},{2, 3}};

		int[] answer = sol.solution(arr, queries);
		System.out.println(answer);

	}
}  

class Solution96 {
	public int[] solution(int[] arr, int[][] queries) {
        for ( int[] query : queries ) {
            int s = query[ 0 ];
            int e = query[ 1 ];
            for ( int i = s; i <= e; i++ ) {
                arr[ i ] += 1;
            }
        }
        return arr;
    }
}