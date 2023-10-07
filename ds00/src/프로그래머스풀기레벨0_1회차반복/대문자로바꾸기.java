package 프로그래머스풀기레벨0_1회차반복;



public class 대문자로바꾸기 {

	public static void main(String[] args) {
		Solution52 sol = new Solution52();
		String myString = "";

		String answer = sol.solution(myString);
		System.out.println(answer);

	}
}

class Solution52 {
	 public String solution(String myString) {
	        String answer = myString.toUpperCase();
	        return answer;
	    }
}