package 프로그래머스풀기레벨0_1회차반복;



public class 문자열뒤에n글자 {

	public static void main(String[] args) {
		Solution47 sol = new Solution47();
		int n = 70;
		String my_string = "";
		String answer = sol.solution(my_string, n);
		System.out.println(answer);

	}
}

class Solution47 {
	public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length()-n);
        return answer;
    }
}