package 프로그래머스풀기레벨0_1회차반복;

public class 문자열계산하기 {

	public static void main(String[] args) {
		Solution172 sol = new Solution172();
		String my_string = "";

		int answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution172 {
	public int solution(String my_string) {

		String[] arr = my_string.split(" ");
		int answer = Integer.parseInt(arr[0]);
		for (int i = 1; i < arr.length; i = i + 2) {
			if (arr[i].equals("+")) {
				answer = answer + Integer.parseInt(arr[i + 1]);
			} else if (arr[i].equals("-")) {
				answer = answer - Integer.parseInt(arr[i + 1]);
			}
		}
		return answer;
	}
}