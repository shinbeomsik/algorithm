package 프로그래머스풀기레벨0_1회차반복;

public class 특정문자제거하기 {

	public static void main(String[] args) {
		Solution25 sol = new Solution25();
		String my_string = ""; 
		String letter = "";

		String answer = sol.solution(my_string, letter);
		System.out.println(answer);

	}
}

class Solution25 {
	public String solution(String my_string, String letter) {
		String answer = my_string.replaceAll(letter, "");
		return answer;
	}
}