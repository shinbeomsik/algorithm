
package 프로그래머스풀기레벨0;
import java.util.*;

public class 순서쌍의개수 {

	public static void main(String[] args) {
		Solution15 sol = new Solution15();
		int n = 100;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution15 {
	 public int solution(int n) {
	        int answer = 0;
	        for(int i=1; i<=n;i++) {
	        	if(n%i==0) {
	        		answer++;
	        	}
	        }
	        return answer;
	    }
}