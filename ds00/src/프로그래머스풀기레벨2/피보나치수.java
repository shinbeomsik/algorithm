
package 프로그래머스풀기레벨2;


public class 피보나치수 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int n = 15;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution3 {
	int solution(int n) {
	    int answer = 0;
	    	
	    for(int i=1; i<=n;i++) {
	    	int sum = (i*(i+1))/2;
	    	if(sum > n) {
	    		break;
	    	}
	    	if((n-sum)%i==0) {
	    		answer++;
	    	}
	    	
	    }
	    return answer;
	}
}