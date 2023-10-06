package 프로그래머스풀기레벨0_1회차반복;

public class 몫구하기 {

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int num1 = 10; 
		int num2 = 5;

		int answer = sol.solution(num1, num2);
		System.out.println(answer);

	}
}

class Solution2 {
	 public int solution(int num1, int num2) {
	        int answer = 0;
	        answer = num1/num2;
	        return answer;
	    }
}