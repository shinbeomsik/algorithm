package 프로그래머스풀기레벨0_1회차반복;

public class 두수의합 {

	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		int num1 = 2; 
		int num2 = 3;

		int answer = sol.solution(num1, num2);
		System.out.println(answer);

	}
}

class Solution8 {
	public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 + num2;
        return answer;
    }
}