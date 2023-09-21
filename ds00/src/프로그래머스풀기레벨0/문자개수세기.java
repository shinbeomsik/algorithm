package 프로그래머스풀기레벨0;

public class 문자개수세기 {

	public static void main(String[] args) {
		Solution127 sol = new Solution127();
		String my_string = "Programmers";

		int[] answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution127 {
	public int[] solution(String my_string) {
		int[] answer = new int[52];
		for (int i = 0; i < my_string.length(); i++) {
			char c = my_string.charAt(i);

			if (c >= 'A' && c <= 'Z') {
				answer[c - 'A']++;
			} else if (c >= 'a' && c <= 'z') {
				answer[26 + c - 'a']++;
			}
		}
		return answer;
	}
}