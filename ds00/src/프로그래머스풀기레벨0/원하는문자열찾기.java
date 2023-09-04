
package 프로그래머스풀기레벨0;
import java.util.*;

public class 원하는문자열찾기 {

	public static void main(String[] args) {
		Solution29 sol = new Solution29();
		String myString = "AbCdEfG";
		String pat = "aBc";
		int answer = sol.solution(myString, pat);
		System.out.println(answer);

	}
}

class Solution29 {
	public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        if(myString.contains(pat)) {
        	answer =1;
        }
        return answer;
    }
}