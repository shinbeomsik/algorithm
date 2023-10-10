package 프로그래머스풀기레벨0_1회차반복;



public class 특별한이차원배열2 {

	public static void main(String[] args) {
		Solution105 sol = new Solution105();
		int[][] arr = {};

		int answer = sol.solution(arr);
		System.out.println(answer);

	}
}

class Solution105 {
	  public int solution(int[][] arr) {
	        int answer = 0;
	        for(int i=0;i<arr.length;i++){
	            int k = 0;
	           if(arr[i][k] == arr[k][i]){
	               answer = 1;
	           }else{
	               answer =0;
	               break;
	           }
	            k++;
	        }
	        return answer;
	    }
}