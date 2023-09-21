package 프로그래머스풀기레벨0;

import java.math.BigInteger;

public class 두수의합 {

	public static void main(String[] args) {
		Solution130 sol = new Solution130();
		String a = "18446744073709551615"; 
		String b = "287346502836570928366";

		String answer = sol.solution(a, b);
		System.out.println(answer);

	}
}  

class Solution130 {
	 public String solution(String a, String b) {
		 BigInteger num1 = new BigInteger(a);
	        BigInteger num2 = new BigInteger(b);
	        
	        BigInteger sum = num1.add(num2);
	        String answer = sum.toString();
	        return answer;
	    }
}