package 프로그래머스풀기레벨0;

import java.util.*;
public class 유한소수판별하기 {

	public static void main(String[] args) {
		Solution170 sol = new Solution170();
		int a =12; 
		int b =21;

		int answer = sol.solution(a, b);
		System.out.println(answer);

	}
}  

class Solution170 {
	public int solution(int a, int b) {
        int answer = 0;
        
        int c = a;
        int d = b;
        if(c>d) {
        	for(int i=1;i<=a;i++) {
        		if(c%i==0 &&d%i==0) {
        			c = c/i;
        			d = d/i;
        		}
        	}
        }
        
        System.out.println(c);
        System.out.println(d);
        return answer;
    }
}