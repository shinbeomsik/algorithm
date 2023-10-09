package 프로그래머스풀기레벨0_1회차반복;



public class A강조하기 {

	public static void main(String[] args) {
		Solution94 sol = new Solution94();
		String myString = "";

		String answer = sol.solution(myString);
		System.out.println(answer);

	}
}

class Solution94 {
	   public String solution(String myString) {
	        myString = myString.toLowerCase();
	        String answer =myString.replace("a" , "A");

	        return answer;
	    }
}