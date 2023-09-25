package 프로그래머스풀기레벨0;


public class 저주의숫자3 {

	public static void main(String[] args) {
		Solution147 sol = new Solution147();
		int n = 15;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}  

class Solution147 {
	 public int solution(int n) {
	        int answer = 0;
	        
	        for(int i=1;i<=n;i++) {
	        	answer++;
	        	String s = Integer.toString(answer);
	        	while(s.contains("3")|| answer%3 ==0) {
	        		answer++;
	        		s = Integer.toString(answer);
	        	}
	        }
	        
	        return answer;
	    }
}