package 프로그래머스풀기레벨0_1회차반복;

public class 숨어있는숫자의덧셈2 {

	public static void main(String[] args) {
		Solution150 sol = new Solution150();
		String my_string = "";

		int answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution150 {
	public int solution(String my_string) {
		int answer = 0;
		my_string = my_string.toUpperCase().replaceAll("A", " ").replaceAll("B", " ").replaceAll("C", " ")
				.replaceAll("D", " ").replaceAll("E", " ").replaceAll("F", " ").replaceAll("G", " ")
				.replaceAll("H", " ").replaceAll("I", " ").replaceAll("J", " ").replaceAll("K", " ")
				.replaceAll("L", " ").replaceAll("M", " ").replaceAll("N", " ").replaceAll("O", " ")
				.replaceAll("P", " ").replaceAll("Q", " ").replaceAll("R", " ").replaceAll("S", " ")
				.replaceAll("T", " ").replaceAll("U", " ").replaceAll("W", " ").replaceAll("X", " ")
				.replaceAll("Y", " ").replaceAll("Z", " ");

		String[] arr = my_string.split(" ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].replaceAll(" ", "");
			if (arr[i].length() != 0) {
				answer = answer + Integer.parseInt(arr[i]);
			}
		}

		return answer;
	}
}