package 프로그래머스풀기레벨0_1회차반복;



public class 개미군단 {

	public static void main(String[] args) {
		Solution99 sol = new Solution99();
		int hp = 70;

		int answer = sol.solution(hp);
		System.out.println(answer);

	}
}

class Solution99 {
	  public int solution(int hp) {
	        int answer = 0;
	        int hps =0;
	        
	        answer = hp/5;
	        hps = hp%5;
	        
	        answer = answer + hps/3;
	        hps = hps%3;
	        
	        answer = answer + hps/1;
	        return answer;
	    }
}