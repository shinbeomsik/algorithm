package 프로그래머스풀기레벨0;

public class 공던지기 {

	public static void main(String[] args) {
		Solution125 sol = new Solution125();
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int k = 5;

		int answer = sol.solution(numbers, k);
		System.out.println(answer);

	}
}

class Solution125 {
	public int solution(int[] numbers, int k) {
		int answer = 0;
		int count = 0;

		for (int i = 1; i < k; i++) {
			count = count + 2;
		}
		count  = count%numbers.length;
		answer = numbers[count];
		return answer;
	}
}