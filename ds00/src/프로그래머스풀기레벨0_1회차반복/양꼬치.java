package 프로그래머스풀기레벨0_1회차반복;

public class 양꼬치 {

	public static void main(String[] args) {
		Solution13 sol = new Solution13();
		int n = 10;
		int k = 3;

		int answer = sol.solution(n, k);
		System.out.println(answer);

	}
}

class Solution13 {
	   public int solution(int n, int k) {
	        int answer = 0;
	        answer = n*12000 + (k - n/10)*2000;
	        return answer;
	    }
}