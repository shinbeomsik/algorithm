package 프로그래머스풀기레벨0;


public class 두수의연산값비교하기 {

	public static void main(String[] args) {
		Solution76 sol = new Solution76();
		int a = 2;
		int b = 91;

		int answer = sol.solution(a, b);
		System.out.println(answer);

	}
}  

class Solution76 {
    public int solution(int a, int b) {
        int answer = 0;
        if(Integer.parseInt("" + a + b) >= 2* a*b) {
        	answer =  Integer.parseInt("" + a + b);
        }else {
        	answer = 2*a*b;
        }
        return answer;
    }
}