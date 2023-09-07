
package 프로그래머스풀기레벨0;

public class 세균증식 {

	public static void main(String[] args) {
		Solution60 sol = new Solution60();
		int n = 7;
		int t = 15;

		int answer = sol.solution(n, t);
		System.out.println(answer);

	}
}  

class Solution60 {
	 public int solution(int n, int t) {
		  int answer = n;
		  
		  for(int i=0;i<t;i++) {
			  answer = answer*2;
		  }
		  
	        return answer;
	    }
}