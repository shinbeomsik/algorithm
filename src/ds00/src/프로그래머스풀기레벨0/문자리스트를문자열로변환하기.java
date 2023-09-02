
package 프로그래머스풀기레벨0;
import java.util.*;

public class 문자리스트를문자열로변환하기 {

	public static void main(String[] args) {
		Solution32 sol = new Solution32();
		String[] arr = {"a","b","c"};

		String answer = sol.solution(arr);
		System.out.println(answer);

	}
}

class Solution32 {
	 public String solution(String[] arr) {
	        String answer = "";
	        answer = String.join("", arr);
	        return answer;
	    }
}