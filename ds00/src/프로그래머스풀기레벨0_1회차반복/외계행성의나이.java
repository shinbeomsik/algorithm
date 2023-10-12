package 프로그래머스풀기레벨0_1회차반복;

public class 외계행성의나이 {

	public static void main(String[] args) {
		Solution116 sol = new Solution116();
		int age = 70;

		String answer = sol.solution(age);
		System.out.println(answer);

	}
}

class Solution116 {
	public String solution(int age) {
		String answer = "";
		String k = Integer.toString(age);
		String[] arr = k.split("");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("0")) {
				answer = answer + "a";
			} else if (arr[i].equals("1")) {
				answer = answer + "b";
			} else if (arr[i].equals("2")) {
				answer = answer + "c";
			} else if (arr[i].equals("3")) {
				answer = answer + "d";
			} else if (arr[i].equals("4")) {
				answer = answer + "e";
			} else if (arr[i].equals("5")) {
				answer = answer + "f";
			} else if (arr[i].equals("6")) {
				answer = answer + "g";
			} else if (arr[i].equals("7")) {
				answer = answer + "h";
			} else if (arr[i].equals("8")) {
				answer = answer + "i";
			} else if (arr[i].equals("9")) {
				answer = answer + "j";
			}
		}

		return answer;
	}
}