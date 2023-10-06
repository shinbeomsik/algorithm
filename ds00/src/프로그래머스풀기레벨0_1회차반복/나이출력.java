package 프로그래머스풀기레벨0_1회차반복;

public class 나이출력 {

	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		int age = 40;

		int answer = sol.solution(age);
		System.out.println(answer);

	}
}

class Solution6 {
	 public int solution(int age) {
	        int answer = 0;
	        answer = 2022 - age + 1;
	        return answer;
	    }
}