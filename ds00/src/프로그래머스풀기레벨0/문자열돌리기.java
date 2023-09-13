package 프로그래머스풀기레벨0;

import java.util.Scanner;

public class 문자열돌리기 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0; i<a.length(); i++){
            System.out.println(a.charAt(i));
        }
    }
}  


//시간 차이가 많이날줄 알았는데 별로 나지않음


/*
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 * String a = sc.next(); String[] arr = a.split(""); for(int
 * i=0;i<arr.length;i++) { System.out.println(arr[i]); } }
 */