package 프로그래머스풀기레벨0_1회차반복;



public class 정수찾기 {

	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		int n = 70;
		int[] num_list = {};

		int answer = sol.solution(num_list, n);
		System.out.println(answer);

	}
}

class Solution56 {
	 public int solution(int[] num_list, int n) {
	        int answer = 0;
	        for(int i=0;i<num_list.length;i++){
	            if(num_list[i] ==n){
	                answer = 1;
	            }
	        }
	        return answer;
	    }
}