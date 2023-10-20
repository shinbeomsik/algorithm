package 프로그래머스풀기레벨0_1회차반복;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		Solution162 sol = new Solution162();
		String s = "";

		String answer = sol.solution(s);
		System.out.println(answer);

	}
}

class Solution162 {
	public static String solution(String s) {
		String answer = "";

		int[] alphabet = new int[26];

		for (int i = 0; i < s.length(); i++) {
			alphabet[s.charAt(i) - 97] += 1;
		}

		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] == 1) {
				answer += (char) (i + 97);
			}
		}
		return answer;
	}
}