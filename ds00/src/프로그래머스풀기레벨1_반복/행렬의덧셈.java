package 프로그래머스풀기레벨1_반복;

import java.util.Scanner;

public class 행렬의덧셈 {

}

class Solution26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String k = "*";
        for(int i=1;i<a;i++){
            k = k + "*";
        }
        for(int i=0;i<b;i++){
                System.out.println(k);
        }
        
    }
}