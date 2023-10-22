package 프로그래머스풀기레벨0_1회차반복;

import java.math.BigInteger;

public class 두_수의합 {

	public static void main(String[] args) {
		Solution174 sol = new Solution174();
		String a = ""; 
		String b = "";

		String answer = sol.solution(a, b);
		System.out.println(answer);

	}
}

class Solution174 {
	 public String solution(String a, String b) {
	        String answer = "";
	  
	        BigInteger bigA = new BigInteger(a);
	        BigInteger bigB = new BigInteger(b);

	        BigInteger k = bigA.add(bigB);
	        answer = k.toString();
	        return answer;
	    }
}