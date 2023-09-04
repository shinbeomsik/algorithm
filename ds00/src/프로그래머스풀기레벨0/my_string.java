
package 프로그래머스풀기레벨0;
import java.util.*;

public class my_string {

	public static void main(String[] args) {
		Solution26 sol = new Solution26();
		String rny_string = "masterpiece";

		String answer = sol.solution(rny_string);
		System.out.println(answer);

	}
}

class Solution26 {
	 public String solution(String rny_string) {
	        String answer = "";
	        String[] a = rny_string.split("");
	        for(int i=0; i<a.length;i++) {
	        	if(a[i].equals("m")) {
	        		a[i]= "rn";
	        	}
	        }
	        answer = String.join("",a);
	        return answer;
	    }
}