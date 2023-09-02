
package 프로그래머스풀기레벨0;
import java.util.*;

public class 문자열앞의N글자 {

	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		String my_string = "ProgrammerS123";
		int n = 11;

		String answer = sol.solution(my_string, n);
		System.out.println(answer);

	}
}

class Solution12 {
    public String solution(String my_string, int n) {
        String answer = "";
        answer =  my_string.substring(0, my_string.length()-(my_string.length()-n));
        return answer;
    }
}