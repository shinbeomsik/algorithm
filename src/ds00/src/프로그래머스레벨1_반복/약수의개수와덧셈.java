package 프로그래머스레벨1_반복;

public class 약수의개수와덧셈 {
}

class Solution23 {
	public int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			int count = 1;
			int sum = 0;
			while (count != i + 1) {
				if (i % count == 0) {
					sum++;
				}
				count++;
			}
			if (sum % 2 == 0) {
				answer = answer + i;
			} else {
				answer = answer - i;
			}
		}
		return answer;
	}
}