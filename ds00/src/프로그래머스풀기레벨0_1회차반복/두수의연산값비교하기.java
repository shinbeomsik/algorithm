package 프로그래머스풀기레벨0_1회차반복;



public class 두수의연산값비교하기 {

	public static void main(String[] args) {
		Solution112 sol = new Solution112();
		int a = 70;
		int b = 1;
		int answer = sol.solution(a, b);
		System.out.println(answer);

	}
}

class Solution112 {
	 public int solution(int a, int b) {
	        int answer = 0;
	        int p = 2*a*b;
	        
	        String k = Integer.toString(a) + Integer.toString(b);
	        int q = Integer.parseInt(k);
	        if(p > q){
	            answer = p;
	        }else{
	            answer = q;
	        }
	        return answer;
	    }
}