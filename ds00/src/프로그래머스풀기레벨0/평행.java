package 프로그래머스풀기레벨0;

public class 평행 {

	public static void main(String[] args) {
		Solution159 sol = new Solution159();
		int[][] dots = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 4, 5 } };

		int answer = sol.solution(dots);
		System.out.println(answer);

	}
}
//기울기가 정수가 아닌 소수점이있을수도 있다!!!
class Solution159 {
	public int solution(int[][] dots) {
		int answer = 0;

		if ((dots[0][1] - dots[1][1])/(dots[0][0] - dots[1][0]) + 
				(dots[0][1] - dots[1][1])%(dots[0][0] - dots[1][0])
				== 
				(dots[2][1] - dots[3][1])/(dots[2][0] - dots[3][0])+
				(dots[2][1] - dots[3][1])%(dots[2][0] - dots[3][0])) {
			answer = 1;
		} else if ((dots[0][1] - dots[2][1])/(dots[0][0] - dots[2][0])+
				(dots[0][1] - dots[2][1])%(dots[0][0] - dots[2][0])
				== 
				(dots[1][1] - dots[3][1])/(dots[1][0] - dots[3][0])+
				(dots[1][1] - dots[3][1])%(dots[1][0] - dots[3][0])) {
			answer = 1;
		} else if ((dots[0][1] - dots[3][1])/(dots[0][0] - dots[3][0])+ 
				(dots[0][1] - dots[3][1])%(dots[0][0] - dots[3][0])
				== 
				(dots[1][1] - dots[2][1])/(dots[1][0] - dots[2][0])+
				(dots[1][1] - dots[2][1])%(dots[1][0] - dots[2][0])) {
			answer = 1;
		}
		return answer;
	}
}