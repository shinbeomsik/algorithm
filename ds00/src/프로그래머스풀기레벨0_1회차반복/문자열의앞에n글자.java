package 프로그래머스풀기레벨0_1회차반복;



public class 문자열의앞에n글자 {

	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		String my_string = ""; 
		int n = 1;

		String answer = sol.solution(my_string, n);
		System.out.println(answer);

	}
}

class Solution45 {
	 public String solution(String my_string, int n) {
	        String answer = "";
	        answer = my_string.substring(0,n);
	        return answer;
	    }
}