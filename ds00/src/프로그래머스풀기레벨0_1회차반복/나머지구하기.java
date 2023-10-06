package 프로그래머스풀기레벨0_1회차반복;

public class 나머지구하기 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int num1 = 3;
		int num2 = 2;
		
		int answer = sol.solution(num1, num2);
		System.out.println(answer);

	}
}

class Solution3 {
	 public int solution(int num1, int num2) {
	        int answer = -1;
	        
	        answer = num1%num2;
	        
	        return answer;
	    }
}