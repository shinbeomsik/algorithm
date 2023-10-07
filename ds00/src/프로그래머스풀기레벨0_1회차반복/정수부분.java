package 프로그래머스풀기레벨0_1회차반복;



public class 정수부분 {

	public static void main(String[] args) {
		Solution51 sol = new Solution51();
		int flo = 70;

		int answer = sol.solution(flo);
		System.out.println(answer);

	}
}

class Solution51 {
	public int solution(double flo) {
        int answer = (int)flo;
        return answer;
    }
}