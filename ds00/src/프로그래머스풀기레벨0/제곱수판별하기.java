
package 프로그래머스풀기레벨0;

public class 제곱수판별하기 {

	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		int n = 144;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}  

class Solution56 {
	 public int solution(int n) {
	        int answer = 2;
	        
	        for(int i=1; i<=1000;i++) {
	        	if(Math.pow(i,2)==n) {  //Math.pow(i,2) 이거는 i의 제곱이 무엇인지 구해줌
	        		answer = 1;
	        	}
	        }
	        
	        return answer;
	    }
}