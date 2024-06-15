package 프로그래머스레벨1_반복;

public class 문자열나누기 {

}

class Solution63 {
	public int solution(String s) {
		int answer = 0;
		String[] arr = s.split("");
		int x = 0;
		int y = 0;
		String www = "";
		for (int i = 0; i < arr.length; i++) {
			if (x == y) {
				www = arr[i];
			}

			if (www.equals(arr[i])) {
				x++;
			} else {
				y++;
			}

			if (x == y) {
				answer++;
				x = 0;
				y = 0;
			}

		}

		if (x != y) {
			answer++;
		}

		return answer;
	}
}