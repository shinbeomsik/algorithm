package 프로그래머스풀기레벨0;

public class 삼각형의완성조건2 {

	public static void main(String[] args) {
		Solution133 sol = new Solution133();
		int[] sides = { 3,3};

		int answer = sol.solution(sides);
		System.out.println(answer);

	}
}

class Solution133 {
	public int solution(int[] sides) {
		int answer = 0;

		if (sides[0] > sides[1]) {
			for (int i = sides[0] - sides[1]+1; i <= sides[0]; i++) {
				answer++;
				System.out.println(i + "a");
			}
			for (int i = sides[0] + 1; i < sides[0] + sides[1]; i++) {
				answer++;
				System.out.println(i + "A");
			}
		} else if (sides[0] < sides[1]) {
			for (int i = sides[1] - sides[0]+1; i <= sides[1]; i++) {
				answer++;
				System.out.println(i +"b");
			}
			for (int i = sides[1] + 1; i < sides[0] + sides[1]; i++) {
				answer++;
				System.out.println(i +"B");
			}
		} else if (sides[0] == sides[1]) {
			for (int i = sides[0] ; i < sides[0] + sides[1]; i++) {
				answer++;
				System.out.println(i + "c");
			}
			for(int i=1; i<sides[0];i++) {
				answer++;
				System.out.println(i + "C");
			}
		}

		return answer;
	}
}