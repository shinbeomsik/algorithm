package 프로그래머스풀기레벨0_1회차반복;

public class 공백으로구분하기1 {

	public static void main(String[] args) {
		Solution82 sol = new Solution82();
		String my_string = "";
		String[] answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution82 {
	public String[] solution(String my_string) {
		String[] answer = my_string.split(" ");
		return answer;
	}
}