package 프로그래머스풀기레벨0_1회차반복;

public class 다음에올숫자 {

	public static void main(String[] args) {
		Solution161 sol = new Solution161();
		int[] common = {};

		int answer = sol.solution(common);
		System.out.println(answer);

	}
}

class Solution161 {
	public int solution(int[] common) {
		int answer = 0;

		if ((common[1] - common[0]) == (common[2] - common[1])
				&& (common[2] - common[0] == (common[1] - common[0]) * 2)) {
			answer = common[common.length - 1] + (common[1] - common[0]);
		} else if ((common[1] / common[0] == common[2] / common[1]) && (common[2] % common[0] == 0)) {
			answer = common[common.length - 1] * (common[1] / common[0]);
		}

		return answer;
	}
}