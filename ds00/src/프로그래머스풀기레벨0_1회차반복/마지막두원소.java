package 프로그래머스풀기레벨0_1회차반복;

public class 마지막두원소 {

	public static void main(String[] args) {
		Solution76 sol = new Solution76();
		int[] num_list = {};

		int[] answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution76 {
	 public int[] solution(int[] num_list) {
			int[] answer = new int[num_list.length + 1];
			if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
				for (int i = 0; i < num_list.length; i++) {
					answer[i] = num_list[i];
				}
				answer[answer.length - 1] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
			} else {

				for (int i = 0; i < num_list.length; i++) {
					answer[i] = num_list[i];
				}
				answer[answer.length - 1] = answer[answer.length - 2] * 2;

			}
			return answer;
		}
}