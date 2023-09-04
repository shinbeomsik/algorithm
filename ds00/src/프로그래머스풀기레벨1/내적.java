
package 프로그래머스풀기레벨1;


public class 내적 {

	public static void main(String[] args) {
		Solution17 sol = new Solution17();
		int[] a = {1,2,3,4}; 
		int[] b = {-3,-1,0,2};

		int answer = sol.solution(a, b);
		System.out.println(answer);

	}
}

class Solution17 {
	public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0; i<a.length;i++) {
        	answer = answer + a[i]*b[i];
        }
        return answer;
    }
}