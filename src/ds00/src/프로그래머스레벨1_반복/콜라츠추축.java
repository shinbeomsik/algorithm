package 프로그래머스레벨1_반복;

public class 콜라츠추축 {
}

class Solution13 {
	public int solution(long num) {
		int answer = -1;
		int count = 0;
		if (num != 1) {
			while (count != 501) {
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = num * 3 + 1;
				}
				count++;
				if (num == 1) {
					break;
				}
			}
			if (num == 1) {
				answer = count;
			}
			if (answer > 500) {
				answer = -1;
			}
		} else {
			answer = 0;
		}
		return answer;
	}
}