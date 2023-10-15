package 프로그래머스풀기레벨1_1회차반복;


public class 콜라문제 {

	public static void main(String[] args) {
		Solution43 sol = new Solution43();
		int a =1; 
		int b =1;
		int n =1;

		int answer = sol.solution(a, b, n);
		System.out.println(answer);

	} 
}

class Solution43 {
	public int solution(int a, int b, int n) {
        int answer = 0;
        while (n / a > 0) { 
			answer += (n / a) * b;  
			n = (n / a) * b + n % a;
		}
        return answer;
    }
}