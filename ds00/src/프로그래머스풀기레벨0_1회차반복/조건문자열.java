package 프로그래머스풀기레벨0_1회차반복;



public class 조건문자열 {

	public static void main(String[] args) {
		Solution177 sol = new Solution177();
		String ineq = "";
		String eq = "";
		int n = 1;
		int m =1;

		int answer = sol.solution(ineq, eq, n, m);
		System.out.println(answer);

	}
}

class Solution177 {
	 public int solution(String ineq, String eq, int n, int m) {
	        int answer = 0;
	        
	        if(ineq.equals(">")){
	            if(eq.equals("=")){
	                if(n>=m){
	                    answer = 1;
	                }
	            }else {
	                if(n>m){
	                    answer =1;
	                }
	            }
	        }else{
	            if(eq.equals("=")){
	                if(n<=m){
	                    answer = 1;
	                }
	            }else {
	                if(n<m){
	                    answer =1;
	                }
	            }
	        }
	        
	        return answer;
	    }
}