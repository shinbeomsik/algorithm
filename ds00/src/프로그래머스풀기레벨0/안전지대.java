package 프로그래머스풀기레벨0;


public class 안전지대 {

	public static void main(String[] args) {
		Solution157 sol = new Solution157();
		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, 
					     {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, 
						 {0, 0, 0, 0, 0}};

		int answer = sol.solution(board);
		System.out.println(answer);

	}
}  

class Solution157 {
	  public int solution(int[][] board) {
	        int answer = 0;
	        return answer;
	    }
}


//class Solution {
//    public int solution(int[][] board) {
//        int[][] boomBoard = new int[board.length][board[0].length];
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                if (board[i][j] == 1) checkExplosion(i, j, boomBoard);
//            }
//        }
//
//        int count = 0;
//        for (int[] array : boomBoard) {
//            for (int value : array) {
//                if (value == 0) count++;
//            }
//        }
//        return count;
//    }
//
//    static void checkExplosion(int x, int y, int[][] boomBoard) {
//        int explosionX;
//        int explosionY;
//        int[] aroundX = {0, -1, -1, -1, 0, 0, 1, 1, 1};
//        int[] aroundY = {0, -1, 0, 1, -1, 1, -1, 0, 1};
//        for (int i = 0; i < 9; i++) {
//            explosionX = x + aroundX[i];
//            explosionY = y + aroundY[i];
//            if (explosionX < boomBoard.length && explosionY < boomBoard.length)
//                if (explosionX >= 0 && explosionY >= 0) boomBoard[explosionX][explosionY] = 1;
//        }
//    }
//}