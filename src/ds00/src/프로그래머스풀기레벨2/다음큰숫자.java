
package 프로그래머스풀기레벨2;


public class 다음큰숫자 {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int n = 5;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution4{
	
	
	int solution(int n) {
	    int answer = 0;
	    int[] k = new int[n+1];
	    k[0] = 0;
	    k[1] = 1;
	    for(int i=2; i<=n;i++) {
	    	k[i] = (k[i-1] + k[i-2])%1234567;
	    }
	    		
	    return k[n];
	}
}