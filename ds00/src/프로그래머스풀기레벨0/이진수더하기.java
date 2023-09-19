package 프로그래머스풀기레벨0;


public class 이진수더하기 {

	public static void main(String[] args) {
		Solution119 sol = new Solution119();
		String bin1 = "1001"; 
		String bin2 = "1111";

		String answer = sol.solution(bin1, bin2);
		System.out.println(answer);

	}
}  

/*
 * 1) 10진수를 2진수로 변환 할 때,
 * 
 * Integer 클래스의 toBinaryString 함수를 사용하면 해당 숫자를 2진수로 변환할 수 있다.
 * 
 * ex. Integer.toBinaryString(int i);
 * 
 * 
 * 
 * 2) 또한, 2진수를 10진수로 변환하기 위해서는,
 * 
 * Integer 클래스의 parseInt를 사용하여 변환할 수 있다.
 * 
 * ex. Integer.parseInt(String s, int n진수);
 * 
 * 
 *   1.  Integer.parseInt(bin1, 2)   ->  2진수형태의 bin1을 10진수로 변환

  	 2.  Integer.parseInt(bin2, 2)   ->  2진수형태의 bin2을 10진수로 변환
	
  	 3.  Integer.toBinaryString(A + B)  ->  10진수형태의  A와 B를 더한 값을 2진수로 변환.
 */

class Solution119 {
	 public String solution(String bin1, String bin2) {
	        String answer = "";
	        answer = Integer.toBinaryString(Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2));
	        return answer;
	    }
}