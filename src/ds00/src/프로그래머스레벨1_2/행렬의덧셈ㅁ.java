package 프로그래머스레벨1_2;


public class 행렬의덧셈ㅁ {
	   
}

class Solution28 {
	 public int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = new int[arr1.length][arr1[0].length];
	        
	        for(int i=0;i<arr1.length;i++){
	            for(int j=0; j<arr1[i].length;j++){
	                answer[i][j] = arr1[i][j] + arr2[i][j];
	            }
	        }
	        return answer;
	    }
}