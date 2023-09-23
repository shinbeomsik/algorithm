package 프로그래머스풀기레벨0;


public class 종이자르기 {

	public static void main(String[] args) {
		Solution140 sol = new Solution140();
		int M = 3;
		int N = 5;

		int answer = sol.solution(M, N);
		System.out.println(answer);

	}
}  

class Solution140 {
	 public int solution(int M, int N) {
	        int answer = M*N-1;
	        
	        return answer;
	    }
}