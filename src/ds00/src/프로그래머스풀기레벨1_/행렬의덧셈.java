package 프로그래머스풀기레벨1_;



public class 행렬의덧셈 {

	public static void main(String[] args) {
		Solution27 sol = new Solution27();
		int[][] arr1 = {}; 
		int[][] arr2 = {};

		int[][] answer = sol.solution(arr1, arr2);
		System.out.println(answer);
	} 
}

class Solution27 {
	 public int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = new int[arr1.length][arr1[0].length];
	        
	        for(int i=0;i<arr1.length;i++){
	            for(int j=0;j<arr1[0].length;j++){
	                answer[i][j] = arr1[i][j] + arr2[i][j];
	            }
	        }
	        return answer;
	    }
}