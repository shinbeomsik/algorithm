package 프로그래머스풀기레벨0_1회차반복;

public class 두수의곱 {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int num1  = 3;
		int num2  = 4;
		int answer = sol.solution(num1, num2);
		System.out.println(answer);

	}
}

class Solution4 {
	 public int solution(int num1, int num2) {
	        int answer = 0;
	        answer = num1*num2;
	        return answer;
	    }
}