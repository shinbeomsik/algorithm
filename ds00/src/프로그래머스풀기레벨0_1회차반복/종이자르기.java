package 프로그래머스풀기레벨0_1회차반복;



public class 종이자르기 {

	public static void main(String[] args) {
		Solution182 sol = new Solution182();
		int M = 1; 
		int N = 1;

		int answer = sol.solution(M, N);
		System.out.println(answer);

	}
}

class Solution182 {
	public int solution(int M, int N) {
        int answer = M*N -1;
        return answer;
    }
}