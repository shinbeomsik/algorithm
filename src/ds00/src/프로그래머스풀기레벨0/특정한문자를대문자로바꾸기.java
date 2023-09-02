
package 프로그래머스풀기레벨0;
import java.util.*;

public class 특정한문자를대문자로바꾸기 {

	public static void main(String[] args) {
		Solution24 sol = new Solution24();
		String my_string = "programmers";
		String alp ="p";
		String answer = sol.solution(my_string, alp);
		System.out.println(answer);

	}
}

class Solution24 {
	 public String solution(String my_string, String alp) {
	        String answer = "";
	        String[] a = my_string.split("");
	        for(int i=0; i<a.length;i++) {
	        	if(a[i].equals(alp)) {
	        		a[i] = a[i].toUpperCase();
	        	}
	        }
	        answer = String.join("",a);
	        return answer;
	    }
}