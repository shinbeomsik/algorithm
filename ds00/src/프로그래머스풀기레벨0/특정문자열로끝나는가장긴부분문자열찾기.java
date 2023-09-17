package 프로그래머스풀기레벨0;


public class 특정문자열로끝나는가장긴부분문자열찾기 {

	public static void main(String[] args) {
		Solution108 sol = new Solution108();
		String myString = "AAAAaaaa"; 
		String pat = "a";

		String answer = sol.solution(myString, pat);
		System.out.println(answer);

	}
}  

class Solution108 {
	public String solution(String myString, String pat) {
        String answer = "";
        answer = myString.substring(0,myString.lastIndexOf(pat) + pat.length()) ;
        return answer;
    }
}