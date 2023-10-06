package 프로그래머스풀기레벨0_1회차반복;

public class 숫자비교하기 {

	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		int num1 = 2; 
		int num2 = 3;

		int answer = sol.solution(num1, num2);
		System.out.println(answer);

	}
}

class Solution7 {
	 public int solution(int num1, int num2) {
	        int answer = -1;
	        
	        if(num1 == num2 ) {
	        	answer = 1;
	        }
	        
	        return answer;
	    }
}