package 프로그래머스풀기레벨0_1회차반복;



public class 주사위게임2 {

	public static void main(String[] args) {
		Solution126 sol = new Solution126();
		int a =1;  
		int b =1;
		int c =1;

		int answer = sol.solution(a, b, c);
		System.out.println(answer);

	}
}

class Solution126 {
	 public int solution(int a, int b, int c) {
	        int answer = 0;
	        if(a != b && b != c && c != a){
	            answer = a+b+c;
	        }else if((a ==b && b !=c) || (b==c && c !=a) || (c ==a && a !=b)){
	            answer = (a*a + b*b + c*c)*(a+b+c);
	        }else if(a == b && b ==c){
	            answer = (a + b + c)*(a*a + b*b + c*c) *(a*a*a + b*b*b + c*c*c);
	        }
	        return answer;
	    }
}