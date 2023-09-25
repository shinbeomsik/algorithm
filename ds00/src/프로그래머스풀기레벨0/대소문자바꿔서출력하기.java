package 프로그래머스풀기레벨0;

import java.util.Scanner;

public class 대소문자바꿔서출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			char k = a.charAt(i);
			if (Character.isUpperCase(k)) {
				result.append(Character.toLowerCase(k));
			} else if (Character.isLowerCase(k)) {
				result.append(Character.toUpperCase(k));
			}

		}
		
		System.out.println(result);
	}
}
