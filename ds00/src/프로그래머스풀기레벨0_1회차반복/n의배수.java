package 프로그래머스풀기레벨0_1회차반복;



public class n의배수 {

	public static void main(String[] args) {
		Solution43 sol = new Solution43();
		int n = 70;
		int num = 1;

		int answer = sol.solution(num, n);
		System.out.println(answer);

	}
}

class Solution43 {
	 public int solution(int num, int n) {
	        int answer = 0;
	        if(num%n == 0){
	            answer =1;
	        }
	        return answer;
	    }
}