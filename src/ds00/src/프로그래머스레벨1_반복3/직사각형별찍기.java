package 프로그래머스레벨1_반복3;

import java.util.Scanner;

class Solution23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String k = "";
        for(int i=0;i<a;i++){
            k = k + "*";
        }
       
        for(int i=0;i<b;i++){
            System.out.println(k);
        }
    }
}