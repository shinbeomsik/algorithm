package 프로그래머스풀기레벨0_1회차반복;

import java.util.Scanner;


public class 문자열돌리기 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}

