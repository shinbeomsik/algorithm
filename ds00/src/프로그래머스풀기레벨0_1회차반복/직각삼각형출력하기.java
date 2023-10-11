package 프로그래머스풀기레벨0_1회차반복;

import java.util.Scanner;

public class 직각삼각형출력하기 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "*";
        for(int i=0;i<n;i++){
            System.out.println(a);
            a = a + "*";
        }

    }
}
