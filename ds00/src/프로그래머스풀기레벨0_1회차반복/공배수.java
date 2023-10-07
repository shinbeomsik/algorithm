package 프로그래머스풀기레벨0_1회차반복;



public class 공배수 {

	public static void main(String[] args) {
		Solution44 sol = new Solution44();
		int number = 1;
		int n =1;
		int m =1;

		int answer = sol.solution(number, n, m);
		System.out.println(answer);

	}
}

class Solution44 {
	 public int solution(int number, int n, int m) {
	        int answer = 0;
	        if(number%n ==0 && number%m ==0){
	            answer = 1;
	        }
	        return answer;
	    }
}