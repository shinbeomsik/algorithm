
package 프로그래머스풀기레벨1;

import java.util.*;

public class 핸드폰번호가리기 {

	public static void main(String[] args) {
		Solution10 sol = new Solution10();
		String phone_number = "01033334444";

		String answer = sol.solution(phone_number);
		System.out.println(answer);

	}
}

class Solution10 {
	public String solution(String phone_number) {
        String answer = "";
       String[] s = phone_number.split("");
       for(int i=0;i<s.length-4;i++) {
    	   s[i] = "*";
       }
       System.out.println(Arrays.toString(s));
       answer = Arrays.toString(s);
       answer = answer.replaceAll(", ", "");
       answer = answer.replace("[", "");
       answer = answer.replace("]", "");
        return answer;
    }
}