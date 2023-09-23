package 프로그래머스풀기레벨0;

import java.util.*;

public class 그림확대 {

	public static void main(String[] args) {
		Solution138 sol = new Solution138();
		String[] picture = { "x.x", ".x.", "x.x" };
		int k = 3;

		List<String> answer = sol.solution(picture, k);
		System.out.println(answer);

	}
}

class Solution138 {
	public List<String> solution(String[] picture, int k) {
		List<String> answer = new ArrayList<>();
		for (int i = 0; i < picture.length; i++) {
			String a = "";
			for (int j = 0; j < picture[i].length(); j++) {
				char b = picture[i].charAt(j);
				for (int m = 1; m <= k; m++) {
					a = a + b;
				}
			}
			for (int m = 1; m <= k; m++) {
				answer.add(a);
			}
		}
		return answer;
	}


}