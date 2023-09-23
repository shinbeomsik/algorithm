package 프로그래머스풀기레벨0;


public class 조건문자열 {

	public static void main(String[] args) {
		Solution136 sol = new Solution136();
		String ineq = ">"; 
		String eq = "!";
		int n = 41;
		int m = 78;

		int answer = sol.solution(ineq, eq, n, m);
		System.out.println(answer);

	}
}  

class Solution136 {
	public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals("<") && eq.equals("=")) {
        	if(n<=m) {
        		answer=1;
        	}else {
        		answer=0;
        	}
        }else if(ineq.equals("<") && eq.equals("!")) {
        	if(n<m) {
        		answer=1;
        	}else {
        		answer=0;
        	}
        }else if(ineq.equals(">") && eq.equals("=")) {
        	if(n>=m) {
        		answer=1;
        	}else {
        		answer=0;
        	}
        }else if(ineq.equals(">") && eq.equals("!")) {
        	if(n>m) {
        		answer=1;
        	}else {
        		answer=0;
        	}
        }
        return answer;
    }
}