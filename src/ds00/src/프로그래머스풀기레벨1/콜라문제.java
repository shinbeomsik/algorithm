
package 프로그래머스풀기레벨1;

public class 콜라문제 {

	public static void main(String[] args) {
		Solution38 sol = new Solution38();
		int a = 2;
		int b = 1;
		int n = 20;

		int answer = sol.solution(a, b, n);
		System.out.println(answer);

	}
}

class Solution38 {
	public int solution(int a, int b, int n) {
		int answer = 0;

		while (n / a > 0) { 
			answer += (n / a) * b;  
			n = (n / a) * b + n % a;
		}

		return answer;
	}
}