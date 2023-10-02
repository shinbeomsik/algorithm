package 프로그래머스풀기레벨0;

import java.util.*;
public class 정수를나선형으로배치하기 {

	public static void main(String[] args) {
		Solution160 sol = new Solution160();
		int n = 5;

		int[][] answer = sol.solution(n);
		  for (int i = 0; i < answer.length; i++) {
	            for (int j = 0; j < answer[i].length; j++) {
	                System.out.print(answer[i][j] + " ");
	            }
	            System.out.println(); 
	        }
		
	}
}  

class Solution160 {
	  public int[][] solution(int n) {
	        int[][] answer = new int[n][n];

	        int num = 1; // 배열에 채워질 정수 값
	        int rowStart = 0; // 행의 시작 인덱스
	        int rowEnd = n - 1; // 행의 끝 인덱스
	        int colStart = 0; // 열의 시작 인덱스
	        int colEnd = n - 1; // 열의 끝 인덱스

	        while (num <= n * n) {
	            // 왼쪽 -> 오른쪽
	            for (int i = colStart; i <= colEnd; i++) {
	                answer[rowStart][i] = num++;
	            }
	            rowStart++; // 행의 시작 인덱스 증가

	            // 위쪽 -> 아래쪽
	            for (int i = rowStart; i <= rowEnd; i++) {
	                answer[i][colEnd] = num++;
	            }
	            colEnd--; // 열의 끝 인덱스 감소

	            // 오른쪽 -> 왼쪽
	            for (int i = colEnd; i >= colStart; i--) {
	                answer[rowEnd][i] = num++;
	            }
	            rowEnd--; // 행의 끝 인덱스 감소

	            // 아래쪽 -> 위쪽
	            for (int i = rowEnd; i >= rowStart; i--) {
	                answer[i][colStart] = num++;
	            }
	            colStart++; // 열의 시작 인덱스 증가
	        }

	        return answer;
	    }
}