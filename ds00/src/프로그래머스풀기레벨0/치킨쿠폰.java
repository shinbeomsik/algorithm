package 프로그래머스풀기레벨0;


public class 치킨쿠폰 {

	public static void main(String[] args) {
		Solution145 sol = new Solution145();
		int chicken = 1081;

		int answer = sol.solution(chicken);
		System.out.println(answer);

	}
} 

class Solution145 {
	 public int solution(int chicken) {
	        int answer = 0;
	        
	        while(chicken > 9) {
	        	answer = answer + chicken/10;
	        	
	        	int service = chicken/10;
	        	int leftcoupon = chicken%10;
	        	chicken = leftcoupon + service;
	        	
	        }
	        return answer;
	    }
}