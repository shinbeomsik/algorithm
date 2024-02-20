package 프로그래머스레벨1_반복2;


public class 이웃한칸 {
	   
}

class Solution67 {
	public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        if(w-1 >= 0){
            if(board[h][w-1].equals(board[h][w])){
                answer++;
            }
        }
        
        if(h-1>=0){
             if(board[h-1][w].equals(board[h][w])){
                answer++;
            }
        }
        
         if(h+1 <board.length){
             if(board[h+1][w].equals(board[h][w])){
                answer++;
            }
        }
        
         if(w+1 <board.length){
            if(board[h][w+1].equals(board[h][w])){
                answer++;
            }
        }
        return answer;
    }
}