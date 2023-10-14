package 프로그래머스풀기레벨0_1회차반복;

public class 배열회전시키기 {

	public static void main(String[] args) {
		Solution120 sol = new Solution120();
		int[] numbers = {};
		String direction = " ";

		int[] answer = sol.solution(numbers, direction);
		System.out.println(answer);

	}
}

class Solution120 {
	public int[] solution(int[] numbers, String direction) {
		int[] answer = new int[numbers.length];
		if (direction.equals("right")) {
			for (int i = 1; i < numbers.length; i++) {
				answer[i] = numbers[i - 1];
			}
			answer[0] = numbers[numbers.length - 1];
		} else {
			for (int i = 1; i < numbers.length; i++) {
				answer[i - 1] = numbers[i];
			}
			answer[numbers.length - 1] = numbers[0];
		}
		return answer;
	}
}