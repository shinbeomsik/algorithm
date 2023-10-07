package 프로그래머스풀기레벨0_1회차반복;



public class 소문자로바꾸기 {

	public static void main(String[] args) {
		Solution42 sol = new Solution42();
		String myString = "";

		String answer = sol.solution(myString);
		System.out.println(answer);

	}
}

class Solution42 {
	  public String solution(String myString) {
	        String answer = "";
	        answer = myString.toLowerCase();
	        return answer;
	    }
}