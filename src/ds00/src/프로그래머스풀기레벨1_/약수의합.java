package 프로그래머스풀기레벨1_;



public class 약수의합 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int n = 70;

		int answer = sol.solution(n);
		System.out.println(answer);

	} 
}

class Solution3 {
	 public int solution(int n) {
	        int answer = 0;
	        for(int i=1;i <=n ;i++){
	            if(n%i ==0){
	                answer += i;
	            }
	        }
	        return answer;
	    }
}