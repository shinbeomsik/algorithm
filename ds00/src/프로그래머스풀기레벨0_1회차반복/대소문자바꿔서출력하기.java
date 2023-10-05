package 프로그래머스풀기레벨0_1회차반복;

import java.util.Scanner;

public class 대소문자바꿔서출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String answer = "";
		char[] arr = a.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < 'a') {
				answer = answer + Character.toLowerCase(arr[i]);
			}else {
				answer  = answer  +  Character.toUpperCase(arr[i]);
			}
		}
		System.out.println(answer);
	}
}
