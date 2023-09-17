package 프로그래머스풀기레벨0;


public class 간단한논리연산 {

	public static void main(String[] args) {
		Solution110 sol = new Solution110();
		boolean x1 = true; 
		boolean x2 = false;
		boolean x3 = false;
		boolean x4 = false;

		boolean answer = sol.solution(x1, x2, x3, x4);
		System.out.println(answer);

	}
}  

class Solution110 {
	 public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
	        boolean answer = false;
	        boolean x12 = true;
	        boolean x34 = true;
	        
	        if(x1 == false && x2 ==false) {
	        	x12 = false;
	        }
	        if(x3== false && x4 ==false) {
	        	x34 = false;
	        }
	        if(x12 == true && x34 == true) {
	        	answer = true;
	        }
	       
	        return answer;
	    }
}