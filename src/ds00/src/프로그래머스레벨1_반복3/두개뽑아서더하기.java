package 프로그래머스레벨1_반복3;

import java.util.*;

public class 두개뽑아서더하기 {

}

class Solution33 {
	public List<Integer> solution(int[] numbers) {
		List<Integer> answer = new ArrayList<>();
		List<Integer> answer2 = new ArrayList<>();
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				answer2.add(numbers[i] + numbers[j]);
			}
		}
		Collections.sort(answer2);
		answer.add(answer2.get(0));
		for (int i = 1; i < answer2.size(); i++) {
			if ((int) answer2.get(i) != (int) answer2.get(i - 1)) {
				answer.add(answer2.get(i));
			}
		}
		return answer;
	}
}