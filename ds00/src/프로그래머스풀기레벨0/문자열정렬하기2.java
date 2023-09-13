package 프로그래머스풀기레벨0;

import java.util.*;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		Solution87 sol = new Solution87();
		String my_string = "Bcad";

		String answer = sol.solution(my_string);
		System.out.println(answer);

	}
}  

class Solution87 {
	public String solution(String my_string) {
        String answer = "";
        answer = my_string.toLowerCase();
        String[] arr = answer.split("");
        Arrays.sort(arr);
        answer = String.join("", arr);
        return answer;
    }
}