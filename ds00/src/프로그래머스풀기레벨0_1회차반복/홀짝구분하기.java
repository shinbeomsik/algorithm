package 프로그래머스풀기레벨0_1회차반복;

import java.util.Scanner;

public class 홀짝구분하기 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        if(n %2 ==0){
	            System.out.print(n + " is even");
	        }else{
	             System.out.print(n + " is odd");
	        }
	    }
}
