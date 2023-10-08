package 프로그래머스풀기레벨0_1회차반복;



public class 문자열을정수로변환하기 {

	public static void main(String[] args) {
		Solution58 sol = new Solution58();
		String n_str = "";

		int answer = sol.solution(n_str);
		System.out.println(answer);

	}
}

class Solution58 {
	 public int solution(String n_str) {
	        int answer = 0;
	        answer = Integer.parseInt(n_str);
	        return answer;
	    }
}