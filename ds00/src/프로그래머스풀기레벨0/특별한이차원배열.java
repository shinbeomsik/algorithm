package 프로그래머스풀기레벨0;


public class 특별한이차원배열 {

	public static void main(String[] args) {
		Solution75 sol = new Solution75();
		int n = 6;

		int[][] answer = sol.solution(n);
		System.out.println(answer);

	}
}  

class Solution75 {
	 public int[][] solution(int n) {
	        int[][] answer = new int[n][n];
	        for(int i=0; i<n;i++) {
	        	for(int j=0;j<n;j++) {
	        		if(i==j) {
	        			answer[i][i] = 1;
	        		}else {
	        			answer[i][j] = 0;
	        		}
	        	}
	        }
	        return answer;
	    }
}