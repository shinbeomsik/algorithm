package 프로그래머스풀기레벨0_1회차반복;



public class 특정한문자를대문자로바꾸기 {

	public static void main(String[] args) {
		Solution80 sol = new Solution80();
		String my_string = "";
		String alp = "";

		String answer = sol.solution(my_string, alp);
		System.out.println(answer);

	}
}

class Solution80 {
	public String solution(String my_string, String alp) {
        String answer = "";
        answer = my_string.replace(alp , alp.toUpperCase());
        return answer;
    }
}