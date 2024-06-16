package 프로그래머스레벨1_4;
import java.util.Scanner;

public class 직사각형별찍기 {
	   
}

class Solution28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String star = "";
        for(int i=0;i<a;i++){
            star = star + "*";
        }
        
        for(int j=0;j<b;j++){
            System.out.println(star);
        }
   
    }
}