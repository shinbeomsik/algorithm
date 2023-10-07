package 프로그래머스풀기레벨0_1회차반복;



public class 원소들의곱과합 {

	public static void main(String[] args) {
		Solution55 sol = new Solution55();
		int[] num_list = {};

		int answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution55 {
	 public int solution(int[] num_list) {
	        int answer = 0;
	        int plus = 0;
	        int x = 1;
	        
	        for(int i=0;i<num_list.length;i++){
	            plus = plus + num_list[i];
	            x = x * num_list[i];
	        }
	        
	        if(plus*plus > x){
	            answer =1;
	        }
	        return answer;
	    }
}