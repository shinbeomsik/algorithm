
package 프로그래머스풀기레벨0;
import java.util.*;

public class 소문자로바꾸기_9 {

	public static void main(String[] args) {
		Solution10 sol = new Solution10();
		String myString = "aBcDeFg";

		String answer = sol.solution(myString);
		System.out.println(answer);

	}
}

class Solution10 {
    public String solution(String myString) {
        String answer = "";
        answer = myString.toLowerCase();
        return answer;
    }
}