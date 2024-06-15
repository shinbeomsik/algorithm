package 프로그래머스풀기레벨1_1회차반복;

public class 문자열내p와y의개수 {

	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		String s = "";

		boolean answer = sol.solution(s);
		System.out.println(answer);
	}
}

class Solution8 {
	boolean solution(String s) {
		boolean answer = true;
		int pcount = 0;
		int ycount = 0;
		s = s.toLowerCase();
		String[] arr = s.split("");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("p")) {
				pcount++;
			} else if (arr[i].equals("y")) {
				ycount++;
			}
		}
		if (pcount != ycount) {
			answer = false;
		}
		return answer;
	}
}