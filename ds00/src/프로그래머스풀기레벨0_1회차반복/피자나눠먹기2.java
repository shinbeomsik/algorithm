package 프로그래머스풀기레벨0_1회차반복;



public class 피자나눠먹기2 {

	public static void main(String[] args) {
		Solution124 sol = new Solution124();
		int n = 70;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution124 {
	 public int solution(int n) {
	        int answer = 0;
	        
	       for (int i = 1; i <= 6 * n; i++) {
	            if (6 * i % n == 0) {
	                answer = i;
	                break;
	            }
	        }   
	          
	        
	        return answer;
	    }
}