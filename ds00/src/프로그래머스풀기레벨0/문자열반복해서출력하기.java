package 프로그래머스풀기레벨0;
import java.util.Scanner;


public class 문자열반복해서출력하기 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
        	System.out.print(str);
        }
    }
}  

