package 프로그래머스풀기레벨0_1회차반복;



public class 이진수더하기 {

	public static void main(String[] args) {
		Solution160 sol = new Solution160();
		String bin1 = "";
		String bin2 = "";

		String answer = sol.solution(bin1, bin2);
		System.out.println(answer);

	}
}

class Solution160 {
	 public String solution(String bin1, String bin2) {
	        String answer = 
	            Integer.toBinaryString(Integer.parseInt(bin1, 2)+(Integer.parseInt(bin2, 2)));;

	        return answer;
	    }
}