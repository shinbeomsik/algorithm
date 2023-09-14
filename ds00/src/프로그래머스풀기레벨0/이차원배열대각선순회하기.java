package 프로그래머스풀기레벨0;


public class 이차원배열대각선순회하기 {

	public static void main(String[] args) {
		Solution93 sol = new Solution93();
		int[][] board = {{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}}; 
		int k = 2;

		int answer = sol.solution(board, k);
		System.out.println(answer);

	}
}  

class Solution93 {
	 public int solution(int[][] board, int k) {
	        int answer = 0;
	        for(int i=0;i<board.length;i++) {
	        	for(int j=0;j<board[i].length;j++) {
	        		if(i+j <=k) {
	        			answer = answer + board[i][j];
	        		}
	        	}
	        }
	        return answer;
	    }
}