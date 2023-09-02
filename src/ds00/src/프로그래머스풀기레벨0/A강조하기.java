
package 프로그래머스풀기레벨0;

import java.util.*;

public class A강조하기 {

	public static void main(String[] args) {
		Solution28 sol = new Solution28();
		String myString = "abstract algebra";

		String answer = sol.solution(myString);
		System.out.println(answer);

	}
}

class Solution28 {
	public String solution(String myString) {
		String answer = "";
		String[] arr = myString.split("");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("a")) {
				arr[i] = "A";
			} else if (arr[i].equals("A")) {
				arr[i] = "A";
			} else {
				arr[i] = arr[i].toLowerCase();
			}
		}
		answer = String.join("", arr);
		return answer;
	}
}