
package 프로그래머스풀기레벨1;

import java.util.Scanner;

public class 직사각형별찍기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		String garo = "";
		for (int i = 0; i < a; i++) {
			garo = garo + "*";
		}
		for (int i = 0; i < b; i++) {
			System.out.println(garo);
		}

	}

}