package 프로그래머스풀기레벨0;


public class 주사위게임2 {

	public static void main(String[] args) {
		Solution82 sol = new Solution82();
		int a = 4;
		int b = 4;
		int c = 4;

		int answer = sol.solution(a, b, c);
		System.out.println(answer);

	}
}  

class Solution82 {
	public int solution(int a, int b, int c) {
        int answer = 0;
        if(a != b && b !=c && c !=a) {
        	answer = a + b + c;
        }else if((a == b && c != a) || (b == c && a != c) || (c==a && a !=b)) {
        	answer = (a+b+c)*(a*a + b*b + c*c);
        }else if(a == b && b ==c) {
        	answer = (a+b+c)*(a*a + b*b + c*c)*(a*a*a + b*b*b + c*c*c) ;
        }
        return answer;
    }
}