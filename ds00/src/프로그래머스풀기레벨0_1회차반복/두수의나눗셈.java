package 프로그래머스풀기레벨0_1회차반복;

public class 두수의나눗셈 {

	public static void main(String[] args) {
		Solution9 sol = new Solution9();
		int num1 =3; 
		int num2 =2;

		int answer = sol.solution(num1, num2);
		System.out.println(answer);

	}
}

class Solution9 {
	  public int solution(int num1, int num2) {
	        int answer = 0;
	        double a = (double)num1/num2 *1000;
	        answer = (int)a ;
	        return answer;
	    }
}