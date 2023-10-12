package 프로그래머스풀기레벨1_1회차반복;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		Solution26 sol = new Solution26();
		String s = "";

		boolean answer = sol.solution(s);
		System.out.println(answer);
	}
}

class Solution26 {
	public boolean solution(String s) {
		boolean answer = true;
		String[] arr = s.split("");
		for (int i = 0; i < arr.length; i++) {
			if (s.length() == 4 || s.length() == 6) {
				if (arr[i].equals("0") || arr[i].equals("1") || arr[i].equals("2") || arr[i].equals("3")
						|| arr[i].equals("4") || arr[i].equals("5") || arr[i].equals("6") || arr[i].equals("7")
						|| arr[i].equals("8") || arr[i].equals("9")) {
					answer = true;
				} else {
					answer = false;
					break;
				}
			} else {
				answer = false;
			}
		}
		return answer;
	}
}