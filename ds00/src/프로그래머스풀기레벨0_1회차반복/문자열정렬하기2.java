package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		Solution130 sol = new Solution130();
		String my_string= "";

		String answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution130 {
	 public String solution(String my_string) {
	        String answer = "";
	        my_string = my_string.toLowerCase();
	        String[] arr = my_string.split("");
	        Arrays.sort(arr);
	        answer = String.join("",arr);
	        return answer;
	    }
}