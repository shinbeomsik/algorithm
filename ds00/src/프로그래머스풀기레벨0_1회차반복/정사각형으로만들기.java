package 프로그래머스풀기레벨0_1회차반복;



public class 정사각형으로만들기 {

	public static void main(String[] args) {
		Solution178 sol = new Solution178();
		int[][] arr = {};

		int[][] answer = sol.solution(arr);
		System.out.println(answer);

	}
}

class Solution178 {
	 public int[][] solution(int[][] arr) {
	        int[][] answer = {};
	        
	        if(arr.length != arr[0].length){
	            if(arr.length > arr[0].length){
	                answer = new int[arr.length][arr.length];
	                for(int i=0;i<arr.length;i++){
	                    for(int j=0;j<arr[0].length;j++){
	                        answer[i][j] = arr[i][j];
	                    }
	                }
	            }else {
	                answer = new int[arr[0].length][arr[0].length];
	                 for(int i=0;i<arr.length;i++){
	                    for(int j=0;j<arr[0].length;j++){
	                        answer[i][j] = arr[i][j];
	                    }
	                }
	            }
	        }else {
	            answer = new int[arr.length][arr[0].length];
	             for(int i=0;i<arr.length;i++){
	                    for(int j=0;j<arr[0].length;j++){
	                        answer[i][j] = arr[i][j];
	                    }
	                }
	        }
	        return answer;
	    }
}