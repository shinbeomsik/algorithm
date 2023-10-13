package 프로그래머스풀기레벨0_1회차반복;



public class 문자리스트를문자열로변환하기 {

	public static void main(String[] args) {
		Solution121 sol = new Solution121();
		String[] arr = {};

		String answer = sol.solution(arr);
		System.out.println(answer);

	}
}

class Solution121 {
	  public String solution(String[] arr) {
	        String answer = String.join("",arr);
	        return answer;
	    }
}