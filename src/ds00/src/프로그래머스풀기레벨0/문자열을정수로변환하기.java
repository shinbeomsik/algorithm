
package 프로그래머스풀기레벨0;
import java.util.*;

public class 문자열을정수로변환하기 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		String n_str = "8542";

		int answer = sol.solution(n_str);
		System.out.println(answer);

	}
}

class Solution3 {
	public int solution(String n_str) {
        int answer = 0;
        answer = Integer.parseInt(n_str);
        return answer;
    }
}