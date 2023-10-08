package 프로그래머스풀기레벨0_1회차반복;



public class 문자열정수의합 {

	public static void main(String[] args) {
		Solution63 sol = new Solution63();
		String num_str = "";

		int answer = sol.solution(num_str);
		System.out.println(answer);

	}
}

class Solution63 {
	 public int solution(String num_str) {
	        int answer = 0;
	        String[] arr = num_str.split("");
	        for(int i=0;i<arr.length;i++){
	            answer = answer + Integer.parseInt(arr[i]);
	        }
	        return answer;
	    }
}