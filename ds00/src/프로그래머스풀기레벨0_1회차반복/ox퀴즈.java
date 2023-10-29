package 프로그래머스풀기레벨0_1회차반복;

public class ox퀴즈 {

	public static void main(String[] args) {
		Solution187 sol = new Solution187();
		String[] quiz = {};

		String[] answer = sol.solution(quiz);
		System.out.println(answer);

	}
}

class Solution187 {
	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];

		for (int i = 0; i < quiz.length; i++) {
			String[] arr = quiz[i].split(" ");
			for (int j = 0; j < arr.length; j++) {
				if (arr[1].equals("+")) {
					if ((Integer.parseInt(arr[0]) + Integer.parseInt(arr[2])) == Integer
							.parseInt(arr[arr.length - 1])) {
						answer[i] = "O";
					} else {
						answer[i] = "X";
					}
				} else if (arr[1].equals("-")) {
					if ((Integer.parseInt(arr[0]) - Integer.parseInt(arr[2])) == Integer
							.parseInt(arr[arr.length - 1])) {
						answer[i] = "O";
					} else {
						answer[i] = "X";
					}
				}
			}
		}
		return answer;
	}
}