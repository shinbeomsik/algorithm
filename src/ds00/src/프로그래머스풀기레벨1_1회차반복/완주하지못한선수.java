package 프로그래머스풀기레벨1_1회차반복;

import java.util.*;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		Solution53 sol = new Solution53();
		String[] participant = {};
		String[] completion = {};

		String answer = sol.solution(participant, completion);
		System.out.println(answer);

	}
}

class Solution53 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}
		}
		if (answer.equals("")) {
			answer = participant[participant.length - 1];
		}
		return answer;
	}
}