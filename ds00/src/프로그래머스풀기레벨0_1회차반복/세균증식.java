package 프로그래머스풀기레벨0_1회차반복;



public class 세균증식 {

	public static void main(String[] args) {
		Solution41 sol = new Solution41();
		int n = 1; 
		int t = 1;

		int answer = sol.solution(n, t);
		System.out.println(answer);

	}
}

class Solution41 {
	   public int solution(int n, int t) {
	        int answer = n;
	        for(int i=0;i<t;i++){
	            answer = answer * 2;
	        }
	     
	        return answer;
	    }
}