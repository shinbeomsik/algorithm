
package 프로그래머스풀기레벨0;
import java.lang.Character.Subset;
import java.util.*;

public class 문자열의뒤에n글자_11 {

	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		String my_string = "He110W0r1d";
		int n = 5;
		
		String answer = sol.solution(my_string, n);
		System.out.println(answer);

	}
}

class Solution11 {
	  public String solution(String my_string, int n) {
	        String answer = "";
	       answer =  my_string.substring( my_string.length()-n, my_string.length());
	      
 	        return answer;
	    }
}