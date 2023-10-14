package 프로그래머스풀기레벨0_1회차반복;



public class 이차원배열대각선순회하기 {

	public static void main(String[] args) {
		Solution139 sol = new Solution139();
		int[][] board = {}; 
		int k =1;

		int answer = sol.solution(board, k);
		System.out.println(answer);

	}
}

class Solution139 {
	public int solution(int[][] board, int k) {
        int answer = 0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(i+j <=k){
                    answer = answer + board[i][j];
                }
            }
        }
        return answer;
    }
}