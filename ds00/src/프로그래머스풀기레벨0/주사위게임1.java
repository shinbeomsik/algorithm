
package 프로그래머스풀기레벨0;

public class 주사위게임1 {

	public static void main(String[] args) {
		Solution47 sol = new Solution47();
		int a = 3;
		int b = 5;

		int answer = sol.solution(a, b);
		System.out.println(answer);

	}
}  

class Solution47 {
	
	public int solution(int a, int b) {
        int answer = 0;
        if(a%2 !=0 && b%2 !=0 ) {
        	answer = a*a + b*b;
        }else if(a%2 ==0  &&b%2 !=0) {
        	answer = 2*(a+b);
        }else if(a%2 !=0  &&b%2 ==0) {
        	answer = 2*(a+b);
        }else if(a%2 == 0 && b%2 ==0) {
        	if(a>b) {
        		answer = a-b;
        	}else if(a<b) {
        		answer = b-a;
        	}
        }
        return answer;
    }
}