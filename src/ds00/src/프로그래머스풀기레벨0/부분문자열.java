
package 프로그래머스풀기레벨0;
import java.util.*;

public class 부분문자열 {

	public static void main(String[] args) {
		Solution27 sol = new Solution27();
		String str1 = "abd";
		String str2 = "aabcc";

		int answer = sol.solution(str1, str2);
		System.out.println(answer);

	}
}

class Solution27 {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str2.contains(str1)) {
        	answer =1;
        }
        return answer;
    }
}