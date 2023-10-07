package 프로그래머스풀기레벨0_1회차반복;



public class 제곱수판별하기 {

	public static void main(String[] args) {
		Solution40 sol = new Solution40();
		int n = 70;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution40 {
	 public int solution(int n) {
	        int answer = 2;
	        if(Math.sqrt(n)%1 == 0){
	            answer  = 1;
	        }
	        return answer;
	    }
}