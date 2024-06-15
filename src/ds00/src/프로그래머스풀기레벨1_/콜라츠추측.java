package 프로그래머스풀기레벨1_1회차반복;

public class 콜라츠추측 {

	public static void main(String[] args) {
		Solution14 sol = new Solution14();
		int num = 70;

		int answer = sol.solution(num);
		System.out.println(answer);
	}
}

class Solution14 {
	public int solution(int num) {
		long num2 = num;
		int answer = 0;
		int count = 0;
		if (num == 1) {
			return answer;
		} else {
			while (num2 != 1) {
				if (num2 % 2 == 0) {
					num2 = num2 / 2;
				} else {
					num2 = num2 * 3 + 1;
				}
				count++;

				if (count > 500) {
					break;
				}
			}

			if (num2 == 1 && count <= 500) {
				answer = count;
			} else {
				answer = -1;
			}
		}

		return answer;
	}
}