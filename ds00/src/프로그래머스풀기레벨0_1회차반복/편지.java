package 프로그래머스풀기레벨0_1회차반복;

public class 편지 {

	public static void main(String[] args) {
		Solution16 sol = new Solution16();
		String message = "I love you~";

		int answer = sol.solution(message);
		System.out.println(answer);

	}
}

class Solution16 {
	public int solution(String message) {
        int answer = message.length() *2;
        
        return answer;
    }
}